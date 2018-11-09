package week9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utils {
   public static String readContentFromFile(String path) throws IOException{
       File file = new File("path");
       String s = "";
        try(Scanner trang = new Scanner(file)){
          
            while(trang.hasNext()){
               s = trang.nextLine();
            }
           
        
        return s;
    }
    public static void writeContentToFile(String path) throws FileNotFoundException{
        File file = new File("path");
        try(PrintWriter pw= new PrintWriter(file)){
            pw.println("Hello!");
        }
    }  
    public static void writeContentToFile2(String path) throws IOException{
        File file= new File("path");
        try(FileWriter fw= new FileWriter(file, true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw)   
                ){
            pw.println("hi hi hi");
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        
    }
    
    
    public static void main(String[] args) throws IOException{
     File file = new File("C:\\Users\\VIP\\Documents\\GitHub\\oop2018\\src\\week9\\trang.txt");
     file.createNewFile();
     File file1 = new File("C:\\Users\\VIP\\Documents\\GitHub\\oop2018\\src\\week9\\trang1.txt");
     file1.createNewFile();
    System.out.println(readContentFromFile(file.getAbsolutePath()));
    writeContentToFile(file1.getAbsolutePath());
    writeContentToFile2(file1.getAbsolutePath());
    }
}
