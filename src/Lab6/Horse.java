/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 * @author kvs1132b
 */

public class Horse {

    String name;
    String wings;

    Horse() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите кличку: ");
            name = sc.nextLine();
            System.out.print("Это пегас? (y/n) ");
            wings = sc.nextLine();

        } catch (Exception e) {
            System.out.println("Ошибка ввода " + e);
        }
    }
}

class Pegas extends Horse {

    void fly() {
        if ("y".equals(wings)) System.out.println(name + " умеет летать");
        else if ("n".equals(wings)) System.out.println(name + " не умеет летать");
        else System.out.println("Я не знаю, что у вас за лошадка");
    }
}
