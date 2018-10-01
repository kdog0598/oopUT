/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture8;

import java.util.Scanner;

/**
 *
 * @author kwilson38
 */
public class Lecture8 {
//    public static double printSum(int x1, int x2) {
//        return x1 + x2;
//    }
//    
//    public static double printSum(int x1, double x2) {
//        return x1 + x2;
//    }
//    
//    public static double printSum(double x1, int x2) {
//        return x1 + x2;
//    }
    
    public static double printSum(double x1, double x2) {
        return x1 + x2;
    }
    
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter numbers: ");
//        double x1 = input.nextDouble();
//        double x2 = input.nextDouble();
//        System.out.printf("The sum is %.4f",printSum((double) 2, (double) 8.453));
//        System.out.println();
        int[] values = new int[501];
        for (int i = 1; i < values.length; i++){
            values[i]=i+values[i-1];
        }
        values[0]=values[1]+values[500];
        System.out.println(values[500]);
    }
    
}
