package com.lfw.bank.service;

import com.lfw.bank.exception.AppException;
import com.lfw.bank.exception.MoneyNotEnoughException;

/**
 * 账户业务类。
 */
public interface AccountService {
    /**
     * 银行账户转正
     *
     * @param fromActno 转出账户
     * @param toActno   转入账户
     * @param money     转账金额
     * @throws MoneyNotEnoughException 余额不足异常
     * @throws AppException            App发生异常
     */
    void transfer(String fromActno, String toActno, double money) throws MoneyNotEnoughException, AppException;
}
