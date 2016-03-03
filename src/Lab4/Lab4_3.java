/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;


/**
 *
 * @author hello
 */
public class Lab4_3 {
    
    public void sort(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]) {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }           
}
