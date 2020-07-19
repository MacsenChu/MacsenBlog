package xyz.macsen.about.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.about.mapper.SkillMapper;
import xyz.macsen.about.pojo.Skill;
import xyz.macsen.about.service.SkillService;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillMapper skillsMapper;

    @Override
    public List<Skill> findAllSkills() {
        List<Skill> skills = skillsMapper.selectAll();
        if (CollectionUtils.isEmpty(skills)) {
            throw new BlogException(ExceptionEnum.SKILL_NOT_FOUND);
        }
        return skills;
    }
}
