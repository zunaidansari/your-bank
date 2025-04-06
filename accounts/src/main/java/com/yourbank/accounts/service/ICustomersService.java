package com.yourbank.accounts.service;

import com.yourbank.accounts.dto.CustomerDetailsDto;


public interface ICustomersService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber,String correlationId);
}
