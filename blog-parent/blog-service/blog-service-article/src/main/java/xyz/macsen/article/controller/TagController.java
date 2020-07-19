package xyz.macsen.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.article.pojo.Tag;
import xyz.macsen.article.service.TagService;
import xyz.macsen.article.vo.TagCloud;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping("/tags")
    public Result<List<Tag>> findAllTag() {
        List<Tag> tags = tagService.findAll();
        return new Result<List<Tag>>(true, StatusCode.OK, "获取标签列表成功", tags);
    }

    @GetMapping("/tagsCloud")
    public Result<List<TagCloud>> findAllTagCloud() {
        List<TagCloud> tagsCloud = tagService.findAllTagCloud();
        return new Result<List<TagCloud>>(true, StatusCode.OK, "标签云获取成功" ,tagsCloud);
    }

    @GetMapping("/topTags")
    public Result<List<Tag>> findTopTags() {
        List<Tag> tags = tagService.findTopTogs();
        return new Result<List<Tag>>(true, StatusCode.OK, "TOP10标签获取成功", tags);
    }
}
