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
public class Lab6_1 {

    static int k = 0;

    public static void main(String[] args) {

        Pegas[] arr = new Pegas[100];
        info(arr);
    }

    static void info(Pegas[] arr) {

        Scanner sc = new Scanner(System.in);
        int a = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("Чего хотите?\n1. Добавить лошадку.\n2. Летает ли лошадка?");
            a = sc.nextInt();
            if (a == 1) vvod(arr);
            else if (a == 2) poisk(arr); 
            else if (a == 42) return;
            else System.out.println("Нет такого");
        }
    }

    static void vvod(Pegas[] arr) {
        
        arr[k] = new Pegas();
        k++;
    }

    static void poisk(Pegas[] arr) {
        
        System.out.print("Как зовут лошадку?   ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i = 0;
        while (i != k+1) {
            if (i == k) {
                System.out.println("Мы не смогли найти вашу лошадку");
                break;
            }
            else if (name.equals(arr[i].name)) {
                arr[i].fly();
                break;
            } 
            else i++;
        }
    }
}
