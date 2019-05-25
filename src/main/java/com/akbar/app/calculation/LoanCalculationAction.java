package com.akbar.app.calculation;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoanCalculationAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        LoanCalculationActionForm actionForm = (LoanCalculationActionForm) form;
        calculateMonthlyPayment(actionForm);
        return mapping.findForward("loan");
    }

    private void calculateMonthlyPayment(LoanCalculationActionForm actionForm) {
        int loanAmount = actionForm.getLoanAmount();
        int loanTerm = actionForm.getLoanTermYear() * 12;
        double interestRate = actionForm.getLoanRate() / (12 * 100);
        double monthlyTaxes = actionForm.getTaxes() / 12;
        double monthlyInsurance = actionForm.getInsurance() / 12;

        //EMI calculation formula: https://javatutoring.com/emi-java-program/
        double monthlyLoan = (loanAmount * interestRate) / (1 - Math.pow(1 + interestRate, -loanTerm));
        double monthlyPayment = monthlyLoan + monthlyTaxes + monthlyInsurance;
        actionForm.setTotalMonthlyPayment(monthlyPayment);
    }


}
