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
public class Lab2_7 {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Введите координаты точки, не лежащей на осях OX OY");

        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        String x_str = in.readLine(),
               y_str = in.readLine(); 
        
        try {
            Integer.parseInt(x_str);
            Integer.parseInt(y_str);
        } 
        catch (Exception e) {
            System.out.println("Введено неверное значение");
            return;
        }
        
        int x = Integer.parseInt(x_str),
            y = Integer.parseInt(y_str);

        if ((x == 0) || (y == 0)) {
            System.out.println("Ошибка. Введена цифра 0");
        } else {
            if (x > 0)
                if (y > 0)
                    System.out.println("1 четверть");
                else
                    System.out.println("4 четверь");
            else if (y > 0)
                System.out.println("2 четверть");
            else
                System.out.println("3 четверть");
        }
    }
}  