package xyz.macsen.about.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.about.mapper.OtherSkillMapper;
import xyz.macsen.about.pojo.OtherSkill;
import xyz.macsen.about.service.OtherSkillService;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;


import java.util.List;

@Service
public class OtherSkillServiceImpl implements OtherSkillService {

    @Autowired
    private OtherSkillMapper otherSkillMapper;

    @Override
    public List<OtherSkill> findAllOtherSkills() {
        List<OtherSkill> otherSkills = otherSkillMapper.selectAll();
        if (CollectionUtils.isEmpty(otherSkills)) {
            throw new BlogException(ExceptionEnum.OTHERSKILL_NOT_FOUND);
        }
        return otherSkills;
    }
}
