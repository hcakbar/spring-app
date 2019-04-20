package com.akbar.app;

import org.springframework.stereotype.Component;

@Component
public class CalculatePayment {

    private LoanCalculate loanCalculate;
    private EscrowCalculate escrowCalculate;

    public CalculatePayment(LoanCalculate loanCalculate, EscrowCalculate escrowCalculate) {
        this.loanCalculate = loanCalculate;
        this.escrowCalculate = escrowCalculate;
    }

    public double getTotalMonthlyPayment(int loan, double rate, int termMonth, double monthlyTaxes, double monthlyInsurance) {
        double monthlyLoan = loanCalculate.getMonthlyTotalLoan(loan, rate, termMonth);
        double monthlyEscrow = escrowCalculate.getMonthlyEscrow(monthlyTaxes, monthlyInsurance);

        return monthlyLoan + monthlyEscrow;
    }


}
