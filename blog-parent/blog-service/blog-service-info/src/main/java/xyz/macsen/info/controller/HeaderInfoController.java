package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.HeaderInfo;
import xyz.macsen.info.service.HeaderInfoService;

@RestController
@RequestMapping("/headerInfo")
public class HeaderInfoController {

    @Autowired
    private HeaderInfoService headerInfoService;

    @GetMapping
    public Result<HeaderInfo> headerInfo() {
        HeaderInfo headerInfo = headerInfoService.findHeaderInfo();
        return new Result<HeaderInfo>(true, StatusCode.OK, "header配置信息获取成功", headerInfo);
    }
}
