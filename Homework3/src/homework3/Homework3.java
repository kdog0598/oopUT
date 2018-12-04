/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author kwilson38
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nested();
        loan();
        printMatrix(5);
        checkSort();
        employeeHours();
    }
    
    public static void nested(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
    }
    
    public static void loan() {
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
    
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols ++) {
                System.out.print((int)(Math.random() * 2));
            }
            System.out.println();
        }
    }

    
    public static void checkSort() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of items: ");
        int arraySize = input.nextInt();
        int testSort [] = new int[arraySize];
        

        System.out.print("Input numbers in array. (i.e. 4 enter 8 enter): ");

        for (int i = 0 ; i < testSort.length; i++ ) {
           testSort[i] = input.nextInt();
        }
        
        int [] sorted = Arrays.copyOf(testSort, testSort.length);
        Arrays.sort(sorted);
        for( int i = 0; i < sorted.length/2; ++i ) { 
            int temp = sorted[i]; 
            sorted[i] = sorted[sorted.length - i - 1]; 
            sorted[sorted.length - i - 1] = temp; 
        }
        if (Arrays.equals(testSort, sorted) == true){
            System.out.println("The list is already sorted.");
        }
        else {
            System.out.println("The list is not sorted.");
        }
//        System.out.println(Arrays.toString(testSort));
//        System.out.println(Arrays.toString(sorted));
    }

    public static void employeeHours(){
    
    }
}