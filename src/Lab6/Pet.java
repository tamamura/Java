/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author kvs1132b
 */
public class Pet {
    
    protected String gender;
    protected int weight;
    protected int age;
    
    String ge() {
        if ("m".equals(gender)) return "мужской";
        else if ("f".equals(gender)) return "женский";
        else return "Странный у вас питомец";
    }
    String we() {
        if (weight == 12 || weight == 13 || weight == 14)
            return " килограмм";
        else if ((weight % 10) == 2 || (weight % 10) == 3 || (weight % 10) == 4)
            return " килограмма";
        else return " килограмм";
    }
    String ag() {
        if (age == 11 || age == 12 || age == 13 || age == 14)
            return " лет";
        else if ((age % 10) == 1) return " год";
        else if ((age % 10) == 2 || (age % 10) == 3 || (age % 10) == 4)
            return " года";
        else return " лет";
    }
}

class Cat extends Pet{
    
    private String name;
    
    Cat() {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите имя кошки: ");
            name = sc.nextLine();
            System.out.print("Введите пол (m/f): ");
            gender = sc.nextLine();
            System.out.print("Введите возраст: ");
            age = sc.nextInt();
            System.out.print("Введите вес: ");
            weight = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка ввода " + e);
        }
    }
    void getInfo() {
        System.out.println("Имя кошки: " + name);
        System.out.println("Пол: " + ge());
        System.out.println("Возраст: " + age + ag());
        System.out.println("Вес: " + weight + we());
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public void setName(String n) {
        name = n;
    }
    public void setGender(String g) {
        gender = g;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setWeight(int w) {
        weight = w;
    }
}

class Dog extends Pet{
    
    String name;
    
    Dog() {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите имя собаки: ");
            name = sc.nextLine();
            System.out.print("Введите пол (m/f): ");
            gender = sc.nextLine();
            System.out.print("Введите возраст: ");
            age = sc.nextInt();
            System.out.print("Введите вес: ");
            weight = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка ввода " + e);
        }
    }
    void getInfo() {
        System.out.println("Имя собаки: " + name);
        System.out.println("Пол: " + ge());
        System.out.println("Возраст: " + age + ag());
        System.out.println("Вес: " + weight + we());
    }
}
