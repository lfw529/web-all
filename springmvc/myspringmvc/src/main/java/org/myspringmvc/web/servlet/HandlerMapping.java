package org.myspringmvc.web.servlet;

import jakarta.servlet.http.HttpServletRequest;

/**
 * ClassName: HandlerMapping
 * Description: 处理器映射器（根据请求路径映射到HandlerMethod上）
 */
public interface HandlerMapping {

    /**
     * 根据请求返回处理器执行链对象。
     * @param request 请求对象
     * @return 处理器执行链对象
     * @throws Exception
     */
    HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception;
}
