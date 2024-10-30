package org.myspringmvc.web.context;

import jakarta.servlet.ServletContext;
import org.myspringmvc.context.ApplicationContext;

/**
 * ClassName: WebApplicationContext
 * Description:
 */
public class WebApplicationContext extends ApplicationContext {
    private ServletContext servletContext;
    private String springMvcConfigPath;

    public WebApplicationContext(ServletContext servletContext, String springMvcConfigPath) {
        super(springMvcConfigPath);
        this.servletContext = servletContext;
    }

    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String getSpringMvcConfigPath() {
        return springMvcConfigPath;
    }

    public void setSpringMvcConfigPath(String springMvcConfigPath) {
        this.springMvcConfigPath = springMvcConfigPath;
    }
}
