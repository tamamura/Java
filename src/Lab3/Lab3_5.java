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
public class Lab3_5 {
    
    public static void main(String[] args) {
        
        int[][] nums = new int[7][4];
        
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 4; j++)
                nums[i][j] = ((int)(Math.random()*11-5));
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) 
                System.out.format("%3d", nums[i][j]);
            System.out.println();
        }
        int max = 0,
            str = 0;
            
        for (int i = 0; i < 7; i++) {
            int pro = 1;
            for (int j = 0; j < 4; j++)
                pro = pro * Math.abs(nums[i][j]);
            if (pro > max) {
                max = pro;
                str = i + 1;
            }
        }            
        System.out.println(str);
    }
}