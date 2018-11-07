package com.jnshu.entity;

import java.util.List;

public class Second {
    private Integer id;

    private String sname;

    private Integer first_id;

    private Boolean status;

    private Long create_at;

    private Long update_at;

    private String update_by;

    private Integer works_id;

    private List<First> firsts;
    public Second(Integer id, String sname, Integer first_id, Boolean status, Long create_at, Long update_at, String update_by, Integer works_id) {
        this.id = id;
        this.sname = sname;
        this.first_id = first_id;
        this.status = status;
        this.create_at = create_at;
        this.update_at = update_at;
        this.update_by = update_by;
        this.works_id = works_id;
    }

    public Second() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<First> getFirsts() {
        return firsts;
    }

    public void setFirsts(List<First> firsts) {
        this.firsts = firsts;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getFirst_id() {
        return first_id;
    }

    public void setFirst_id(Integer first_id) {
        this.first_id = first_id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by == null ? null : update_by.trim();
    }

    public Integer getWorks_id() {
        return works_id;
    }

    public void setWorks_id(Integer works_id) {
        this.works_id = works_id;
    }
}