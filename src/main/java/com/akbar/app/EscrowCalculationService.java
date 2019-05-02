package com.akbar.app;

public class EscrowCalculationService {

    public double getMonthlyEscrow(double monthlyTaxes, double monthlyInsurance) {
        return monthlyTaxes + monthlyInsurance;
    }


}
