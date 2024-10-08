package com.bank_management.accounts.service.impl;

import com.bank_management.accounts.dto.CustomerDto;
import com.bank_management.accounts.repository.AccountsRepository;
import com.bank_management.accounts.repository.CustomerRepository;
import com.bank_management.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
