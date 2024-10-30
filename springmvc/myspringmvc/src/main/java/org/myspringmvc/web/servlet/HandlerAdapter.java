package org.myspringmvc.web.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * ClassName: HandlerAdapter
 * Description: 处理器适配器接口
 */
public interface HandlerAdapter {

    /**
     * 调用处理器方法（底层会真正的调用处理器方法，执行核心业务。）
     * @param request
     * @param response
     * @param handler
     * @return 数据和视图对象。
     * @throws Exception
     */
    ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception;
}
