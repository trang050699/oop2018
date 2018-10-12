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
public class Shape {
    public String color = "red";
    public boolean filled = true;
    public void Shape(){
        
    }
    public void Shape(String color, boolean filled){
        this.color = color;
        this.filled= filled;
    }
    public void setColor(String Color){
        this.color = Color;
    }
    public void isFilled(){
        
    }
    public String getColor(){
        return this.color;
    }
    public void setFilled(boolean Filled){
        this.filled = Filled;
    }
    public String toString(){
        return "Color: "+ this.color +"\n" + "Filled: "+ this.filled;
    }
}




