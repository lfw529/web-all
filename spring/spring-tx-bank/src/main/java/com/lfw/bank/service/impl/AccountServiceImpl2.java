package com.lfw.bank.service.impl;

import com.lfw.bank.dao.AccountDao;
import com.lfw.bank.pojo.Account;
import com.lfw.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {
        accountDao.insert(act);
        // 模拟异常
        String s = null;
        s.toString();
        System.out.println(s);
        // 事儿没有处理完，这个大括号当中的后续也许还有其他的DML语句。
    }
}
