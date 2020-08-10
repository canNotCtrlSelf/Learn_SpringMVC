package com.cncs.service;

import com.cncs.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface AccountService {


    /**
     * 查找所有
     */
    List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);
}
