package com.integration.mapper;

import com.integration.pojo.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer permission_id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permission_id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}