package xyz.macsen.common.enums;

import xyz.macsen.common.utils.StatusCode;

public enum ExceptionEnum {

    ARTICLE_NOT_FOUND(StatusCode.NOT_FOUND, "文章不存在"),
    CATEGORY_NOT_FOUND(StatusCode.NOT_FOUND, "没有找到分类"),
    TAG_NOT_FOUND(StatusCode.NOT_FOUND, "没有找到标签"),
    SWIPER_NOT_FOUND(StatusCode.NOT_FOUND, "没有找到swiper轮播图"),
    CAROUSEL_NOT_FOUND(StatusCode.NOT_FOUND, "没有找到carousel轮播图"),
    MUSIC_NOT_FOUND(StatusCode.NOT_FOUND, "音乐列表获取失败"),
    SOCIALLINK_NOT_FOUND(StatusCode.NOT_FOUND, "社交平台链接获取失败"),
    HEADERINFO_NOT_FOUND(StatusCode.NOT_FOUND, "header配置信息获取失败"),
    FOOTERINFO_NOT_FOUND(StatusCode.NOT_FOUND, "footer配置信息获取失败"),
    MYINFO_NOT_FOUND(StatusCode.NOT_FOUND, "myInfo获取失败"),
    SKILL_NOT_FOUND(StatusCode.NOT_FOUND, "技能列表获取失败"),
    OTHERSKILL_NOT_FOUND(StatusCode.NOT_FOUND, "其他技能列表获取失败"),
    DESCRIPTIONN_NOT_FOUND(StatusCode.NOT_FOUND, "description获取失败"),
    PUBLISHSTATISTICS_NOT_FOUND(StatusCode.NOT_FOUND, "文章发布统计信息获取失败"),
    ;
    private int code;
    private String message;

    ExceptionEnum() {
    }

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
