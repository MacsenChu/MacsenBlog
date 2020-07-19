package xyz.macsen.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.article.mapper.TagMapper;
import xyz.macsen.article.pojo.Tag;
import xyz.macsen.article.service.TagService;
import xyz.macsen.article.vo.TagCloud;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;

import java.util.ArrayList;
import java.util.List;


@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;


    /**
     * 查询所有标签
     * @return
     */
    @Override
    public List<Tag> findAll() {
        List<Tag> tags = tagMapper.selectAll();
        if (CollectionUtils.isEmpty(tags)) {
            throw  new BlogException(ExceptionEnum.TAG_NOT_FOUND);
        }
        return tags;
    }

    /**
     * 查询标签云
     * @return
     */
    @Override
    public List<TagCloud> findAllTagCloud() {

        List<Tag> tags = this.findAll();

        List<TagCloud> tagsCloud = new ArrayList<>();
        for (Tag tag : tags) {
            TagCloud tagCloud = new TagCloud();
            tagCloud.setText(tag.getTag());
            tagCloud.setWeight(tag.getCount());

            tagsCloud.add(tagCloud);
        }

        return tagsCloud;
    }

    /**
     * 获取TOP10标签
     * @return
     */
    @Override
    public List<Tag> findTopTogs() {
        List<Tag> tags = tagMapper.findTop10();
        if (CollectionUtils.isEmpty(tags)) {
            throw new BlogException(ExceptionEnum.TAG_NOT_FOUND);
        }
        return tags;
    }
}
