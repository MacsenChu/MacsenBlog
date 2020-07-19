package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.mapper.CarouselMapper;
import xyz.macsen.info.pojo.Carousel;
import xyz.macsen.info.service.CarouselService;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;

    /**
     * 查找carousel轮播图
     * @return
     */
    @Override
    public List<Carousel> findAllCarousels() {
        List<Carousel> carousels = carouselMapper.selectAll();
        if (CollectionUtils.isEmpty(carousels)) {
            throw new BlogException(ExceptionEnum.CAROUSEL_NOT_FOUND);
        }
        return carousels;
    }
}
