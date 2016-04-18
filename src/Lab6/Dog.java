/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author kvs1132b
 */
public class Dog extends Pet{
    
    private String name;
    
    Dog() throws IOException {
        
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        
        System.out.print("Задайте кличку собаки: ");
        name = in.readLine();
        System.out.print("Скоклько ей лет: ");
        String a_str = in.readLine();
        System.out.print("Сколько весит: ");
        String w_str = in.readLine();
        System.out.print("Какого пола (м/ж): ");
        gender = in.readLine();
        
        age = Integer.parseInt(a_str);
        weight = Integer.parseInt(w_str);
    }
    
    void print(){
        
        System.out.println("Кличка собаки: " + name);
        System.out.println("Возраст: " + age + age_s(age));
        System.out.println("Вес: " + name + " кг");
        if (gender == "м") System.out.println("Пол мужской");
        else System.out.println("Пол женский");
    }
    
    private String age_s(int i) {
        if (i % 10 == 1) return " год";
        else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4) return " года";
        else return " лет";
    }
}
