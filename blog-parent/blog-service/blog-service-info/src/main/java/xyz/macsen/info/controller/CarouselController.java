package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.Carousel;
import xyz.macsen.info.service.CarouselService;

import java.util.List;

@RestController
@RequestMapping("/carousels")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @GetMapping
    public Result<List<Carousel>> carousels() {
        List<Carousel> carousels = carouselService.findAllCarousels();
        return new Result<List<Carousel>>(true, StatusCode.OK, "Carousel轮播图获取成功", carousels);
    }
}
