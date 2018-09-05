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
        //Welcome.OOP();
        //System.out.println();
        //Welcome.CelsiusToFahren();
        //System.out.println();
        //Welcome.CircleArea();
        //System.out.println();
        //Welcome.Summ();
        //Welcome.RectArea();
        //Welcome.Speed();
        //Welcome.secondsToMinutes();
        Welcome.byteTest();
        
        
    }
    public static void OOP(){
        System.out.println("Welcome to Java!");
        System.out.println("This is a Java Class.");    
    }
    public static void celsiusToFahren(){
        System.out.println();
        System.out.println("35 °C is " + ((9.0 / 5.0) * 35 + 32) + " °F");
    }
    public static void circleArea(){
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
    
    public static void summ(){
        double sum;
        sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(sum);
    }
    
    public static void rectArea(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        
        System.out.println("Enter height: ");
        double height = input.nextDouble();
        
        double area;
        area = width * height;
        
        double perimeter;
        perimeter = 2 * (width + height);
        
        System.out.println("For a rectangle with a width of " + width + " and a height of " + height + ", the area is " + area + " and perimeter is " + perimeter + ".");
        
    }
    
    public static void speed(){
        double hours = 1;
        double min = 40;
        double sec = 35.0;
        
        double totalmin;
        double totalhours;
        totalmin = 40 + (sec/60);
        totalhours = 1 + (totalmin/60);
        
        //System.out.println(hours);
        double miles;
        miles = 24;
        double km;
        km = miles * 1.60934;
        double kmperh;
        kmperh = km / totalhours;
        System.out.println("A " + miles + " mile run that lasts " + hours + " hour(s) " + min + " minute(s) and " + sec + " second(s) has an average speed of " + kmperh + " km/h.");
    }
    public static void secondsToMinutes(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        int OrigSeconds = seconds;
        int minutes;
        minutes = seconds / 60;
        seconds %= 60;
        System.out.println(OrigSeconds + " seconds is equal to " + minutes + " minutes and " + seconds + " seconds.");
    }
    public static void byteTest(){
        byte test = 127;
        System.out.println(test);
        test += 1;
        System.out.println(test);
        
    }
}
