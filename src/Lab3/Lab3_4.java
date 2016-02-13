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
public class Lab3_4 {
    
    public static void main(String[] args) {
        
        int[][] nums = new int[8][5];
        
        for (int i = 0; i < 8.; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = ((int)(Math.random()*90+10));
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) 
                System.out.print(nums[i][j]+" ");
            System.out.println();
        }
    }    
}