package org.myspringmvc.web.servlet;

import java.util.Locale;

/**
 * ClassName: ViewResolver
 * Description: 视图解析器接口
 */
public interface ViewResolver {

    /**
     * 视图解析，将逻辑视图名转换为物理视图名，并且返回视图对象。
     * @param viewName
     * @param locale
     * @return
     * @throws Exception
     */
    View resolveViewName(String viewName, Locale locale) throws Exception;
}
