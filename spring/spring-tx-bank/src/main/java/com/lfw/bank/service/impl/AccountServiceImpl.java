package com.lfw.bank.service.impl;

import com.lfw.bank.dao.AccountDao;
import com.lfw.bank.pojo.Account;
import com.lfw.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        // 查询账户余额是否充足
        Account fromAct = accountDao.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("账户余额不足");
        }
        // 余额充足，开始转账
        Account toAct = accountDao.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);
        int count = accountDao.update(fromAct);

        // 模拟异常
        String s = null;
        s.toString();

        count += accountDao.update(toAct);
        if (count != 2) {
            throw new RuntimeException("转账失败，请联系银行");
        }
    }

    // 第三步：如果执行业务流程过程中，没有异常。提交事务
    // 第四步：如果执行业务流程过程中，有异常，回滚事务

    // withdraw();

    @Transactional(propagation = Propagation.REQUIRED)
    public void withdraw() {
    }

    @Resource(name = "accountService2")
    private AccountService accountService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        // 这里调用 dao 的 insert 方法。
        accountDao.insert(act);  // 保存act-003账户

        Account act2 = new Account("act-004", 1000.0);
        try {
            accountService.save(act2);   //保存 act-004 账户
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 继续往后进项我当前1号事务自己的事
    }
}
