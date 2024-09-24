package com.lfw.test;

import com.lfw.mapper.StudentMapper;
import com.lfw.pojo.Student;
import com.lfw.util.SqlSessionUtil;
import org.junit.Test;

public class StudentMapperTest {
    @Test
    public void testSelectBySid() {
        StudentMapper mapper = SqlSessionUtil.openSession().getMapper(StudentMapper.class);
        Student student = mapper.selectBySid(1);
        System.out.println(student);
    }
}
