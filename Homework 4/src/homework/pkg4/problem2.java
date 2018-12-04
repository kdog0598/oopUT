/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg4;

/**
 *
 * @author kdog0
 */
public class problem2 {

    public static void main(String[] args) {
        StraightLine line = new StraightLine(2,7,5);
    }
}

class StraightLine {
    private double a;
    private double b;
    private double c;
    
    StraightLine(double a, double b, double c) {
    
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public void setB(double b){
        this.b = b;
    }
    
    public void setC(double a){
        this.c = c;
    }
    
    public double getXIntercept(){
        double xintercept = (-1 * ((0+this.c)/this.a));
        return xintercept;
    }
    
    public double getYIntercept(){
        double yintercept = (-1 * ((0+this.c)/this.b));
        return yintercept;
    }
    
    public double getYCoord(double Xcoordinate){
        double yCoord = (-1 * (((this.a * Xcoordinate)+this.c)/this.a));
        return yCoord;
    }
}