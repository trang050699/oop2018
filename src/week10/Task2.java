package week10;


import java.util.Random;


public class Task2 {
    public static void main(String[] args){
        Random s = new Random();
        int[] a = new int[100];
        for(int i=0;i<100;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Day so ban dau:");
        for(int i=0; i<100; i++){
            System.out.print(a[i]+" ");
        }
        int x;
        for(int i=0;i<100;i++){
            for(int y=0;y<100-i;y++){
                if(a[y]>a[y+1]){
                    x=a[y];
                    a[y]=a[y+1];
                    a[y+1]=x;
                }
            }
        }
        System.out.println("Day so sau khi sap xep:");
        for(int i=0;i<100;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
