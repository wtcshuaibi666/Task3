package com.jnshu.entity;

public class First {
    private Integer id;

    private String fname;

    private Boolean status;

    private String update_by;

    private Long create_at;

    private Long update_at;

    private Integer second_id;
private Second second;
    public First(Integer id, String fname, Boolean status, String update_by, Long create_at, Long update_at, Integer second_id) {
        this.id = id;
        this.fname = fname;
        this.status = status;
        this.update_by = update_by;
        this.create_at = create_at;
        this.update_at = update_at;
        this.second_id = second_id;
    }

    public First() {
        super();
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by == null ? null : update_by.trim();
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

    public Integer getSecond_id() {
        return second_id;
    }

    public void setSecond_id(Integer second_id) {
        this.second_id = second_id;
    }
}