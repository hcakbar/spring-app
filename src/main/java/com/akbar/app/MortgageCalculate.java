package com.akbar.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MortgageCalculate {

    @Bean
    public LoanCalculationService getMonthlyTotalLoan() {
        return new LoanCalculationService();
    }

    @Bean
    public EscrowCalculationService getMonthlyEscrow() {
        return new EscrowCalculationService();
    }

    @Bean
    public UserController addUser() {
        return new UserController();
    }

}
