package com.lfw.bank.service;

import com.lfw.bank.pojo.Account;

public interface AccountService {
    /**
     * 转账
     *
     * @param fromActno
     * @param toActno
     * @param money
     */
    void transfer(String fromActno, String toActno, double money);
}
