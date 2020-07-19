package xyz.macsen.article.service;

import xyz.macsen.article.pojo.Tag;
import xyz.macsen.article.vo.TagCloud;

import java.util.List;

public interface TagService {

    /**
     * 查询所有标签
     * @return
     */
    List<Tag> findAll();

    /**
     * 查询标签云
     * @return
     */
    List<TagCloud> findAllTagCloud();

    /**
     * 获取TOP10标签
     * @return
     */
    List<Tag> findTopTogs();
}
