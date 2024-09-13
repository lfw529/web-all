package com.lfw.bank.service.impl;

import com.lfw.bank.dao.AccountDao;
import com.lfw.bank.dao.impl.AccountDaoImpl;
import com.lfw.bank.exception.AppException;
import com.lfw.bank.exception.MoneyNotEnoughException;
import com.lfw.bank.pojo.Account;
import com.lfw.bank.service.AccountService;
import com.lfw.bank.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class AccountServiceImpl3 implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    @Override
    public void transfer(String fromActno, String toActno, double money) throws MoneyNotEnoughException, AppException {
        // 查询转出账户的余额
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new MoneyNotEnoughException("对不起，您的余额不足。");
        }
        try {
            // 程序如果执行到这里说明余额充足
            // 修改账户余额
            Account toAct = accountDao.selectByActno(toActno);
            fromAct.setBalance(fromAct.getBalance() - money);
            toAct.setBalance(toAct.getBalance() + money);
            // 更新数据库（添加事务）
            SqlSession sqlSession = SqlSessionUtil.openSession();
            accountDao.update(fromAct);

            accountDao.update(toAct);
            sqlSession.commit();

            /* 注释掉
            sqlSession.close();*/

            SqlSessionUtil.close(sqlSession);  // 只修改了这一行代码。
        } catch (Exception e) {
            throw new AppException("转账失败，未知原因！");
        }
    }
}
