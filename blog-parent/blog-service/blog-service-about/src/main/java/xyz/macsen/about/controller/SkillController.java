package xyz.macsen.about.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.about.pojo.Skill;
import xyz.macsen.about.service.SkillService;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public Result<List<Skill>> findAllSkill() {
        List<Skill> skills = skillService.findAllSkills();
        return new Result<List<Skill>>(true, StatusCode.OK, "技能列表获取成功", skills);
    }

}
