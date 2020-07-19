package xyz.macsen.message.pojo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "message_reply")
public class MessageReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "from_id")
    Integer fromId;

    @Column(name = "from_name")
    String fromName;

    @Column(name = "to_id")
    Integer toId;

    @Column(name = "to_name")
    String toName;

    @Column(name = "reply_type")
    String replyType;

    @Column(name = "comment")
    String comment;

    @Column(name = "mail")
    String mail;

    @Column(name = "system_info")
    String systemInfo;

    @Column(name = "comment_id")
    Integer commentId;

    @Column(name = "create_time")
    LocalDateTime createTime;

    @Column(name = "is_author")
    Boolean isAuthor;

    @Column(name = "is_review")
    Boolean isReview;

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsAuthor() {
        return isAuthor;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType;
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

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
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

}
