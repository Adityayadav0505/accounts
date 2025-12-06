package com.exMicroservices.accounts.service.impl;

import com.exMicroservices.accounts.dto.CustomerDto;
import com.exMicroservices.accounts.repository.AccountsRepository;
import com.exMicroservices.accounts.repository.CustomerRepository;
import com.exMicroservices.accounts.service.IAccountsServic;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsServic {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
