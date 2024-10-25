package com.lfw.controller;

import com.lfw.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestBodyController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody String requestBodyStr) {
        System.out.println("请求体：" + requestBodyStr);
        return "ok";
    }

    @RequestMapping(value = "/save2", method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(@RequestBody User user) {
        System.out.println(user);
        // 不是逻辑视图名称，是普通字符串，因为前端发送的请求是AJAX请求。
        return "ok";
    }
}
