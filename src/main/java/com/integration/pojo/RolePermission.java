package com.integration.pojo;

public class RolePermission {
    private Integer role_permission_id;

    private Integer role_id;

    private Integer permission_id;

    public Integer getRole_permission_id() {
        return role_permission_id;
    }

    public void setRole_permission_id(Integer role_permission_id) {
        this.role_permission_id = role_permission_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "role_permission_id=" + role_permission_id +
                ", role_id=" + role_id +
                ", permission_id=" + permission_id +
                '}';
    }

    public RolePermission() {
    }

    public RolePermission(Integer role_permission_id, Integer role_id, Integer permission_id) {
        this.role_permission_id = role_permission_id;
        this.role_id = role_id;
        this.permission_id = permission_id;
    }
}