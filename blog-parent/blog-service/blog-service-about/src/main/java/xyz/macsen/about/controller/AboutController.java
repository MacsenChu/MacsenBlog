package xyz.macsen.about.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.about.service.AboutService;
import xyz.macsen.about.vo.AboutInfo;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @GetMapping
    public Result<AboutInfo> aboutInfo() {
        AboutInfo aboutInfo = aboutService.findAboutInfo();
        return new Result<AboutInfo>(true, StatusCode.OK, "关于页面信息获取成功", aboutInfo);
    }
}
