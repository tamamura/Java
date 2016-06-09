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
public class Lab3_2 {
    
    public static void main(String[] args) {
        
        int[] nums = new int[50];
        int a = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a;
            a = a + 2;
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i]+" ");
        
        System.out.println();
        
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[49-i]+" ");    
    }
}