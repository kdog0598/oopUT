/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;

//Kieran Wilson
//CSET 1200
//Rehan Ahmad
//Homework 1
//9/8/18


public class Homework1 {
    
    public static void main(String[] args) {
        Homework1.gallonsToLiters();
        Homework1.sumOfSquares();
        Homework1.sphereCircleArea();
        Homework1.gradeTable();
    }
    
    //Problem 1
    
    public static void gallonsToLiters(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();
        double liters = gallons * 3.785412;
        System.out.println(gallons + " gallons equals " + (Math.round(liters * 100.0) / 100.0) + " liters.");
    }
    
    //Problem 2
    
    public static void sumOfSquares(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int userdigits = input.nextInt();
        int origuserdigits = userdigits;
        int digit1 = userdigits % 10;
        userdigits /= 10;
        int digit2 = userdigits % 10;
        userdigits /= 10;
        int digit3 = userdigits % 10;
        userdigits /= 10;
        int digit4 = userdigits % 10;
        System.out.println("The sum of the sqaures of the digits of " + origuserdigits + " is " + (Math.pow(digit1, 2) + Math.pow(digit2, 2) + Math.pow(digit3, 2) + Math.pow(digit4, 2)) + ".");
    }
    
    //Problem 3
    
    public static void sphereCircleArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double surfacearea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area for a sphere with radius, " + radius + " units, is " + (Math.round(surfacearea *100.0)/100.0) + " units cubed.");
    }
    
    //Problem 4
    
    public static void gradeTable(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Phyiscs grade: ");
        int physicsgrade = input.nextInt();
        System.out.print("\nEnter Chemistry grade: ");
        int chemgrade = input.nextInt();
        System.out.print("\nEnter Maths grade: ");
        int mathgrade = input.nextInt();
        float physicspercent =  Math.round(((physicsgrade / 150F) * 100.0F) * 100F ) / 100.0F;
        float chempercent =  Math.round(((chemgrade / 150F) * 100.0F) * 100F ) / 100.0F;
        float mathpercent =  Math.round(((mathgrade / 150F) * 100.0F) * 100F ) / 100.0F;
        System.out.println("Subject     Marks Obtained      Total Marks     Percentage");
        System.out.println("Physics          " + physicsgrade + "                150            " + physicspercent + "  ");
        System.out.println("Chemistry        " + chemgrade + "                150            " + chempercent + "  ");
        System.out.println("Maths            " + mathgrade + "                150            " + mathpercent + "  ");
    }
    
}
