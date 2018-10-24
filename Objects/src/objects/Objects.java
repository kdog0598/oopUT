/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author kwilson38
 */
public class Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle();
        System.out.println(c1.radius + " " + c1.getArea());
        System.out.println(c2.getRadius());
        
    }
    
}

class Circle {
    double radius = 1.0;
    
    Circle() {
    }
    
    Circle(double newRadius) {
        radius = newRadius;
    }
    
    double getRadius(){
        return radius;
    }
    
    double getArea() {
        return radius * radius * Math.PI;
    }
}