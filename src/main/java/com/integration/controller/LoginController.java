/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LoginController
 * Author:   yhw
 * Date:     2019/9/3 10:38
 * Description: 登录
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.integration.controller;

import com.integration.pojo.User;
import com.integration.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 〈一句话功能简述〉<br> 
 * 〈登录〉
 *
 * @author yhw
 * @create 2019/9/3
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @RequestMapping("/login.do")
    public String Login(HttpServletRequest req,
            HttpServletResponse resp, HttpSession session){
    	User user = new User(null, req.getParameter("username"), req.getParameter("password"));
        System.out.println(user);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try{
            subject.login(token);
            session.setAttribute("user",subject);
        } catch (UnknownAccountException e) {
            return "index";
        }
        return "main";
    }
    @RequestMapping("/addperm")
    @RequiresPermissions("permission:add")
    public String error(User user, HttpSession session){
        return "error";
    }


}
