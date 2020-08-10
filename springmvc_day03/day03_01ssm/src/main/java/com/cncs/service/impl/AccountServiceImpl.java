package com.cncs.service.impl;

import com.cncs.dao.AccountDao;
import com.cncs.domain.Account;
import com.cncs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有。。。");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。");
        accountDao.saveAccount(account);
    }
}
