package xyz.macsen.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.macsen.article.pojo.*;
import xyz.macsen.article.service.ArticleService;
import xyz.macsen.article.pojo.PublishStatistics;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.PageResult;
import xyz.macsen.common.vo.Result;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public Result<List<Article>> findArticleList(
            @RequestParam("limit") Integer limit,
            @RequestParam("offset") Integer offset) {
        List<Article> articleList = articleService.findByPage(limit, offset);
        return new Result<List<Article>>(true, StatusCode.OK, "文章列表获取成功", articleList);
    }

    @GetMapping("/{id}")
    public Result<Article> findArticleById(@PathVariable("id") Integer id) {
        Article article = articleService.findById(id);
        return new Result<Article>(true, StatusCode.OK, "文章详情获取成功", article);
    }

    @GetMapping("comments/{id}")
    public Result<List<ArticleComment>> findArticleCommentAndReply(@PathVariable("id") Integer id) {
        List<ArticleComment> commentByArticleId = articleService.findCommentByArticleId(id);
        return new Result<List<ArticleComment>>(true, StatusCode.OK, "文章评论获取成功", commentByArticleId);
    }

    @PostMapping("/comment")
    public Result<Void> postArticleComments(@RequestBody ArticleInputComment articleInputComment) {
        articleService.addComment(articleInputComment);
        return new Result<Void>(true, StatusCode.CREATED, "留言成功");
    }

    @PostMapping("/like")
    public Result<Void> articleLike(@RequestBody ArticleLike articleLike) {
        articleService.handleLike(articleLike.getArticleId(), articleLike.getIsCharge());
        return new Result<Void>(true, StatusCode.CREATED, "操作成功");
    }

    @GetMapping("/category")
    public Result<PageResult<Article>> findArticleByCategory(
            @RequestParam("categoryId") Integer categoryId,
            @RequestParam("limit") Integer limit,
            @RequestParam("offset") Integer offset) {
        PageResult<Article> articles = articleService.findByCategoryId(categoryId, limit, offset);
        return new Result<PageResult<Article>>(true, StatusCode.OK, "查询文章列表成功", articles);
    }

    @GetMapping("/archives")
    public Result<Archives> findArchives(
            @RequestParam("limit") Integer limit,
            @RequestParam("offset") Integer offset) {
        Archives archives = articleService.findArchives(limit, offset);
        return new Result<Archives>(true, StatusCode.OK, "查询文章归档成功", archives);
    }

    @GetMapping("/publishStatistics")
    public Result<List<PublishStatistics>> publishStatistics() {
        List<PublishStatistics> publishStatistics = articleService.findPublishStatistics();
        return new Result<List<PublishStatistics>>(true, StatusCode.OK, "文章发布统计信息获取成功", publishStatistics);
    }
}
