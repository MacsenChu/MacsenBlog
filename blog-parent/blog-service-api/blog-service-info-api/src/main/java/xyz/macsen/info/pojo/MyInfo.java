package xyz.macsen.info.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("myInfo")
public class MyInfo {
    @Id
    String id;
    String name;
    String profile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
