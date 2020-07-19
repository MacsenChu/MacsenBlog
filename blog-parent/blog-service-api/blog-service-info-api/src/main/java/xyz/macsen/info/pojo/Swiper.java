package xyz.macsen.info.pojo;

import javax.persistence.*;

@Table(name = "swipers")
public class Swiper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "title")
    String title;
    @Column(name = "signature")
    String signature;
    @Column(name = "imgUrl")
    String imgUrl;

    public Swiper() {
    }

    public  Swiper(Integer id, String title, String signature, String imgUrl) {
        this.id = id;
        this.title = title;
        this.signature = signature;
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
