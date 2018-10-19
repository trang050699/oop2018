/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author VIP
 */
public class Rectangle extends Shape{
    public Toado A,B,C,D;
    //getter
    public void getA(Toado x){
        this.A= x;
    }
    public void getB(Toado x){
        this.B= x;
    }
    public void getC(Toado x){
        this.C= x;
    }
    public void getD(Toado x){
        this.D= x;
    }
    //setter
    public Toado setA(){
        return A;
    }
    public Toado setB(){
        return B;
    }
    public Toado setc(){
        return C;
    }
    public Toado setD(){
        return D;
    }
    
    public Rectangle(String collor, Toado A, Toado B, Toado C, Toado D){
        this.A= A;
        this.B = B;
        this.C = C;
        this.D = D;
        super.setColor(collor);
    }
    public double Length(){
        double x = (A.setX() - B.setX())*(A.setX() - B.setX());
        double y = (A.setY() - B.setY())*(A.setY() - B.setY());
        double length = Math.sqrt(x*x+y*y);
        return length;
    }
    public double Width(){
        double x = (A.setX() - D.setX())*(A.setX() - D.setX());
        double y = (A.setY() - D.setY())*(A.setY() - D.setY());
        double width = Math.sqrt(x*x+y*y);
        return width;
    }
    public String toString(){
        return "Length" + Length()+ "/n" + "Width" + Width();
    }
}
