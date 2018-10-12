/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author CCNE
 */
public class Rectangle extends Shape{
    public double width = 1.0;
    public double length = 1.0;
    public void Rectangle(){
        
    }
    public void Circle(double width, double length){
        
    }
    public void Circle(double width, double length, String color, boolean filled){
        
    }
    public void setWidth(double Width){
        this.width = Width;
}
    public double getWidth(){
        return width;
    }
    public void setLength(double Length){
        this.length = Length;
}
    public double getLength(){
        return length;
    }
    public double getArea(){
        double area= width*length;
        return area;
    }
    public double getPerimeter(){
        double perimeter= (2*(width+length));
        return perimeter;
    }
    
}
