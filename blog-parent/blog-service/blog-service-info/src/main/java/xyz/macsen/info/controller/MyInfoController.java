package xyz.macsen.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.info.pojo.MyInfo;
import xyz.macsen.info.service.MyInfoService;

@RestController
@RequestMapping("/myInfo")
public class MyInfoController {

    @Autowired
    private MyInfoService myInfoService;

    @GetMapping
    public Result<MyInfo> myInfo() {
        MyInfo myInfo  = myInfoService.findMyInfo();
        return new Result<MyInfo>(true, StatusCode.OK, "myInfo信息获取成功", myInfo);
    }
}
