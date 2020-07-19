package xyz.macsen.article.service;

import xyz.macsen.article.pojo.Category;

import java.util.List;

public interface CategoryService {

    /**
     * 查询所有分类
     * @return
     */
    List<Category> findAll();
}
