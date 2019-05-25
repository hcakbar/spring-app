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
        getMonthlyPayment(actionForm);
        return mapping.findForward("loan");
    }

    private void getMonthlyPayment(LoanCalculationActionForm actionForm) {
        actionForm.setTotalMonthlyPayment(getLoan(actionForm) + getEscrows(actionForm));
    }

    //TODO use loan calculation formula
    private double getLoan(LoanCalculationActionForm actionForm) {
        double loan = actionForm.getLoanAmount() / actionForm.getLoanTermYear();
        double interest = loan * (actionForm.getLoanRate() / 100);
        return loan + interest;
    }

    private double getEscrows(LoanCalculationActionForm actionForm) {
        return (actionForm.getTaxes() / 12) + (actionForm.getInsurance() / 12);
    }


}
