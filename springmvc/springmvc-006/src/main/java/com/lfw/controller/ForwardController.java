package com.lfw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
    @RequestMapping("/a")
    public String toA() {
        // 采用SpringMVC的转发方式跳转到 /b
        // 转发的时候，格式有特殊要求： return "forward:下一个资源的路径";
        // 这个就不是逻辑视图名称了。
//        return "forward:/b"; // 创建InternalResourceView对象。

        // 这个使用较多。
        return "redirect:/b"; // 创建RedirectView
    }

    @RequestMapping("/b")
    public String toB() {
        // 返回的是一个逻辑视图名称
        return "b";  // 创建ThymeleafView对象。
    }
}
