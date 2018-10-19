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
public class Triangle extends Shape{
    public Toado A,B,C;
     public void getA(Toado x){
        this.A= x;
    }
    public void getB(Toado x){
        this.B= x;
    }
    public void getC(Toado x){
        this.C= x;
    }
    
    public Toado setA(){
        return A;
    }
    public Toado setB(){
        return B;
    }
    public Toado setc(){
        return C;
    }
    
    public void Triangle(String color, Toado A, Toado B, Toado C){
        this.A= A;
        this.B = B;
        this.C = C;
        super.setColor(color);
        
    }
     public double AB(){
         double x = (A.getX() - B.getX());
        double y = (A.getY() - B.getY());
        double AB = Math.sqrt(x*x+y*y);
        return AB;
     }
     public double BC(){
         double x = (C.getX() - B.getX());
        double y = (C.getY() - B.getY());
        double BC = Math.sqrt(x*x+y*y);
        return BC;
     }
     public double AC(){
         double x = (A.getX() - C.getX());
        double y = (A.getY() - C.getY());
        double AC = Math.sqrt(x*x+y*y);
        return AC;
     }
     public double chuvi(){
         return (AB()+ BC()+AC());
     }
     public double dientich(){
         double nuachuvi = chuvi()/2;
         return Math.sqrt(nuachuvi*(nuachuvi-AB())*(nuachuvi-BC())*nuachuvi-AC());
     }
     
     @Override
     public String toString(){
         return "chu vi tam giac:" + chuvi()+"/n"+ "dien tich tam giac" + dientich();
     }    
}
