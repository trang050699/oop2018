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
public class Shape {
    public String color ;
    public void Shape(){
        
    }
    public void Shape(String color){
        this.color = color;
    }
    public void setColor(String Color){
        this.color = Color;
    }
    public String getColor(){
        return this.color;
    }
    
    @Override
    public String toString(){
        return "Color: "+ this.color ;
    }
}
