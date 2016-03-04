/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author hello
 */
public class Circle {
    
    double x;
    double y;
    double r;
    double xp;
    double yp;
    
    Circle() throws IOException {
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        
        System.out.print("Задайте координату x: ");
        String x_str = in.readLine();
        System.out.print("Задайте координату y: ");
        String y_str = in.readLine(); 
        System.out.print("Задайте размер радиуса: ");
        String r_str = in.readLine();
        
        x = Integer.parseInt(x_str);
        y = Integer.parseInt(y_str);
        r = Integer.parseInt(r_str);
    }
    
    void okrug() {
        System.out.format("%.3f%n", (Math.PI * 2 * r));
    }
    
    void center() {
        x = (int) (Math.random() * 199) - 99;
        y = (int) (Math.random() * 199) - 99;
        System.out.println("x = "+x+" y = "+y);
    }
    
    void distance(Circle cir) {
        double a = Math.sqrt(Math.pow(cir.x - x, 2) + Math.pow(cir.y - y, 2));
        System.out.format("%.3f%n", a);
    }
    
    void point(Circle cir) {
        double a = Math.sqrt(Math.pow(cir.x - x, 2) + Math.pow(cir.y - y, 2));
        /*if (a == cir.r + r || a == Math.abs(cir.r - r)) {
            System.out.println("Имеется одна точка пересечения");
        } else System.out.println("Имеются 2 или 0 точек пересечения");*/
        if (a == cir.r + r) {
            if (r == cir.r) {
                if (x == cir.x){
                    xp = x;
                } else if (x > cir.x) {
                    xp = cir.x + (x - cir.x) / 2;
                } else xp = x + (cir.x - x) / 2;
            } else {
                double xd = Math.abs(cir.x - x) * (r / (cir.r + r));
                if (x == cir.x){
                    xp = x;
                } else if (x > cir.x) {
                    xp = x - xd;
                } else xp = x + xd;
            }
            if (y == cir.y) {
                yp = y;
            } else if (y < cir.y)
                yp = y + Math.sqrt(r*r - (xp - x) * (xp - x));
            else yp = y - Math.sqrt(r*r - (xp - x) * (xp - x));
            System.out.println(xp+" "+yp);
        } else if (a == Math.abs(cir.r - r)) {
            if (r > cir.r) {
                double xd = Math.abs(cir.x - x) * (cir.r / (r - cir.r));
                if (x == cir.x) {
                    xp = x;
                } else if (x > cir.x) {
                    xp = cir.x - xd;
                } else xp = cir.x + xd;
                if (y == cir.y) {
                    yp = y;
                } else if (y < cir.y)
                    yp = y + Math.sqrt(r*r - (xp - x) * (xp - x));
                else yp = y - Math.sqrt(r*r - (xp - x) * (xp - x));
            } else {
                double xd = Math.abs(cir.x - x) * (r / (cir.r - r));
                if (x == cir.x) {
                    xp = x;
                } else if (x > cir.x) {
                    xp = x + xd;
                } else xp = x - xd;
                if (y == cir.y) {
                    yp = y;
                } else if (y < cir.y)
                    yp = y - Math.sqrt(r*r - (xp - x) * (xp - x));
                else yp = y + Math.sqrt(r*r - (xp - x) * (xp - x));
            }
            System.out.println(xp+" "+yp);
        } else System.out.println("Имеются 2 или 0 точек пересечения");
    }    
}
