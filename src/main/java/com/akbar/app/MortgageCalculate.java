package com.akbar.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MortgageCalculate {

    @Bean
    public LoanCalculate getMonthlyTotalLoan() {
        return new LoanCalculate();
    }

    @Bean
    public EscrowCalculate getMonthlyEscrow() {
        return new EscrowCalculate();
    }

}
