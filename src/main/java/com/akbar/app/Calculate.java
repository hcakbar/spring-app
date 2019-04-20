package com.akbar.app;

import org.springframework.stereotype.Component;

@Component
public class Calculate {

    private LoanCalculate loanCalculate;
    private EscrowCalculate escrowCalculate;

    public Calculate(LoanCalculate loanCalculate, EscrowCalculate escrowCalculate) {
        this.loanCalculate = loanCalculate;
        this.escrowCalculate = escrowCalculate;
    }

    public double getTotalMonthlyPayment(int loan, double rate, int termMonth, double monthlyTaxes, double monthlyInsurance) {
        double monthlyLoan = loanCalculate.getMonthlyTotalLoan(loan, rate, termMonth);
        double monthlyEscrow = escrowCalculate.getMonthlyEscrow(monthlyTaxes, monthlyInsurance);

        return getTotal(monthlyLoan, "+", monthlyEscrow);
    }


    private double getTotal(double firstNum, String symbol, double secondNum) {
        double total = 0;
        switch (symbol.trim().toLowerCase()) {
            case "+":
                total = firstNum + secondNum;
                break;
            case "-":
                total = firstNum - secondNum;
                break;
            case "*":
                total = firstNum * secondNum;
                break;
            case "/":
                total = firstNum / secondNum;
                break;
            case "%":
                total = firstNum % secondNum;
                break;
            default:
                System.err.println("!!!!!!!!! You entered invalid symbol [ " + symbol + " ] try with one of the valid operators !!!!!!!!!");
        }
        return total;
    }

}
