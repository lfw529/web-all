package com.lfw.dao;

import com.lfw.bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from tbl_user where id = #{id}")
    User selectById(Long id);
}
