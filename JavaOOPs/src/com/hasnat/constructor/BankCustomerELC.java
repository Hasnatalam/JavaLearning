package com.hasnat.constructor;

import java.util.Scanner;

public class BankCustomerELC {

    public static void main(String[] args) {
        Bank sbi = new Bank();
        Scanner sc = new Scanner(System.in);

        // Input bank and customer details
        System.out.print("Please enter your name: ");
        String bankCustomerName = sc.nextLine();
        System.out.print("Please enter bank name: ");
        String bankName = sc.nextLine();
        System.out.print("Please enter bank address: ");
        String bankAddress = sc.nextLine();
        System.out.print("Please enter bank IFSC Code: ");
        String bankIFSCCode = sc.nextLine();
        System.out.print("Please enter customer account number: ");
        int customerAccountNumber = sc.nextInt();
        System.out.print("Please enter current balance: ");
        int currentBalance = sc.nextInt();

        // Set bank and customer details
        sbi.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);

        // Perform withdrawal operation
        System.out.print("Please enter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        sbi.withdraw(withdrawAmount);

        // Perform deposit operation
        System.out.print("Please enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        sbi.deposit(depositAmount);

        // Display customer details
        System.out.println(sbi.displayDetails());

        sc.close();
    }
}
