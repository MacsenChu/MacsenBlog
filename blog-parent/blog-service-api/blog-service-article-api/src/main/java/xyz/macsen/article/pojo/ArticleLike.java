package xyz.macsen.article.pojo;

public class ArticleLike {
    Integer articleId;
    Boolean isCharge;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Boolean getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(Boolean charge) {
        this.isCharge = charge;
    }

    @Override
    public String toString() {
        return "ArticleLikeVo{" +
                "articleId=" + articleId +
                ", isCharge=" + isCharge +
                '}';
    }
}
