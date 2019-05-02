package com.akbar.app;

import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    private LoanCalculationService loanCalculationService;
    private EscrowCalculationService escrowCalculationService;

    public CalculationService(LoanCalculationService loanCalculationService, EscrowCalculationService escrowCalculationService) {
        this.loanCalculationService = loanCalculationService;
        this.escrowCalculationService = escrowCalculationService;
    }

    public double getTotalMonthlyPayment(int loan, double rate, int termMonth, double monthlyTaxes, double monthlyInsurance) {
        double monthlyLoan = loanCalculationService.getMonthlyTotalLoan(loan, rate, termMonth);
        double monthlyEscrow = escrowCalculationService.getMonthlyEscrow(monthlyTaxes, monthlyInsurance);

        return monthlyLoan + monthlyEscrow;
    }


}
