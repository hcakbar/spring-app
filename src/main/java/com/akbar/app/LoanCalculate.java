package com.akbar.app;

public class LoanCalculate {


    public double getMonthlyInterest(int loan, double rate) {
        return (loan * rate) / 12;
    }

    public double getMonthlyTotalLoan(int loan, double rate, int termMonth) {
        return (loan / termMonth) + getMonthlyInterest(loan, rate);
    }

}
