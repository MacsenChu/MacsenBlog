package xyz.macsen.info.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("footerInfo")
public class FooterInfo {
    @Id
    String id;
    Integer visitsCount;
    Integer visitorsCount;
    String runtime;
    String recordNumber;
    String recordName;
    String copyrightYear;
    String copyrightName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVisitsCount() {
        return visitsCount;
    }

    public void setVisitsCount(Integer visitsCount) {
        this.visitsCount = visitsCount;
    }

    public Integer getVisitorsCount() {
        return visitorsCount;
    }

    public void setVisitorsCount(Integer visitorsCount) {
        this.visitorsCount = visitorsCount;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(String copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public String getCopyrightName() {
        return copyrightName;
    }

    public void setCopyrightName(String copyrightName) {
        this.copyrightName = copyrightName;
    }
}
