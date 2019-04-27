package com.akbar.app;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String email;
    @Column
    private int loanAmount;
    @Column
    private double loanRate;
    @Column
    private int loanTermMonth;
    @Column
    private double taxes;
    @Column
    private double insurance;
    @Column
    private double totalMonthlyPayment;

    public UserEntity(String email, int loanAmount, double loanRate, int loanTermMonth, double taxes, double insurance, double totalMonthlyPayment) {
        this.email = email;
        this.loanAmount = loanAmount;
        this.loanRate = loanRate;
        this.loanTermMonth = loanTermMonth;
        this.taxes = taxes;
        this.insurance = insurance;
        this.totalMonthlyPayment = totalMonthlyPayment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
