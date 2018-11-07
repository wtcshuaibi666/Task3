package com.jnshu.entity;

public class Fenlei {
    private Integer id;

    private String pro_name;

    private String first_name;

    private String status;

    private Long create_at;

    private Long update_at;

    private String create_by;

    public Fenlei(Integer id, String pro_name, String first_name, String status, Long create_at, Long update_at, String create_by) {
        this.id = id;
        this.pro_name = pro_name;
        this.first_name = first_name;
        this.status = status;
        this.create_at = create_at;
        this.update_at = update_at;
        this.create_by = create_by;
    }

    public Fenlei() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name == null ? null : first_name.trim();
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

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by == null ? null : create_by.trim();
    }
}