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
public class Lab4_2 {
    
    public static void main(String[] args) throws IOException {
        
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        
        System.out.println("Введите 2 числа");
        
        String a_str = in.readLine(),
               b_str = in.readLine();        
        int a = Integer.parseInt(a_str),
            b = Integer.parseInt(b_str);
            
        
        int[][] nums = new int[5][10];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++){
                nums[i][j] = Lab4_1.rand(a, b);
                System.out.format("%3d", nums[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Какую строку вывести?");
        
        String str_str = in.readLine();
        int str = Integer.parseInt(str_str);
        int arr[] = new int[10];
        
        print(nums, str, arr);
        System.out.println();
        Lab4_3 ar = new Lab4_3();
        ar.sort(arr);
        
    }
    
    public static void print(int[][] nums, int a, int[] arr) {
        for (int i = 0; i < 10; i++){
            arr[i] = nums[a-1][i];
            System.out.print(arr[i]+" ");  
        }                                     
    }
}