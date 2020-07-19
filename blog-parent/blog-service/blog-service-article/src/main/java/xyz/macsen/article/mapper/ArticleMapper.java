package xyz.macsen.article.mapper;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import xyz.macsen.article.pojo.Article;
import xyz.macsen.article.pojo.PublishStatistics;

import java.util.List;

public interface ArticleMapper extends Mapper<Article> {

    List<Article> findByPage(Integer limit, Integer offset);

    Article findById(Integer id);

    Article findPreArticle(Integer id);

    Article findNextArticle(Integer id);

    void updateCommentsCount(Integer articleId);

    void articleLike(Integer id);

    void articleUnLike(Integer id);

    List<Article> findByCategoryId(@Param("categoryId") Integer categoryId, @Param("limit") Integer limit, @Param("offset") Integer offset);

    Long count();

    List<PublishStatistics> findPublishStatistics();
}
