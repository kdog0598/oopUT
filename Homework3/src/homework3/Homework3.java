/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author kwilson38
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Input number of years: ");
        double numberOfYears = input.nextDouble();
        System.out.print("Input interest rate (7% as 7, 10% as 10): ");
        double annualInterestRate = input.nextDouble();
        System.out.println("");
        
//        double loanAmount = 10000;
//        double numberOfYears = 1;
//        double annualInterestRate = 7;
        
        
        
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        double totalPayment = monthlyPayment* numberOfYears * 12;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);

        double balance = loanAmount;
        System.out.println("");
            System.out.println("");
            System.out.println("Payment#" + "      " + "Interest" + "\t\t" + "Principal" + "\t" + "Balance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest;
            double principal;
            if (i == 12 && balance > 0) {
                interest = monthlyInterestRate * balance;
                principal = monthlyPayment - interest/* + balance*/;
                balance = balance - principal;
                principal += balance;
                balance -= balance;
            }
            else{
                interest = monthlyInterestRate * balance;
                principal = monthlyPayment - interest;
                balance = balance - principal; 
            }
            
            System.out.format(i + "\t\t" + "%.2f" + "\t\t" + "%.2f" + "\t\t" + "%.2f%n", interest, principal, balance);
        }
    }
    
}

// public double getMonthlyPayment() {
//    double monthlyInterestRate = annualInterestRate / 1200;
//    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
//    return monthlyPayment;    
//  }
//
//  /** Find total payment */
//  public double getTotalPayment() {
//    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
//    return totalPayment;    
//  }