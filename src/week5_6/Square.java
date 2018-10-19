/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author CCNE
 */
public class Square extends Shape{
    public Toado A,B,C,D;
    public void setA(Toado x){
        this.A= x;
    }
    public void setB(Toado x){
        this.B= x;
    }
    public void setC(Toado x){
        this.C= x;
    }
    public void setD(Toado x){
        this.D= x;
    }
    
    public Toado getA(){
        return A;
    }
    public Toado getB(){
        return B;
    }
    public Toado getc(){
        return C;
    }
    public Toado getD(){
        return D;
    }
 
        
    
     public Square(String color, Toado A, Toado B, Toado C, Toado D){
        this.A= A;
        this.B = B;
        this.C = C;
        this.D = D;
        super.setColor(color);
        
    }
    
    public double Length(){
        double x = (A.getX() - B.getX());
        double y = (A.getY() - B.getY());
        double length = Math.sqrt(x*x+y*y);
        return length;
    }
    
    @Override
    public String toString(){
        return "Length" + Length();
    }
}
