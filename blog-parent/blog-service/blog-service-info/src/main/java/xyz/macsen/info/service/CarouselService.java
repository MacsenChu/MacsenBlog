package xyz.macsen.info.service;

import xyz.macsen.info.pojo.Carousel;

import java.util.List;

public interface CarouselService {

    /**
     * 获取carousel轮播图
     * @return
     */
    List<Carousel> findAllCarousels();
}
