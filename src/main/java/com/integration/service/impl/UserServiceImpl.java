package com.integration.service.impl;

import com.integration.mapper.UserMapper;
import com.integration.pojo.Permission;
import com.integration.pojo.Role;
import com.integration.pojo.User;
import com.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author yhw
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //根据用户名查找用户
    public User findByUserName(String username){
        return userMapper.findByUserName(username);
    }

    //根据用户名查找用户角色
    public Set<String> findRoles(String username){
    	List<Role> role=userMapper.findRoles(username);
    	Set<String> roles = new TreeSet<String>();
    	for (Role role2 : role) {
			roles.add(role2.getRole_name());
		}
    	return roles;
    }

    //根据用户名查找用户权限
    public Set<String> findPermissions(String username){
    	List<Permission> pers = userMapper.findPermissions(username);
    	Set<String> permissions = new TreeSet<String>();
    	for (Permission p : pers) {
    		permissions.add(p.getUrl());
		}
        return permissions;
    }
}
