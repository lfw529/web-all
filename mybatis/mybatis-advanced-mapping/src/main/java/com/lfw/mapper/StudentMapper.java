package com.lfw.mapper;

import com.lfw.pojo.Student;

public interface StudentMapper {
    /**
     * 根据id查询
     *
     * @param sid
     * @return
     */
    Student selectBySid(Integer sid);
}
