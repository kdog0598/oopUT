/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import static java.lang.Math.sin;
import java.util.Scanner;

/**
 * Java Homework 2
 * Kieran Wilson
 * 
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        checkTriangle();
        checkCircle();
        findArea();
        checkLicense();
        countVowels();
    }
    
//    Problem 1
    public static void checkCircle(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Circle 1's center x-coordinate, y-coordinate, and radius (ex. 5 enter , 2 enter, 3 enter): ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble(); 
	double r1 = input.nextDouble();
	
        System.out.print("Enter circle2's center x-, y-coordinates, and radius (ex. 5 enter , 2 enter, 3 enter): ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble(); 
	double r2 = input.nextDouble(); 

	if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2)) 
            System.out.println("Circle 2 is inside Circle 1");
        else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2) 
            System.out.println("Circle 2 overlaps Circle 1");
        else
            System.out.println("Circle 2 does not overlap Circle 1");
    }
    
//    Problem 2
    public static void checkTriangle(){
        Scanner input = new Scanner(System.in);
        //input coords
        System.out.print("Input x1: ");
        int x1 = input.nextInt();
        System.out.print("Input y1: ");
        int y1 = input.nextInt();
        System.out.print("Input x2: ");
        int x2 = input.nextInt();
        System.out.print("Input y2: ");
        int y2 = input.nextInt();
        System.out.print("Input x3: ");
        int x3 = input.nextInt();
        System.out.print("Input y3: ");
        int y3 = input.nextInt();
        
        double length1 = lineLength(x1,y1,x2,y2);
        double length2 = lineLength(x2,y2,x3,y3);
        double length3 = lineLength(x3,y3,x1,y1);
        if ((length1 == length2) && (length2 == length3)){
            System.out.println("This triangle is equilateral.");
        }
        else{
            System.out.println("Triangle is not equilateral.");
        }
    }
    
    public static double lineLength(int x1, int y1, int x2, int y2){
        int length;
        length = (int) Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1),2)), 1/2);
        return length;
        
    }
    
//    Problem 3
    public static void findArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input side: ");
        double side_a = input.nextDouble();
        System.out.print("Enter angle: ");
        double angle_a = input.nextDouble();
        double side_b = side_a*Math.tan(angle_a);
        double area = (side_a*side_b)/2;
        System.out.println("The area is " + area + ".");
    }
    
//    Problem 4
    public static void checkLicense(){
        Scanner input = new Scanner(System.in);
        boolean licenseIsValid = true;
        while (licenseIsValid == true){
            System.out.print("Input License plate: ");
            String license = input.next();
            licenseIsValid = license.matches("(?i)[a-z]{3}\\d{4}");
            //System.out.println(licenseIsValid);
        }            
        
    }
    
//    Problem 5
    public static void countVowels(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        int vowels = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowels++;
            }
        }
        System.out.println("The string \"" + str + "\" has " + vowels + " vowels.");
    }
    
}