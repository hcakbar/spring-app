package com.akbar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class MyAppStartup {

    public static void main(String... args) {
        ApplicationContext applicationContext = SpringApplication.run(MyAppStartup.class, args);
        Calculate total = applicationContext.getBean(Calculate.class);

        //user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        int loan = in.nextInt();

        System.out.print("Enter interest rate: ");
        double rate = in.nextDouble();

        System.out.print("Enter term months: ");
        int termMonth = in.nextInt();

        System.out.print("Enter monthly taxes: ");
        double monthlyTaxes = in.nextDouble();

        System.out.print("Enter monthly insurance: ");
        double monthlyInsurance = in.nextDouble();


        System.out.println("Total : " + total.getTotalMonthlyPayment(loan, rate, termMonth, monthlyTaxes, monthlyInsurance));
    }

}
