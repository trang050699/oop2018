/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape{
    public double radius = 1.0;
    final public double pi= 3.14;
    public void Circle(double radius){
        
    }
    public void Circle(double radius,String color, boolean filled){
        
    }
    public void setRadius(double Radius){
        this.radius = Radius;
}
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area= (pi*radius*radius);
        return area;
    }
    public double getPerimeter(){
        double perimeter= (2*pi*radius);
        return perimeter;
    }
    public String toString(){
        return "Area: "+ this.getArea()+ "/n" + "Perimeter: "+ this.getPerimeter();
        //super.toString();
    }
    
}
