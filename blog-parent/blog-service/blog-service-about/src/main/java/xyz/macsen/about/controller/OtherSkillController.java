package xyz.macsen.about.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.about.pojo.OtherSkill;
import xyz.macsen.about.service.OtherSkillService;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;

import java.util.List;

@RestController
@RequestMapping("/otherSkills")
public class OtherSkillController {

    @Autowired
    private OtherSkillService otherSkillService;

    @GetMapping
    public Result<List<OtherSkill>> otherSkill() {
        List<OtherSkill> otherSkills = otherSkillService.findAllOtherSkills();
        return new Result<List<OtherSkill>>(true, StatusCode.OK, "其他技能列表获取成功", otherSkills);
    }
}
