package com.spring.dao;

import com.spring.domain.Account;

import java.util.List;

public interface IAccountDao {
    void saveAccount(Account account);
    List<Account> findAll();
    Account findOne(int id);
    void deleteAccount(int id);
}
