package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.SocialLink;
import xyz.macsen.info.service.SocialLinkService;

@RestController
@RequestMapping("/socialLink")
public class SocialLinkController {

    @Autowired
    private SocialLinkService socialLinkService;

    @GetMapping
    public Result<SocialLink> socialLink() {
        SocialLink socialLink = socialLinkService.findSocialLink();
        return new Result<SocialLink>(true, StatusCode.OK, "社交平台链接获取成功", socialLink);
    }
}
