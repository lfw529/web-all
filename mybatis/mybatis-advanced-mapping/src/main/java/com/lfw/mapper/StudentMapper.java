package com.lfw.mapper;

import com.lfw.pojo.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 根据id查询
     *
     * @param sid
     * @return
     */
    Student selectBySid(Integer sid);


    /**
     * 根据班级编号获取所有的学生。
     * @param cid
     * @return
     */
    List<Student> selectByCid(Integer cid);
}
