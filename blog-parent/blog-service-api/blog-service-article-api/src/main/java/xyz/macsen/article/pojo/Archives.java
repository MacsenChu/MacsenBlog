package xyz.macsen.article.pojo;

import java.util.List;
import java.util.Map;

public class Archives {

    private Long total;
    private Map<String, Map<String, List<Article>>> archives;

    public Archives() {
    }

    public Archives(Long total, Map<String, Map<String, List<Article>>> archives) {
        this.total = total;
        this.archives = archives;
    }

    public Map<String, Map<String, List<Article>>> getArchives() {
        return archives;
    }

    public void setArchives(Map<String, Map<String, List<Article>>> archives) {
        this.archives = archives;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
