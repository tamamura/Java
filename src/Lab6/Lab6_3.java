/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 * @author hello
 */
public class Lab6_3 {
    
    public static void main(String[] args) {
        
        Animal f = new Animal();
        System.out.println("Чтобы достичь следующей ступени эволюции вам нужно"
                + " заработать 100 очков опыта.\nОпыт можно получить за еду, "
                + "бои и другие действия.\nТут многое зависит от рандома, "
                + "так что удачи вам!\n");
        
        f.pause(5000);
        //f.exp = 99;
        while (f.lvl == 1) f.fishRoll();
        System.out.println("Поздравляю! Вы эволюционировали до уровня животного.");
        while (f.lvl == 2) f.aniRoll();
        System.out.println("Поздравляю! Вы эволюционировали до уровня обезьяны.");
    }
}
