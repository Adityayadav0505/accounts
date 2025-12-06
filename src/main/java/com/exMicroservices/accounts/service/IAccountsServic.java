package com.exMicroservices.accounts.service;

import com.exMicroservices.accounts.dto.CustomerDto;

public interface IAccountsServic {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
