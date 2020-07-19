package xyz.macsen.info.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Map;

@Document
public class SocialLink {
    @Id
    private String id;
    private Map<String, String> github;
    private Map<String, String> mail;
    private Map<String, String> qq;
    private Map<String, String> weChat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getGithub() {
        return github;
    }

    public void setGithub(Map<String, String> github) {
        this.github = github;
    }

    public Map<String, String> getMail() {
        return mail;
    }

    public void setMail(Map<String, String> mail) {
        this.mail = mail;
    }

    public Map<String, String> getQq() {
        return qq;
    }

    public void setQq(Map<String, String> qq) {
        this.qq = qq;
    }

    public Map<String, String> getWeChat() {
        return weChat;
    }

    public void setWeChat(Map<String, String> weChat) {
        this.weChat = weChat;
    }
}
