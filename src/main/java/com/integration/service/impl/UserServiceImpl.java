package com.integration.service.impl;

import com.integration.pojo.User;
import com.integration.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yhw
 */
@Service
public class UserServiceImpl implements UserService {
    //根据用户名查找用户
    @Override
    public User findByUserName(String username){
        return null;
    }

    //根据用户名查找用户角色
    @Override
    public Set<String> findRoles(String username){
        return null;
    }

    //根据用户名查找用户权限
    @Override
    public Set<String> findPermissions(String username){
         return null;
    }
}
