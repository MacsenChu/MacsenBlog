package xyz.macsen.article.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import xyz.macsen.article.mapper.ArticleCommentMapper;
import xyz.macsen.article.mapper.ArticleMapper;
import xyz.macsen.article.mapper.ArticleReplyMapper;
import xyz.macsen.article.pojo.*;
import xyz.macsen.article.service.ArticleService;
import xyz.macsen.article.utils.MarkdownUtils;
import xyz.macsen.article.pojo.PublishStatistics;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.common.vo.PageResult;

import java.util.*;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticleCommentMapper articleCommentMapper;

    @Autowired
    private ArticleReplyMapper articleReplyMapper;

    /**
     * 文章列表分页查询
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Article> findByPage(Integer limit, Integer offset) {
        List<Article> articleList = articleMapper.findByPage(limit, offset);
        if (CollectionUtils.isEmpty(articleList)) {
            throw new BlogException(ExceptionEnum.ARTICLE_NOT_FOUND);
        }
        return articleList;
    }

    /**
     * 文章详细查询
     * @param id
     * @return
     */
    @Override
    public Article findById(Integer id) {
        Article article = articleMapper.findById(id);

        if (article == null) {
            throw new BlogException(ExceptionEnum.ARTICLE_NOT_FOUND);
        }
        article.setContent(MarkdownUtils.markdownToHtmlExtensions(article.getContent()));

        List<ArticleComment> comments = articleCommentMapper.findCommentByArticleId(article.getId());
        if (!CollectionUtils.isEmpty(comments)) {
            article.setComments(comments);
        }

        List<Article> preAndNextArticle = findPreAndNextArticle(article.getId());
        if (!CollectionUtils.isEmpty(preAndNextArticle)) {
            article.setPreAndNextArticle(preAndNextArticle);
        }

        return article;
    }

    /**
     * 文章评论与回复查询
     * @param articleId
     * @return
     */
    @Override
    public List<ArticleComment> findCommentByArticleId(Integer articleId) {
        return articleCommentMapper.findCommentByArticleId(articleId);
    }

    /**
     * 查找当前文章的上一篇和下一篇
     * @param articleId
     * @return
     */
    @Override
    public List<Article> findPreAndNextArticle(Integer articleId) {
        List<Article> preAndNextArticle = new ArrayList<>();
        Article articlePre = articleMapper.findPreArticle(articleId);

        // 没有上一页和下一页 那么就显示本页
        if (articlePre == null) {
            articlePre = articleMapper.selectByPrimaryKey(articleId);
        }

        Article articleNext = articleMapper.findNextArticle(articleId);
        if (articleNext == null) {
            articleNext = articleMapper.selectByPrimaryKey(articleId);
        }

        Collections.addAll(preAndNextArticle, articlePre, articleNext);
        return preAndNextArticle;
    }

    /**
     * 评论文章
     * @param articleInputComment
     */
    @Override
    @Transactional
    public void addComment(ArticleInputComment articleInputComment) {

        if (articleInputComment.getReplyType() == null) {
            ArticleComment articleComment = new ArticleComment();
            BeanUtils.copyProperties(articleInputComment, articleComment);
            articleComment.setComment(articleInputComment.getContent());
            articleCommentMapper.insertSelective(articleComment);
        } else {
            ArticleReply articleReply = new ArticleReply();
            BeanUtils.copyProperties(articleInputComment, articleReply);
            articleReply.setFromName(articleInputComment.getName());
            articleReply.setComment(articleInputComment.getContent());
            articleReplyMapper.insertSelective(articleReply);
        }
        articleMapper.updateCommentsCount(articleInputComment.getArticleId());
    }

    /**
     * 文章点赞/取消点赞
     * @param articleId
     * @param isCharge
     */
    @Override
    @Transactional
    public void handleLike(Integer articleId, Boolean isCharge) {
        if (isCharge) {
            articleMapper.articleUnLike(articleId);
        } else {
            articleMapper.articleLike(articleId);
        }
    }

    /**
     * 根据分类id查找文章列表
     * @param categoryId
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public PageResult<Article> findByCategoryId(Integer categoryId,  Integer limit, Integer offset) {
        Long count = articleMapper.count();

        List<Article> articleList = articleMapper.findByCategoryId(categoryId, limit, offset);

        if (CollectionUtils.isEmpty(articleList)) {
            throw new BlogException(ExceptionEnum.ARTICLE_NOT_FOUND);
        }

        return new PageResult<Article>(count, articleList);
    }

    /**
     * 查询文章归档信息
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public Archives findArchives(Integer limit, Integer offset) {
        Long count = articleMapper.count();
        List<Article> articleList = articleMapper.findByPage(limit, offset);
        if (CollectionUtils.isEmpty(articleList)) {
            throw new BlogException(ExceptionEnum.ARTICLE_NOT_FOUND);
        }

        LinkedHashMap<String, Map<String, List<Article>>> articleGroupByYear = new LinkedHashMap<>();

        for (Article article : articleList) {
            String year = article.getUpdateTime().getYear() + "年";
            if (!articleGroupByYear.containsKey(year)) {
                LinkedHashMap<String, List<Article>> articleGroupByMonth = new LinkedHashMap<>();
                articleGroupByYear.put(year, articleGroupByMonth);
            }

            String month = article.getUpdateTime().getMonthValue() + "月";
            if (!articleGroupByYear.get(year).containsKey(month)) {
                List<Article> articles = new ArrayList<>();
                articleGroupByYear.get(year).put(month, articles);
            }

            articleGroupByYear.get(year).get(month).add(article);
        }

        return new Archives(count, articleGroupByYear);
    }

    /**
     * 文章详细查询
     * @param id
     * @return
     */
    @Override
    public List<PublishStatistics> findPublishStatistics() {
        List<PublishStatistics> publishStatistics = articleMapper.findPublishStatistics();
        if (CollectionUtils.isEmpty(publishStatistics)) {
            throw new BlogException(ExceptionEnum.PUBLISHSTATISTICS_NOT_FOUND);
        }
        return publishStatistics;
    }

}
