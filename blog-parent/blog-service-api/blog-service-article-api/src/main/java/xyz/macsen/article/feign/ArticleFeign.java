package xyz.macsen.article.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.macsen.article.pojo.PublishStatistics;
import xyz.macsen.common.vo.Result;

import java.util.List;

@FeignClient("article")
@RequestMapping("/article")
public interface ArticleFeign {

    @GetMapping("/publishStatistics")
    Result<List<PublishStatistics>> publishStatistics();
}
