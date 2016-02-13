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
public class Lab2_5 {
    
     public static void main(String[] args) throws IOException {
         
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        String s1 = in.readLine();
        String s2 = in.readLine();
        
        for (int i = 0; i < 10; i++)
            if ((s1.contains(Integer.toString(i))) || (s2.contains(Integer.toString(i)))) {
                System.out.println("Ошибка. В имени присутствуют цифры");
                return;
            }
        
        int comparison = s1.compareTo(s2);
        if (comparison == 0)
            System.out.println("Строки равны");
        else if (s1.length()==s2.length())
            System.out.println("Длинна строк равна");
        else System.out.println("Строки различны");
     }
}