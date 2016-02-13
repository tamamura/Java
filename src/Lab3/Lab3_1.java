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
public class Lab3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] nums = new int[10];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a + 2;
            nums[i] = a;
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i]+" ");
        
        System.out.println();
        
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);               
    }    
}