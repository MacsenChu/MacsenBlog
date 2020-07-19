package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.FooterInfo;
import xyz.macsen.info.service.FooterInfoService;

@RestController
@RequestMapping("/footerInfo")
public class FooterInfoController {

    @Autowired
    private FooterInfoService footerInfoService;

    @GetMapping
    public Result<FooterInfo> footerInfo() {
        FooterInfo footerInfo = footerInfoService.findFooterInfo();
        return new Result<FooterInfo>(true, StatusCode.OK, "footer配置信息获取成功", footerInfo);
    }
}
