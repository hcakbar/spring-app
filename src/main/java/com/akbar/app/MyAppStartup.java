package com.akbar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class MyAppStartup {

    public static void main(String... args) {
        ApplicationContext applicationContext = SpringApplication.run(MyAppStartup.class, args);
        CalculationService total = applicationContext.getBean(CalculationService.class);
        UserService userService = applicationContext.getBean(UserService.class);

        //user input
        Scanner in = new Scanner(System.in);
        System.out.println("\n====================");
        System.out.println("Loan Calculation App");
        System.out.println("====================\n");
        System.out.print("Enter email address: ");

        String email = in.next();

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

        double monthlyTotal = total.getTotalMonthlyPayment(loan, rate, termMonth, monthlyTaxes, monthlyInsurance);
        System.out.println("Total : " + monthlyTotal);

        //store in repository
//        UserController userController = new UserController();
//        userController.addUser(new UserEntity(email, loan, rate, termMonth, monthlyTaxes, monthlyInsurance, monthlyTotal));

        userService.addUser(new UserEntity(email, loan, rate, termMonth, monthlyTaxes, monthlyInsurance, monthlyTotal));
        userService.addUser(new UserEntity("abc@test.com", loan, rate, termMonth, monthlyTaxes, monthlyInsurance, monthlyTotal));
        userService.addUser(new UserEntity("xyz@test.com", loan, rate, termMonth, monthlyTaxes, monthlyInsurance, monthlyTotal));
    }

}
