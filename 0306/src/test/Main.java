package test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        Enemy ork = new Enemy();
        int atk = rand.nextInt(11);
        int def = rand.nextInt(11);
        int atk1 = rand.nextInt(11);
        int def1 = rand.nextInt(11);
//        int atk2 = rand.nextInt(11);
//        int def2 = rand.nextInt(11);

        ork.name = "Regnar The Evil";
        ork.life = 8;
        ork.role = "Enemy";

        System.out.println(ork.name);

        ork.atk(atk);
        ork.def(def);

        System.out.println("");

        Human human = new Human();

        human.name = "Bob The Super Human";
        human.life = 5;
        human.role = "Hero";

        System.out.println(human.name);
        human.atk(atk1);
        human.def(def1);

        // Human attacks first 10 - 7
        System.out.println("");

        System.out.println("Result: ");
//        System.out.println(def - atk1);

        // Human attacks
        if (def < atk1) {
            System.out.println(human.name + " wins");
        }
        // Ork attacks
        else if (def1 < atk) {
            System.out.println(ork.name + " wins");
        } else if (def == atk1 && def1 == atk) {
            System.out.println("No victor");
        } else {
            System.out.println("Game over");
        }

//        Human human2 = new Human();
//
//        human2.name = "Joker";
//        human2.role = "Jester";


        // 5 - 8 prog val
        // jadefine speeks un jaliek cinities sava starpa


        // Komanda Bravo


    }
}