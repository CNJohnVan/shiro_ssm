package com.integration.mapper;

import com.integration.pojo.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer role_permission_id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer role_permission_id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}