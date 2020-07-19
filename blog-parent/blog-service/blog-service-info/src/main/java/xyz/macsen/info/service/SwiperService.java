package xyz.macsen.info.service;

import xyz.macsen.info.pojo.Swiper;

import java.util.List;

public interface SwiperService {

    /**
     * 获取swiper轮播图
     * @return
     */
    List<Swiper> findAllSwipers();
}
