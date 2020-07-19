package xyz.macsen.message.pojo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "comment")
    String comment;

    @Column(name = "mail")
    String mail;

    @Column(name = "system_info")
    String systemInfo;

    @Column(name = "create_time")
    LocalDateTime createTime;

    @Column(name = "is_author")
    Boolean isAuthor;

    @Column(name = "is_review")
    Boolean isReview;

    @Transient
    List<MessageReply> replies;

    public Boolean getIsAuthor() {
        return isAuthor;
    }

    public void setIsAuthor(Boolean isAuthor) {
        this.isAuthor = isAuthor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
    }


    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Boolean getAuthor() {
        return isAuthor;
    }

    public void setAuthor(Boolean author) {
        isAuthor = author;
    }

    public Boolean getIsReview() {
        return isReview;
    }

    public void setIsReview(Boolean isReview) {
        this.isAuthor = isReview;
    }

    public List<MessageReply> getReplies() {
        return replies;
    }

    public void setReplies(List<MessageReply> replies) {
        this.replies = replies;
    }
}
