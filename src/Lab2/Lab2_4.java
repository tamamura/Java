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
public class Lab2_4 {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Введите 2 числа");        
        
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        String m_str = in.readLine(), //читаем строку с клавиатуры
               n_str = in.readLine(); 

        int m = Integer.parseInt(m_str), //преобразовываем строку в число.
            n = Integer.parseInt(n_str); 
        
        sravnenie(m, n);                                  
    }
    
    public static void sravnenie(int m, int n) {
        
        if (m > n) 
            System.out.println(n);
        else if (m < n)
            System.out.println(m);
        else System.out.println("Числа одинаковы");              
    
    }
}