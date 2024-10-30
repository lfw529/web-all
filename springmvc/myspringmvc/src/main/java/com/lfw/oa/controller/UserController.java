package com.lfw.oa.controller;

import org.myspringmvc.stereotype.Controller;
import org.myspringmvc.ui.ModelMap;
import org.myspringmvc.web.bind.annotation.RequestMapping;
import org.myspringmvc.web.bind.annotation.RequestMethod;

/**
 * ClassName: UserController
 * Description:
 */
@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        // 向request域中绑定数据
        modelMap.addAttribute("username", "lisi");
        // 转发
        return "index";
    }
}
