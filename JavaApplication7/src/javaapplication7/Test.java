/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author kdog0
 */
class TempClass {
    int i;
    public void TempClass(int j) {
        int i = j;
    }
    TempClass(int j){
        
    }
}

public class Test {
    public static void main(String[] args) {
        TempClass temp = new TempClass(2);
    }
}