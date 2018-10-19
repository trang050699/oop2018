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
public class Cỉrcle extends Shape {
    public Toado I;
    public double r;
    final public double pi = 3.14;
    public void Circle(String color, Toado I, double r ){
        this.I = I;
        this.r = r;
        super.setColor(color);
    }
    public void setI(Toado I){
        this.I = I;
    }
    public void setR(double R){
        this.r = R;
    }
    public Toado getI(){
        return I;
    }
    public double getR(){
        return r;
    }
    
    @Override
    public String toString(){
        return "Tâm: " + getI() +"/n"+ " r = " + getR();
    }
}
