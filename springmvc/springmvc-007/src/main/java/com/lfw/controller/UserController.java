package com.lfw.controller;

//import com.lfw.bean.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Integer id) {
        System.out.println("根据用户id查询用户信息，用户id是" + id);
        return "ok";
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public String getAll() {
        System.out.println("正在查询所有用户信息....");
        return "ok";
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public String save() {
        System.out.println("保存用户信息");
        return "ok";
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
    public String update(String username) {
        System.out.println("修改用户信息，用户名：" + username);
        return "ok";
    }
}

//@RequestMapping(value = "/user", method = RequestMethod.POST)
//public String save(User user) {
//    System.out.println("正在保存用户信息...");
//    System.out.println(user);
//    return "ok";
//}

//
//    @RequestMapping(value = "/user", method = RequestMethod.PUT)
//    public String modify(User user){
//        System.out.println("正在修改用户信息：" + user);
//        return "ok";
//    }
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
//    public String del(@PathVariable("id") String id){
//        System.out.println("正在删除用户：" + id);
//        return "ok";
//    }
























