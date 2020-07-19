package xyz.macsen.article.service;

import xyz.macsen.article.pojo.Archives;
import xyz.macsen.article.pojo.Article;
import xyz.macsen.article.pojo.ArticleComment;
import xyz.macsen.article.pojo.ArticleInputComment;
import xyz.macsen.article.pojo.PublishStatistics;
import xyz.macsen.common.vo.PageResult;

import java.util.List;

public interface ArticleService {

    /**
     * 文章列表分页查询
     * @param limit
     * @param offset
     * @return
     */
    List<Article> findByPage(Integer limit, Integer offset);

    /**
     * 文章详细查询
     * @param id
     * @return
     */
    Article findById(Integer id);

    /**
     * 文章评论与回复查询
     * @param articleId
     * @return
     */
    List<ArticleComment> findCommentByArticleId(Integer articleId);

    /**
     * 查找当前文章的上一篇和下一篇
     * @param articleId
     * @return
     */
    List<Article> findPreAndNextArticle(Integer articleId);

    /**
     * 评论文章
     * @param articleInputComment
     */
    void addComment(ArticleInputComment articleInputComment);

    /**
     * 文章点赞/取消点赞
     * @param articleId
     * @param isCharge
     */
    void handleLike(Integer articleId, Boolean isCharge);

    /**
     * 根据分类Id查找文章列表
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult<Article> findByCategoryId(Integer categoryId, Integer limit, Integer offset);

    /**
     * 查询文章归档信息
     * @param limit
     * @param offset
     * @return
     */
    Archives findArchives(Integer limit, Integer offset);

    /**
     * 获取文章发布统计信息
     * @return
     */
    List<PublishStatistics> findPublishStatistics();
}
