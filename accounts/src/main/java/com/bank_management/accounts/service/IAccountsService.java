package com.bank_management.accounts.service;

import com.bank_management.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

}
