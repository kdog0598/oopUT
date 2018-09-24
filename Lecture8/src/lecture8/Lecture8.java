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
    public static int sum(int i1, int i2) {
        int result = 0; 
        for (int i = i1; i <= i2; i++) 
            result += i; 
  	
        return result; 
    }
    
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1,10));
        System.out.println("Sum from 20 to 37 is " + sum(20,37));
        System.out.println("Sum from 35 to 45 is " + sum(35,45));
    }
    
}