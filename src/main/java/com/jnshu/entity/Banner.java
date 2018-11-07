package com.jnshu.entity;

public class Banner {
    private Integer id;

    private String tupian;

    private String update_by;

    private String url;

    private String status;

    private Long create_at;

    private Long update_at;

    public Banner(Integer id, String tupian, String update_by, String url, String status, Long create_at, Long update_at) {
        this.id = id;
        this.tupian = tupian;
        this.update_by = update_by;
        this.url = url;
        this.status = status;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    public Banner() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTupian() {
        return tupian;
    }

    public void setTupian(String tupian) {
        this.tupian = tupian == null ? null : tupian.trim();
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by == null ? null : update_by.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }
}