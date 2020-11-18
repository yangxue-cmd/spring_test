package com.spring.service;

import com.spring.domain.Account;

import java.util.List;

public interface IAccountService {
    void saveAccount(Account account);
    List<Account> findAll();
    Account findOne(int id);
    void deleteAccount(int id);
}
