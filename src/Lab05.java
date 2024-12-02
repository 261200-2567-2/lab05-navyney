import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {

//        Character character = new Character("Gong");
//
//        character.chooseJob("Knight");
//
//        character.printStatus();
//        System.out.println("--------------------------------------") ;
//        character.equipBoot();
//        character.useBoot();
//        character.printStatus();
//        character.equipMagicStuff();
//        character.equipSword();
//        character.equipArmor();
//        character.printStatus();
//        System.out.println("--------------------------------------") ;
//        character.levelUp();
//        character.levelUpMagicStuff();
////        character.equipCirclet();
////        character.useCirclet();
//        character.printStatus();

        Character hero1 = new Character("Hero1");
        Character hero2 = new Character("Hero2");

        hero1.chooseJob("Mage");
        hero2.chooseJob("Mage");

        hero1.printStatus();
        hero2.printStatus();

        hero1.attack(hero2); // Hero1 โจมตี Hero2
        hero2.attack(hero1); // Hero2 โจมตี Hero1

        hero1.attack(hero2); // Hero1 โจมตี Hero2 ซ้ำจนพลังหมด
        hero1.attack(hero2);


    }
}