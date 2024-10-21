package com.lfw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingTestController {
    @RequestMapping(value = {"/testValue1", "/testValue2"})
    public String testValue() {
        return "testValue";
    }

    //    @RequestMapping("/x?z/testValueAnt")
//    @RequestMapping("/x*z/testValueAnt")
//    @RequestMapping("/x**z/testValueAnt")
//    @RequestMapping("/**/testValueAnt")
    @RequestMapping("/testValueAnt/**")
    public String testValueAnt() {
        return "testValueAnt";
    }

    // 这里就映射了一个RESTFul风格的URL。
    @RequestMapping(value = "/testRESTful/{id}/{username}/{age}")
    public String testRESTful(
            @PathVariable("id")
            int id,
            @PathVariable("username")
            String username,
            @PathVariable("age")
            int age) {
        System.out.println(id + "," + username + "," + age);
        return "testRESTful";
    }

    //@RequestMapping(value = "/login", method = RequestMethod.POST)
    //@PostMapping("/login")
    //@RequestMapping(value = "/login", method = RequestMethod.PUT)
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String testMethod() {
        return "testMethod";
    }

    @RequestMapping(value = "/testParams", params = {"username", "password"})
    public String testParams() {
        return "testParams";
    }

    //@RequestMapping(value = "/testHeaders", headers = {"Referer=http://localhost:8080/springmvc/"})
    @RequestMapping(value="/testHeaders", headers = {"Referer=http://localhost:8888/springmvc/"})
    public String testHeaders() {
        return "testHeaders";
    }

}
