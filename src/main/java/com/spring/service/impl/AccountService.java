package com.spring.service.impl;

import com.spring.dao.impl.AccountDao;
import com.spring.domain.Account;
import com.spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountService implements IAccountService {
    @Autowired
    private AccountDao accountDao;

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findOne(int id) {
        return accountDao.findOne(id);
    }

    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }
}
