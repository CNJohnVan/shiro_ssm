package com.integration.pojo;

public class Permission {
    private Integer permission_id;

    private String name;

    private String url;

    public Integer getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Permission(Integer permission_id, String name, String url) {
        this.permission_id = permission_id;
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permission_id=" + permission_id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public Permission() {
    }
}