package com.akbar.app.calculation;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.ServletRequest;

public class LoanCalculationActionForm extends ActionForm {

    private String email;
    private int loanAmount;
    private float loanRate;
    private int loanTermYear;
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

    public float getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(float loanRate) {
        this.loanRate = loanRate;
    }

    public int getLoanTermYear() {
        return loanTermYear;
    }

    public void setLoanTermYear(int loanTermYear) {
        this.loanTermYear = loanTermYear;
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

    @Override
    public ActionErrors validate(ActionMapping mapping, ServletRequest request) {
        ActionErrors actionErrors = new ActionErrors();
        if (email.equals("")) {
            actionErrors.add("email_e", new ActionMessage("email_error"));
        }
        if (loanAmount == 0) {
            actionErrors.add("loan_e", new ActionMessage("loan_error"));
        }
        if (loanRate == 0) {
            actionErrors.add("rate_e", new ActionMessage("rate_error"));
        }
        if (loanTermYear == 0) {
            actionErrors.add("term_e", new ActionMessage("term_error"));
        }
        return actionErrors;
    }


}
