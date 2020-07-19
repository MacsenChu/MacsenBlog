package xyz.macsen.article.pojo;

import javax.persistence.Column;

public class PublishStatistics {

    @Column(name = "month")
    String month;
    @Column(name = "total")
    Integer total;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
