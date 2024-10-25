package com.lfw.controller;

import com.lfw.bean.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
//@Controller
public class HelloController {

/*    @RequestMapping(value = "/hello")
    public String hello(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello");
        return null;
    }*/


/*    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        // 由于你使用了 @ResponseBody 注解
        // 以下的return语句返回的字符串则不再是“逻辑视图名”了
        // 而是作为响应协议的响应体进行响应。
        return "hello";
    }*/

/*    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "{\"username\":\"zhangsan\",\"password\":\"1234\"}";
    }*/

/*    @RequestMapping(value = "/hello")
    @ResponseBody
    public User hello() {
        User user = new User("zhangsan", "22222");
        return user;
    }*/

    @RequestMapping(value = "/hello")
    public User hello() {
        User user = new User("zhangsan", "22222");
        return user;
    }
}
