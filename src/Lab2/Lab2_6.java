package Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kvs1132b
 */
public class Lab2_6 {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Введите 4 числа");        
        
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        String a_str = in.readLine(), b_str = in.readLine(),
               c_str = in.readLine(), d_str = in.readLine(); 
        
        try {
            Integer.parseInt(a_str);
            Integer.parseInt(b_str);
            Integer.parseInt(c_str);
            Integer.parseInt(d_str);
        } 
        catch (Exception e) {
            System.out.println("Введено неверное значение");
            return;
        }
       
        int a = Integer.parseInt(a_str), b = Integer.parseInt(b_str),
            c = Integer.parseInt(c_str), d = Integer.parseInt(d_str);
        
        min(min(a, b), min(c, d));        
    }
    
    public static int min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;        
    }
    
}