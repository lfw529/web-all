package org.myspringmvc.ui;

import java.util.LinkedHashMap;

/**
 * ClassName: ModelMap
 * Description:
 */
public class ModelMap extends LinkedHashMap<String,Object> {

    public ModelMap() {
    }

    /**
     * 向域当中绑定数据
     * @param name
     * @param value
     * @return
     */
    public ModelMap addAttribute(String name, Object value) {
        this.put(name, value);
        return this;
    }
}
