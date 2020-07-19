package xyz.macsen.article.pojo;

public class ArticleInputComment {
    String name;
    String mail;
    String content;
    Integer toId;
    String toName;
    Integer commentId;
    String replyType;
    String systemInfo;
    Integer articleId;
    String ticket;
    String randstr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
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

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getRandstr() {
        return randstr;
    }

    public void setRandstr(String randstr) {
        this.randstr = randstr;
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

    @Override
    public String toString() {
        return "ArticleUserInputCommentVo{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", content='" + content + '\'' +
                ", toId=" + toId +
                ", toName='" + toName + '\'' +
                ", commentId=" + commentId +
                ", replyType='" + replyType + '\'' +
                ", systemInfo='" + systemInfo + '\'' +
                ", articleId=" + articleId +
                ", ticket='" + ticket + '\'' +
                ", randstr='" + randstr + '\'' +
                '}';
    }
}
