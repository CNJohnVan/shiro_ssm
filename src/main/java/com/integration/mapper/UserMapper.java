package com.integration.mapper;

import com.integration.pojo.Permission;
import com.integration.pojo.Role;
import com.integration.pojo.User;


import java.util.List;
import java.util.Set;

public interface UserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //自定义
    User findByUserName(String username);

    List<Role> findRoles(String username);

    List<Permission> findPermissions(String username);
}