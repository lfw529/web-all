package com.lfw.bank.dao;

import com.lfw.bank.pojo.Account;

public interface AccountDao {
    /**
     * 根据账号查询余额
     *
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 更新账户
     *
     * @param act
     * @return
     */
    int update(Account act);

    /**
     * 保存账户信息
     *
     * @param act
     * @return
     */
    int insert(Account act);
}
