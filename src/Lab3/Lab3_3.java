package Lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kvs1132b
 */
public class Lab3_3 {
    
    public static void main(String[] args) {
       
        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*10);
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        
        int a = 0;
        for (int i = 0; i < nums.length; i++) 
            if (nums[i] % 2 == 0)
                a++;

        System.out.println("Четных цифр: "+a);       
    }
}