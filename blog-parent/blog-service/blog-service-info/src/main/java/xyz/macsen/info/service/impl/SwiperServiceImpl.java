package xyz.macsen.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.info.mapper.SwiperMapper;
import xyz.macsen.info.pojo.Swiper;
import xyz.macsen.info.service.SwiperService;

import java.util.List;

@Service
public class SwiperServiceImpl implements SwiperService {

    @Autowired
    private SwiperMapper swiperMapper;

    /**
     * 查找swiper轮播图
     * @return
     */
    @Override
    public List<Swiper> findAllSwipers() {
        List<Swiper> swipers = swiperMapper.selectAll();
        if (CollectionUtils.isEmpty(swipers)) {
            throw new BlogException(ExceptionEnum.SWIPER_NOT_FOUND);
        }
        return swipers;
    }
}
