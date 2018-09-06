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
        //Homework1.sumOfSquares();
        Homework1.sphereCircleArea();
    }
    
    public static void gallonsToLiters(){
        
    }
    
    public static void sumOfSquares(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int userdigits = userdigits = input.nextInt();
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
    public static void sphereCircleArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double surfacearea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area for a sphere with radius, " + radius + " units, is " + surfacearea + " units cubed.");
    }
    
}
