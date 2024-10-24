package com.lfw.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class RequestScopeTestController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {

        //向 request 域中存储数据
        request.setAttribute("testRequestScope", "在 SpringMVC 中使用原生 Servlet API 实现 request 域数据共享");

        // 跳转视图，在视图页面将request域中的数据取出来，这样就完成了：Controller和View在同一个请求当中两个组件之间数据的共享。
        // 这个跳转，默认情况下是：转发的方式。（转发forward是一次请求）
        // 这个返回的是一个逻辑视图名称，经过视图解析器解析，变成物理视图名称。/WEB-INF/templates/view.html
        return "view";
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        // 向request域中绑定数据
        model.addAttribute("testRequestScope", "在SpringMVC中使用Model接口实现request域数据共享");
        System.out.println(model);
        System.out.println(model.getClass().getName());
        // 转发
        return "view";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        // 向request域中存储数据
        map.put("testRequestScope", "在SpringMVC中使用Map接口实现request域数据共享");
        System.out.println(map);
        System.out.println(map.getClass().getName());
        return "view";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        // 向request域中存储数据
        modelMap.addAttribute("testRequestScope", "在SpringMVC中使用ModelMap实现request域数据共享");
        System.out.println(modelMap);
        System.out.println(modelMap.getClass().getName());
        return "view";
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        // 创建“模型与视图对象”
        ModelAndView modelAndView = new ModelAndView();
        // 绑定数据
        modelAndView.addObject("testRequestScope", "在SpringMVC中使用ModelAndView实现request域数据共享");
        // 绑定视图
        modelAndView.setViewName("view");
        // 返回
        return modelAndView;
    }
}
