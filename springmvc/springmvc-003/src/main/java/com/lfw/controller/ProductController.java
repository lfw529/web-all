package com.lfw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    /*@RequestMapping("/detail")
    public String toDetail() {
        return "detail";
    }*/

    // 方案1
    /*@RequestMapping("/product/detail")
    public String toDetail(){
        return "/product/detail";
    }*/

    // 方案2
    @RequestMapping(value = "/detail")
    public String toDetail() {
        return "/product/detail";
    }
}
