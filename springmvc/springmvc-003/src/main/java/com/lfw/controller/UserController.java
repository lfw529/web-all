package com.lfw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
   /* @RequestMapping("/detail")
    public String detail() {
        return "detail";
    }*/

    // 方案1
    /*@RequestMapping("/user/detail")
    public String toDetail() {
        return "/user/detail";

    }*/

    // 方案2
    @RequestMapping("/detail")
    public String toDetail() {
        return "/user/detail";
    }

}
