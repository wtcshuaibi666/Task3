package com.jnshu.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Long create_at;

    private String create_by;

    private String permission;

    public User(Integer id, String username, String password, Long create_at, String create_by, String permission) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.create_at = create_at;
        this.create_by = create_by;
        this.permission = permission;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by == null ? null : create_by.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }
}