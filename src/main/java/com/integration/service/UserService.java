package com.integration.service;

import com.integration.pojo.User;

import java.util.Set;

public interface UserService {
    User findByUserName(String username);

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);
}
