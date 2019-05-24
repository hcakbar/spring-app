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
//        actionForm.setTotalMonthlyPayment(1200.00);

         getLoan(actionForm);
        return mapping.findForward("loan");
    }

    private double getLoan(LoanCalculationActionForm actionForm) {
        double total = 0;
        //TODO do some stuff here



        return total;
    }



}
