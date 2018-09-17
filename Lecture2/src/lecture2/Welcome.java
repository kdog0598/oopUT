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
        //Welcome.byteTest();
        //Welcome.bmiCalc();
        //Welcome.birthdayGuess(args);
        //Welcome.irregularArea();
        Welcome.characterStuff();
        
        
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
    
    public static void bmiCalc(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        float weight = input.nextFloat();
        System.out.print("\nInput inches in inches: ");
        float height = input.nextFloat();
        float bmi = weight / height / height * 703;
        String bmiindex = null;
        if (bmi < 15){
            bmiindex = "very severly underweight";
        }
        else if (bmi < 16){
            bmiindex = "severly underweight";
        }
        else if (bmi < 18.5){
            bmiindex = "underweight";
        }
        else if (bmi < 25){
            bmiindex = "normal";
        }
        else if (bmi < 30){
            bmiindex = "overweight";
        }
        else if (bmi < 35){
            bmiindex = "moderately obese";
        }
        else if (bmi < 40){
            bmiindex = "severly obese";
        }
        else if (bmi < 45){
            bmiindex = "very severly obese";
        }
        else if (bmi < 50){
            bmiindex = "morbidly obese";
        }
        else if (bmi < 60){
            bmiindex = "super obese";
        }
        else if (bmi > 60){
            bmiindex = "hyper obese";
        }
        
        System.out.println("Your BMI is "+bmi+". This is categorized as " + bmiindex + ".");
        //System.out.println(bmi);
    }
    public static void birthdayGuess(String[] args) {
        String set1 =
            " 1  3  5  7\n" +
            " 9 11 13 15\n" +
            "17 19 21 23\n" +
            "25 27 29 31";

        String set2 =
            " 2  3  6  7\n" +
            "10 11 14 15\n" +
            "18 19 22 23\n" +
            "26 27 30 31";

        String set3 =
            " 4  5  6  7\n" +
            "12 13 14 15\n" +
            "20 21 22 23\n" +
            "28 29 30 31";

        String set4 =
            " 8  9 10 11\n" +
            "12 13 14 15\n" +
            "24 25 26 27\n" +
            "28 29 30 31";

        String set5 =
            "16 17 18 19\n" +
            "20 21 22 23\n" +
            "24 25 26 27\n" +
            "28 29 30 31";

        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to answer questions
        System.out.print("Is your birthday in Set 1?\n");
        System.out.print(set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();

        if (answer == 1)
            day += 1;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set 2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 2;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set 3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 4;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set 4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 8;

        // Prompt the user to answer questions
        System.out.print("\nIs your birthday in Set 5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();

        if (answer == 1)
            day += 16;

        System.out.println("\nYour birthday is " + day + "!");
    }
    
    public static void irregularArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input vertices in order, clockwise or counter-clockwise");
        System.out.print("Enter vertex 1 x value: ");
        float vx1 = input.nextFloat();
        System.out.print("Enter vertex 1 y value: ");
        float vy1 = input.nextFloat();
        System.out.print("Enter vertex 2 x value: ");
        float vx2 = input.nextFloat();
        System.out.print("Enter vertex 2 y value: ");
        float vy2 = input.nextFloat();
        System.out.print("Enter vertex 3 x value: ");
        float vx3 = input.nextFloat();
        System.out.print("Enter vertex 3 y value: ");
        float vy3 = input.nextFloat();
        System.out.print("Enter vertex 4 x value: ");
        float vx4 = input.nextFloat();
        System.out.print("Enter vertex 4 y value: ");
        float vy4 = input.nextFloat();
        
        float area = Math.abs(((vx1 * vy2 - vy1 * vx2) + (vx2*vy3-vy2*vx3) + (vx3*vy4-vy3*vx4) + (vx4*vy1-vy4*vx1))/2);
        System.out.println(area);
    }

    public static void characterStuff(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println(ch);
        
    }
}
