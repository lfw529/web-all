package com.lfw.oa.controller;

import org.myspringmvc.stereotype.Controller;
import org.myspringmvc.ui.ModelMap;
import org.myspringmvc.web.bind.annotation.RequestMapping;
import org.myspringmvc.web.bind.annotation.RequestMethod;

/**
 * ClassName: OrderController
 * Description:
 */
@Controller
public class OrderController {
    @RequestMapping(value = "/oa/detail", method = RequestMethod.GET)
    public String detail(ModelMap modelMap) {
        // 向request域中存储数据
        modelMap.addAttribute("orderNo", "123456456456456");
        // 转发到视图
        return "detail";
    }
}
