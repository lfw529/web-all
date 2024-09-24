package com.lfw.mapper;

import com.lfw.pojo.Clazz;

/**
 * Clazz映射器接口
 */
public interface ClazzMapper {

    /**
     * 根据cid获取Clazz信息
     *
     * @param cid
     * @return
     */
    Clazz selectByCid(Integer cid);
}
