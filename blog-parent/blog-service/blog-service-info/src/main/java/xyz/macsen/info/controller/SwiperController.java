package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.Swiper;
import xyz.macsen.info.service.SwiperService;

import java.util.List;

@RestController
@RequestMapping("/swipers")
public class SwiperController {

    @Autowired
    private SwiperService swiperService;

    @GetMapping
    public Result<List<Swiper>> swipers() {
        List<Swiper> swipers = swiperService.findAllSwipers();
        return new Result<List<Swiper>>(true, StatusCode.OK, "Swiper轮播图获取成功", swipers);
    }
}
