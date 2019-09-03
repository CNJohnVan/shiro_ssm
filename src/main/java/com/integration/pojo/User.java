/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   yhw
 * Date:     2019/9/3 10:30
 * Description: 用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.integration.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户〉
 *
 * @author yhw
 * @create 2019/9/3
 * @since 1.0.0
 */
public class User {
    private String user_id;
    private String username;
    private String password;

    public User(String user_id, String username, String password) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
