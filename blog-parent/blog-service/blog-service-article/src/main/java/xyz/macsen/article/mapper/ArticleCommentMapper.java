package xyz.macsen.article.mapper;

import tk.mybatis.mapper.common.Mapper;
import xyz.macsen.article.pojo.ArticleComment;

import java.util.List;

public interface ArticleCommentMapper extends Mapper<ArticleComment> {

    List<ArticleComment> findCommentByArticleId(Integer articleId);
}
