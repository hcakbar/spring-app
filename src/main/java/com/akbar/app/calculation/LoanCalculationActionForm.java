package com.akbar.app.calculation;

import org.apache.struts.action.ActionForm;

public class LoanCalculationActionForm extends ActionForm {

    private String email;
    private int loanAmount;
    private double loanRate;
    private int loanTermMonth;
    private double taxes;
    private double insurance;
    private double totalMonthlyPayment;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }

    public int getLoanTermMonth() {
        return loanTermMonth;
    }

    public void setLoanTermMonth(int loanTermMonth) {
        this.loanTermMonth = loanTermMonth;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getTotalMonthlyPayment() {
        return totalMonthlyPayment;
    }

    public void setTotalMonthlyPayment(double totalMonthlyPayment) {
        this.totalMonthlyPayment = totalMonthlyPayment;
    }


}
