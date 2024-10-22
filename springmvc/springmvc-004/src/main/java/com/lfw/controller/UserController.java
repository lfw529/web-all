package com.lfw.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class UserController {
    @RequestMapping("/")
    public String toRegisterPage() {
        return "register";
    }

    /*@PostMapping(value = "/register")
    public String register(HttpServletRequest request) {
        // 通过当前请求对象获取提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println(username + "," + password + "," + sex + "," + Arrays.asList(hobby));
        return "success";
    }*/

    @PostMapping(value = "/register")
    public String register(
            @RequestParam(value = "uname")
            String a,
            @RequestParam(value = "password")
            String b,
            @RequestParam(value = "sex")
            String c,
            @RequestParam(value = "hobby")
            String[] d,
            @RequestParam(name = "intro")
            Integer e) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.toString(d));
        System.out.println(e);
        return "success";
    }
}
