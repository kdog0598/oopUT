/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture2;

import java.util.Scanner;

/**
 *
 * @author kwilson38
 */
public class Welcome {
    public static void main(String[] args) {
        Welcome.OOP();
        System.out.println();
        Welcome.CelsiusToFahren();
        System.out.println();
        Welcome.CircleArea();
        System.out.println();
        
        
        
    }
    public static void OOP(){
        System.out.println("Welcome to Java!");
        System.out.println("This is a Java Class.");    
    }
    public static void CelsiusToFahren(){
        System.out.println();
        System.out.println("35 °C is " + ((9.0 / 5.0) * 35 + 32) + " °F");
    }
    public static void CircleArea(){
        //Ask for radius
        System.out.print("Enter a radius value: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area;
        
        //Computer Area
        area = radius * radius * 3.1415916;
        
        //Display results
        System.out.println("The area for a circle with a radius of " + radius + " units is " + area + " square units.");
    }
}
