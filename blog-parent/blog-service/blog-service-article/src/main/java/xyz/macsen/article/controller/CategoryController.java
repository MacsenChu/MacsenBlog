package xyz.macsen.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.article.pojo.Category;
import xyz.macsen.article.service.CategoryService;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    public Result<List<Category>> findAllCategories() {
        List<Category> categories = categoryService.findAll();
        return new Result<List<Category>>(true, StatusCode.OK, "分类列表获取成功", categories);
    }
}
