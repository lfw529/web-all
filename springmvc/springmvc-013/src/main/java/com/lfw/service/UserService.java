package com.lfw.service;

import com.lfw.bean.User;

public interface UserService {
    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    User getById(Long id);
}