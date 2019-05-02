package com.akbar.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MortgageCalculationConfiguration {

    @Bean
    public LoanCalculationService loanCalculation() {
        return new LoanCalculationService();
    }

    @Bean
    public EscrowCalculationService escrowCalculation() {
        return new EscrowCalculationService();
    }


}
