package xyz.macsen.about.vo;

import xyz.macsen.about.pojo.Description;
import xyz.macsen.about.pojo.OtherSkill;
import xyz.macsen.about.pojo.Skill;
import xyz.macsen.article.pojo.Category;
import xyz.macsen.article.pojo.PublishStatistics;
import xyz.macsen.article.pojo.Tag;

import java.util.List;

public class AboutInfo {

    Description description;
    List<Skill> skills;
    List<OtherSkill> otherSkills;
    List<PublishStatistics> publishStatistics;
    List<Category> categories;
    List<Tag> topTags;

    public AboutInfo() {
    }

    public AboutInfo(Description description, List<Skill> skills, List<OtherSkill> otherSkills, List<PublishStatistics> publishStatistics, List<Category> categories, List<Tag> topTags) {
        this.description = description;
        this.skills = skills;
        this.otherSkills = otherSkills;
        this.publishStatistics = publishStatistics;
        this.categories = categories;
        this.topTags = topTags;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<OtherSkill> getOtherSkills() {
        return otherSkills;
    }

    public void setOtherSkills(List<OtherSkill> otherSkills) {
        this.otherSkills = otherSkills;
    }

    public List<PublishStatistics> getPublishStatistics() {
        return publishStatistics;
    }

    public void setPublishStatistics(List<PublishStatistics> publishStatistics) {
        this.publishStatistics = publishStatistics;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Tag> getTopTags() {
        return topTags;
    }

    public void setTopTags(List<Tag> topTags) {
        this.topTags = topTags;
    }
}
