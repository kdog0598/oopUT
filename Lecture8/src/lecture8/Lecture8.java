/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture8;

import java.util.Arrays;
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
//    
//    public static double printSum(double x1, double x2) {
//        return x1 + x2;
//    }
    
    public static void main(String[] args) {
//        int[] values = new int[5000];
//        for (int i = 1; i < values.length; i++){
//            values[i]=(int) (Math.random()*100);
//        }
////        values[0]=values[1]+values[500];
//        System.out.println(Arrays.toString(values));
//        Arrays.sort(values);
//        System.out.println(Arrays.toString(values));
        gradeExam();
    }
    
//    public static void selectionSort(int[] list) {
//        for (int i = 0; i < list.length; i++) {
////            Find the minimum in the list[i..list.length-1]
//            int currentMin = list[i];
//            int currentMinIndex = i;
//            for (int j = i + 1; j < list.length; j++) {
//                if (currentMin > list[j]) {
//                    currentMin = list[j];
//                    currentMinIndex = j;
//                }
//            }
//
//          // Swap list[i] with list[currentMinIndex] if necessary;
//                if (currentMinIndex != i) {
//                    list[currentMinIndex] = list[i];
//                    list[i] = currentMin;
//                }
//        }
//    }
    public static void calculator(String[] args) {
//      Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

//        The result of the operation
        int result = 0;

//        Determine the operator
        switch (args[1].charAt(0)) { 
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }
        

//        Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }




    public static void gradeExam() {
        // Students' answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
        // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
    }
    


}