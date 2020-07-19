package xyz.macsen.about.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.about.pojo.Description;
import xyz.macsen.about.service.DescriptionService;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;

@RestController
@RequestMapping("/desc")
public class DescriptionController {

    @Autowired
    private DescriptionService descriptionService;

    @GetMapping
    public Result<Description> description() {
        Description description = descriptionService.findDescription();
        return new Result<Description>(true, StatusCode.OK, "description获取成功", description);
    }
}
