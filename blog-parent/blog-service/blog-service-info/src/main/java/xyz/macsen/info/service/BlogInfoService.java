package xyz.macsen.info.service;

import xyz.macsen.info.pojo.*;

import java.util.List;

public interface BlogInfoService {

    /**
     * 获取swiper轮播图
     * @return
     */
    List<Swiper> findAllSwipers();

    /**
     * 获取carousel轮播图
     * @return
     */
    List<Carousel> findAllCarousels();

    /**
     * 获取音乐列表
     * @return
     */
    List<Music> findAllMusics();

    /**
     * 查询社交平台链接
     * @return
     */
    SocialLink findSocialLink();

    /**
     * 获取博客header配置信息
     * @return
     */
    HeaderInfo findHeaderInfo();

    /**
     * 获取博客footer配置信息
     * @return
     */
    FooterInfo findFooterInfo();

    /**
     * 获取myInfo
     * @return
     */
    MyInfo findMyInfo();
}
