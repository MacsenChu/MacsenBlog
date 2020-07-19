package xyz.macsen.article.mapper;

import tk.mybatis.mapper.common.Mapper;
import xyz.macsen.article.pojo.Tag;

import java.util.List;

public interface TagMapper extends Mapper<Tag> {

    List<Tag> findByArticleId(Integer articleId);

    List<Tag> findTop10();
}
