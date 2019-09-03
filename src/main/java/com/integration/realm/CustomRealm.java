/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CustomRealm
 * Author:   yhw
 * Date:     2019/9/3 10:14
 * Description: 用户realm
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.integration.realm;

import com.integration.pojo.User;
import com.integration.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户realm〉
 *
 * @author yhw
 * @create 2019/9/3
 * @since 1.0.0
 */
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
//        Users user = userService.findByUserName(username);
//        user.setLocked(true);   //登录成功后锁定用户
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        //根据用户名查找对应的角色集合
        authorizationInfo.setRoles(userService.findRoles(username));
        //根据用户名查找对应的资源集合
        authorizationInfo.setStringPermissions(userService.findPermissions(username));

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();

        //根据用户名查找用户
        User user = userService.findByUserName(username);
        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }
//        if(Boolean.TRUE.equals(user.getLocked())) {
//            throw new LockedAccountException(); //帐号锁定
//        }
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(), //用户名
                user.getPassword(), //密码
                getName()  //realm name
        );
        return authenticationInfo;
    }

    public void setUsersService(UserService userService) {
        this.userService = userService;
    }
}
