package Lab4;

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
public class Lab4_1 {

    public static void main(String[] args) throws IOException {
        
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        
        System.out.println("Введите 2 числа");
        
        String a_str = in.readLine(),
               b_str = in.readLine();        
        int a = Integer.parseInt(a_str),
            b = Integer.parseInt(b_str);
        
        int[] nums = new int[20];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand(a, b);
            System.out.print(nums[i]+" ");
        }
    }
    public static int rand (int a, int b) {
            if (a > b)
                return (int) (Math.random()*(a-b+1))+b;
            else 
                return (int) (Math.random()*(b-a+1))+a;
        }   
}