package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {

    /**
     *
     * @param mobileNumber - Mobile Number of the customer
     */
    void createLoan(String mobileNumber);

    /**
     * @param mobileNumber - Mobile Number of the customer
     * @return Loan Details based on a given mobile number
     */
    LoansDto fetchLoan(String mobileNumber);

    boolean updateLoan(LoansDto loansDto);

    boolean deleteLoan(String mobileNumber);
}
