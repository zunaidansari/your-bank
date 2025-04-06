package com.yourbank.loans.service;

import com.yourbank.loans.dto.LoansDto;

public interface ILoansService {

    void createLoan(String mobileNumber);


    LoansDto fetchLoan(String mobileNumber);


    boolean updateLoan(LoansDto loansDto);


    boolean deleteLoan(String mobileNumber);

}
