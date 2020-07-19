package xyz.macsen.about.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("description")
public class Description {

    @Id
    String id;
    String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
