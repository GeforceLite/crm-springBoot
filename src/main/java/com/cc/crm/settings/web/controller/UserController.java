package com.cc.crm.settings.web.controller;

import com.cc.crm.settings.domain.User;
import com.cc.crm.settings.service.UserService;
import com.cc.crm.utils.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login.do")
    public Map<String, Object> login(String loginAct, String loginPwd, HttpServletRequest request){
        System.out.println("进入到后台了");
        System.out.println(loginAct+"====================="+loginPwd);
        loginPwd= MD5Util.getMD5(loginPwd);
        String ip =request.getRemoteAddr();
        System.out.println("==================ip"+ip);
        Map<String ,Object> map=new HashMap<>();
        try {
            User user=userService.login(loginAct,loginPwd,ip);
            request.getSession().setAttribute("user",user);
            map.put("success",true);
        } catch (Exception e)
        {
            //            一旦执行catch块 表示抛出异常 登录失败
            e.printStackTrace();
            String msg=e.getMessage();
            map.put("success",false);
            map.put("msg",msg);
        }
        return  map;
    }

}
