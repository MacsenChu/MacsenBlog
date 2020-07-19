package xyz.macsen.about.service;

import xyz.macsen.about.pojo.Skill;

import java.util.List;

public interface SkillService {

    /**
     * 查询技能列表
     * @return
     */
    List<Skill> findAllSkills();

}
