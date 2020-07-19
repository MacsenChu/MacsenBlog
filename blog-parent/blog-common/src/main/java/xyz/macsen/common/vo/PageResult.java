package xyz.macsen.common.vo;

import java.util.List;

/**
 * 分页结果类
 */
public class PageResult<T> {

    private Long total;  // 总记录数
    private List<T> list;  // 记录

    public PageResult(Long total, List<T> list) {
        this.total = total;
        this.list = list;
    }

    public PageResult() {
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
