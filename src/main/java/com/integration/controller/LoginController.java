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

import com.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br> 
 * 〈登录〉
 *
 * @author yhw
 * @create 2019/9/3
 * @since 1.0.0
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView Login(){
        return null;
    }
}
