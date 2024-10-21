package com.lfw.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class UserController {
    @RequestMapping("/")
    public String toRegisterPage() {
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(HttpServletRequest request) {
        // 通过当前请求对象获取提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println(username + "," + password + "," + sex + "," + Arrays.asList(hobby));
        return "success";
    }
}
