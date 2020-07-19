package xyz.macsen.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.article.mapper.CategoryMapper;
import xyz.macsen.article.pojo.Category;
import xyz.macsen.article.service.CategoryService;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.common.vo.Result;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询所有分类
     * @return
     */
    @Override
    public List<Category> findAll() {
        List<Category> categories = categoryMapper.selectAll();
        if (CollectionUtils.isEmpty(categories)) {
            throw new BlogException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return categories;
    }
}
