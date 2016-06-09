/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Scanner;

/**
 * @author hello
 */
public class Fish {
    
    String name;
    int exp = 0;
    int lvl = 1;
    
    Fish() {
        
        System.out.println("Добро пожаловть!");
        System.out.println("Как вас будут звать?");
        
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        
        System.out.println("Здравствуйте " + name + ".\nНа данный момент вы рыбка, "
                + "и сегодня мы попытаемся эволюционировать до уровня человека.");
    }
    void fishRoll() {
        int i = (int)(Math.random()*10);
        if (i < 2) kruk();
        else if (i < 5) fishFood();
        else fishFight();
    }
    void lvlup() {
        if (exp > 100) {
            lvl = lvl + 1;
            exp = exp - 100;
        }
    }
    void pause(int i) {
        try {
            Thread.sleep(i);
        }
        catch (InterruptedException ex) {
            System.out.println("Что-то пошло не так");
        }
    }
    void kruk() {
        pause(2500);
        System.out.println("Вам на пути встретился рыболовный крючок с наживкой.");
        System.out.println("Попытаться съесть? (шанс попасться очень велик)");
        System.out.print("y/n   ");
        Scanner sc = new Scanner(System.in);
        String yn = sc.nextLine();
        if ("y".equals(yn)) {
            int i = (int)(Math.random()*10);
            pause(2500);
            if (i < 2) {
               System.out.println("Это было опасно, но оно того стоило. +35 опыта.\n");
               exp = exp + 50;
               lvlup();
            }
            else {
                System.out.println("Вас поймали. Игра окончена.");
                System.exit(0);
            }
        } else System.out.println("Ну ладно, плывём дальше.\n");
    }
    void fishFood() {
        int foodExp = (int)(Math.random()*10)+10;
        pause(2500);
        System.out.println("Удача на вашей стороне. Вы нашли немного еды. +"
                + foodExp + " опыта.\n");
        exp = exp + foodExp;
        lvlup();
    }
        
    void fishFight() {
        pause(2500);
        System.out.println("На вашем пути встала другая рыба.");
        int proc = (int)(Math.random()*61)+30;
        System.out.println("Шанс победить её: " + proc + " %");
        
        System.out.print("Вступить в бой? (y/n)   ");
        Scanner sc = new Scanner(System.in);
        String yn = sc.nextLine();
        
        if ("y".equals(yn)) {
            pause(2500);
            if ((int)(Math.random()*100) < proc) {
                int dop = (int)(15*(100 - proc)/100);
                System.out.println("Враг повержен! +" + (20+dop) + " опыта.\n");
                exp = exp + 20 + dop;
                lvlup();
            }
            else {
                if (exp > 15) {
                    System.out.println("Бой был жестким, но вы проиграли. "
                        + "Сломано пару рёбер, но вы ещё в строю. -15 опыта.\n");
                    exp = exp - 15;
                }
                else {
                    System.out.println("Вас победили и вы всплыли брюхом кверху."
                            + "Игра окончена.");
                    System.exit(0);
                }
            }
        }
        else System.out.println("Трусишка... Плывём дальше.\n");
    }   
}
class Animal extends Fish{
    
    void aniRoll() {
        int i = (int)(Math.random()*10);
        if (i < 2) aniPeople();
        else if (i < 5) aniFood();
        else aniFight();
    }
    
    void aniFood() {
        int foodExp = (int)(Math.random()*10)+10;
        pause(2500);
        System.out.println("Вам попалась мелкая дичь. +" + foodExp + " опыта.\n");
        exp = exp + foodExp;
        lvlup();
    }
    
    void aniFight() {
        pause(2500);
        System.out.print("Вы встретили крупную дичь ");
        int obnar = (int)(Math.random()*10);
        int proc;
        if (obnar < 2) {
            System.out.println("и она вас обнаружила.");
            proc = (int)(Math.random()*51)+10;
        } else {
            System.out.println("и подкрались к ней незаметно.");
            proc = (int)(Math.random()*51)+40;
        }
        System.out.println("Шанс победить её: " + proc + " %");
        
        System.out.print("Напасть? (y/n)   ");
        Scanner sc = new Scanner(System.in);
        String yn = sc.nextLine();
        
        if ("y".equals(yn)) {
            pause(2500);
            if ((int)(Math.random()*100) < proc) {
                int dop = (int)(15*(100 - proc)/100);
                System.out.println("Враг повержен! +" + (20+dop) + " опыта.\n");
                exp = exp + 20 + dop;
                lvlup();
            }
            else {
                if (exp > 15) {
                    System.out.println("К сожалению вы проиграли. Сейчас раны"
                            + "затянутся, и можно продолжить. -15 опыта.\n");
                    exp = exp - 15;
                }
                else {
                    System.out.println("Вас победили. Видимо рыбкой быть проще."
                            + "Игра окончена.");
                    System.exit(0);
                }
            }
        }
        else System.out.println("Как желаете. Идём дальше.\n");
    }
    void aniPeople() {
        
        pause(2500);
        System.out.println("Вы встретили людей.");
        System.out.print("Напасть на них? (y/n)   ");
        Scanner sc = new Scanner(System.in);
        String yn = sc.nextLine();
        
        
        if ("y".equals(yn)) {
            pause(2500);
            int hunt = (int)(Math.random()*10);
            if (hunt < 7) {
                System.out.println("Они оказались охотниками.");
                int shoot = (int)(Math.random()*10);
                if (shoot < 5) {
                    pause(2500);
                    System.out.println("Вас ранили из ружья. -10 опыта.");
                    exp = exp - 10;
                    int kill = (int)(Math.random()*10);
                    if (kill < 5) { 
                        pause(2500);
                        System.out.println("Но вам получилось убить их. +25 опыта.\n");
                        exp = exp + 25;
                        lvlup();
                    } else if (exp < 0) {
                            pause(2500);
                            System.out.println("Вас одолели охотники. "
                                + "Игра окончена.");
                            System.exit(0);
                    } else  {
                        pause(2500);
                        System.out.println("Вам удалось скрыться от них."
                            + " Это было опасно.\n");
                    }
                } else {
                    pause(2500);
                    System.out.println("Но для вас это не помеха. +25 опыта.\n");
                    exp = exp + 25;
                    lvlup();
                }
            } else {
                pause(2500);
                System.out.println("Вы поели немного человечины. +25 опыта\n");
                exp = exp + 25;
                lvlup();
            }
        } else  System.out.println("Не думал, что вы людей боитесь. Но дело ваше...\n");
    }
}

