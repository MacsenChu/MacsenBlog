package xyz.macsen.info.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("headerInfo")
public class HeaderInfo {
    @Id
    String id;
    String title;
    String sign;
    String headerBgColor;
    String headerColor;
    String headerActiveColor;
    String sideBarBgColor;
    String sideBarColor;
    String sideBarActiveColor;
    String avatarUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getHeaderBgColor() {
        return headerBgColor;
    }

    public void setHeaderBgColor(String headerBgColor) {
        this.headerBgColor = headerBgColor;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    public String getHeaderActiveColor() {
        return headerActiveColor;
    }

    public void setHeaderActiveColor(String headerActiveColor) {
        this.headerActiveColor = headerActiveColor;
    }

    public String getSideBarBgColor() {
        return sideBarBgColor;
    }

    public void setSideBarBgColor(String sideBarBgColor) {
        this.sideBarBgColor = sideBarBgColor;
    }

    public String getSideBarColor() {
        return sideBarColor;
    }

    public void setSideBarColor(String sideBarColor) {
        this.sideBarColor = sideBarColor;
    }

    public String getSideBarActiveColor() {
        return sideBarActiveColor;
    }

    public void setSideBarActiveColor(String sideBarActiveColor) {
        this.sideBarActiveColor = sideBarActiveColor;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
