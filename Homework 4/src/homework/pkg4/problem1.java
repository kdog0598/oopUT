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
public class problem1 {

    public static void main(String[] args) {
        RandomInRange random = new RandomInRange(2,7);
        System.out.println(random.getRandom());
    }
}

class RandomInRange {
    private double a;
    private double b;
    private double value;
    
    RandomInRange(double a, double b) {
        double value = (Math.random()*( (b - a) + 1) ) + a;
        this.value = value;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public void setB(double b){
        this.b = b;
    }
    
    public double getRandom(){
        return this.value;
    }
}