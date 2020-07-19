package xyz.macsen.about.service.impl;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import xyz.macsen.about.pojo.Description;
import xyz.macsen.about.pojo.OtherSkill;
import xyz.macsen.about.pojo.Skill;
import xyz.macsen.about.service.AboutService;
import xyz.macsen.about.service.DescriptionService;
import xyz.macsen.about.service.SkillService;
import xyz.macsen.about.vo.AboutInfo;
import xyz.macsen.article.feign.ArticleFeign;
import xyz.macsen.article.feign.CategoryFeign;
import xyz.macsen.article.feign.TagFeign;
import xyz.macsen.article.pojo.Category;
import xyz.macsen.article.pojo.PublishStatistics;
import xyz.macsen.article.pojo.Tag;
import xyz.macsen.common.vo.Result;

import java.util.List;

@Service
public class AboutServiceImpl implements AboutService {

    @Autowired
    private ArticleFeign articleFeign;

    @Autowired
    private CategoryFeign categoryFeign;

    @Autowired
    private TagFeign tagFeign;

    @Autowired
    private DescriptionService descriptionService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private OtherSkillServiceImpl otherSkillService;

    /**
     * 获取about页面的信息
     * @return
     */
    @Override
    public AboutInfo findAboutInfo() {
        AboutInfo aboutInfo = new AboutInfo();
        // 前端体验不好
//        Description description = descriptionService.findDescription();
        List<Skill> skills = skillService.findAllSkills();
        List<OtherSkill> otherSkills= otherSkillService.findAllOtherSkills();
        Result<List<PublishStatistics>> publishStatistics = articleFeign.publishStatistics();
        Result<List<Category>> categories = categoryFeign.findAllCategories();
        Result<List<Tag>> topTags = tagFeign.findTopTags();

//        if (description != null) {
//            aboutInfo.setDescription(description);
//        }
        if (!CollectionUtils.isEmpty(skills)) {
            aboutInfo.setSkills(skills);
        }
        if (!CollectionUtils.isEmpty(otherSkills)) {
            aboutInfo.setOtherSkills(otherSkills);
        }
        if (!CollectionUtils.isEmpty(publishStatistics.getData())) {
            aboutInfo.setPublishStatistics(publishStatistics.getData());
        }
        if (!CollectionUtils.isEmpty(categories.getData())) {
            aboutInfo.setCategories(categories.getData());
        }
        if (!CollectionUtils.isEmpty(topTags.getData())) {
            aboutInfo.setTopTags(topTags.getData());
        }

        return aboutInfo;
    }
}
