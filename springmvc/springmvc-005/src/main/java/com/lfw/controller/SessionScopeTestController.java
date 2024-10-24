package com.lfw.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value = {"x", "y"}) // 标注x和y都是存放到session域中，而不是request域。
public class SessionScopeTestController {
    @RequestMapping("/testSessionServletAPI")
    public String testServletAPI(HttpSession session) {
        // 处理核心业务....
        // 将数据存储到session中
        session.setAttribute("testSessionScope", "在SpringMVC当中使用原生Servlet API完成session域数据共享");
        // 返回逻辑视图名称（这是一个转发的行为）
        return "view";
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(ModelMap modelMap) {
        // 处理业务
        // 将数据存储到session域当中
        modelMap.addAttribute("x", "我是埃克斯");
        modelMap.addAttribute("y", "我是歪");

        // 返回逻辑视图名称
        return "view";
    }
}
