/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author kvs1132b
 */
public class Lab6_2 {
    
    public static void main(String[] args) {
        
        Cat c = new Cat(); 
        
        System.out.println("");
        c.getInfo();
        
        System.out.println("");
        c.setName("stul");
        c.setAge(5);
        c.setGender("f");
        c.setWeight(15);
        
        c.getInfo();
       
    }
    
}
