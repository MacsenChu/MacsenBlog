package xyz.macsen.about.service;

import xyz.macsen.about.pojo.OtherSkill;

import java.util.List;

public interface OtherSkillService {

    /**
     * 查询其他技能列表
     * @return
     */
    List<OtherSkill> findAllOtherSkills();
}
