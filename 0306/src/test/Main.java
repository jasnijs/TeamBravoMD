package test;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        
        Python pyth = new Python();
        pyth.name = "Python";
        pyth.tiobe = 11.77 + rand.nextDouble(6) - 3;
        pyth.pypl = 29.47 + rand.nextDouble(6) - 3;
        pyth.so = 48.24 + rand.nextDouble(6) - 3;
        pyth.gho = 9 + rand.nextDouble(2) - 1;
        pyth.intrv = 68.83 + rand.nextDouble(6) - 3;
//         Valodas "Python" reitingu parametru vērtības
        
        LangC c = new LangC();
        c.name = "C";
        c.tiobe = 10.72 + rand.nextDouble(6) - 3;
        c.pypl = 6.6 + rand.nextDouble(6) - 3;
        c.so = 24.31 + rand.nextDouble(6) - 3;
        c.gho = 2 + rand.nextDouble(2) - 1;
        c.intrv = 39.56 + rand.nextDouble(6) - 3;
//         Valodas "C" reitingu parametru vērtības
        
        Java java = new Java();
        java.name = "Java";
        java.tiobe = 10.71 + rand.nextDouble(6) - 3;
        java.pypl = 17.27 + rand.nextDouble(6) - 3;
        java.so = 35.35 + rand.nextDouble(6) - 3;
        java.gho = 8 + rand.nextDouble(2) - 1;
        java.intrv = 47.15 + rand.nextDouble(6) - 3;
//         Valodas "Java" reitingu parametru vērtības
        
        JavaScrypt js = new JavaScrypt();
        js.name = "JavaScript";
        js.tiobe = 2.66 + rand.nextDouble(6) - 3;
        js.pypl = 8.97 + rand.nextDouble(6) - 3;
        js.so = 64.96 + rand.nextDouble(6) - 3;
        js.gho = 10 + rand.nextDouble(2) - 1;
        js.intrv = 61.51 + rand.nextDouble(6) - 3;
//         Valodas "JavaScrypt" reitingu parametru vērtības
        
        LangChash chash = new LangChash();
        chash.name = "C#";
        chash.tiobe = 2.66 + rand.nextDouble(6) - 3;
        chash.pypl = 8.97 + rand.nextDouble(6) - 3;
        chash.so = 64.96 + rand.nextDouble(6) - 3;
        chash.gho = 10 + rand.nextDouble(2) - 1;
        chash.intrv = 61.51 + rand.nextDouble(6) - 3;
//         Valodas "C#" reitingu parametru vērtības


        Scanner sc = new Scanner(System.in);
        System.out.println("You are up against C#");
        System.out.println("Choose your language: Java | Python | C | JavaScript");

        String lang = sc.nextLine().toLowerCase();

        System.out.println("You chose: " + lang);


        while (true) {

            String input = sc.nextLine().toLowerCase();

//            if (input.contains("java")) {
                if (input.contains("first")) {
                    boolean first = chash.tiobe < java.tiobe;
                    if (first == true) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input.contains("second")) {
                    boolean second = chash.pypl < java.pypl;
                    if (second == true) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input.contains("third")) {
                    boolean third = chash.so < java.so;
                    if (third == true) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input.contains("fourth")) {
                    boolean fourth = chash.gho < java.gho;
                    if (fourth == true) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input.contains("fifth")) {
                    boolean fifth = chash.intrv < java.intrv;
                    if (fifth == true) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input.contains("summ")) {
                    boolean summ = chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv <
                            java.tiobe + java.pypl + java.so + java.gho + java.intrv;
                    if (summ == true) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }
//            }

//            else if (input.contains("python")) {
//                if (input.contains("first")) {
//                    boolean first = chash.tiobe < pyth.tiobe;
//                    if (first == true) {
//                        System.out.println("You win");
//                    } else {
//                        System.out.println("You lose");
//                    }
//                }
//
//                if (input.contains("second")) {
//                    boolean second = chash.pypl < pyth.pypl;
//                    if (second == true) {
//                        System.out.println("You win");
//                    } else {
//                        System.out.println("You lose");
//                    }
//                }
//
//                if (input.contains("third")) {
//                    boolean third = chash.so < pyth.so;
//                    if (third == true) {
//                        System.out.println("You win");
//                    } else {
//                        System.out.println("You lose");
//                    }
//                }
//
//                if (input.contains("fourth")) {
//                    boolean fourth = chash.gho < pyth.gho;
//                    if (fourth == true) {
//                        System.out.println("You win");
//                    } else {
//                        System.out.println("You lose");
//                    }
//                }
//
//                if (input.contains("fifth")) {
//                    boolean fifth = chash.intrv < pyth.intrv;
//                    if (fifth == true) {
//                        System.out.println("You win");
//                    } else {
//                        System.out.println("You lose");
//                    }
//                }
//
//                if (input.contains("summ")) {
//                    boolean summ = chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv <
//                            pyth.tiobe + pyth.pypl + pyth.so + pyth.gho + pyth.intrv;
//                    if (summ == true) {
//                        System.out.println("You win");
//                    } else {
//                        System.out.println("You lose");
//                    }
//                }
//            }

        }






        
           
        
        
//         Enemy ork = new Enemy();
//         int atk = rand.nextInt(11);
//         int def = rand.nextInt(11);
//         int atk1 = rand.nextInt(11);
//         int def1 = rand.nextInt(11);
//        int atk2 = rand.nextInt(11);
//        int def2 = rand.nextInt(11);

//         ork.name = "Regnar The Evil";
//         ork.life = 8;
//         ork.role = "Enemy";

//         System.out.println(ork.name);

//         ork.atk(atk);
//         ork.def(def);

//         System.out.println("");

//         Human human = new Human();

//         human.name = "Bob The Super Human";
//         human.life = 5;
//         human.role = "Hero";

//         System.out.println(human.name);
//         human.atk(atk1);
//         human.def(def1);

        // Human attacks first 10 - 7
//         System.out.println("");

//         System.out.println("Result: ");
//        System.out.println(def - atk1);

        // Human attacks
//         if (def < atk1) {
//             System.out.println(human.name + " wins");
//         }
//         // Ork attacks
//         else if (def1 < atk) {
//             System.out.println(ork.name + " wins");
//         } else if (def == atk1 && def1 == atk) {
//             System.out.println("No victor");
//         } else {
//             System.out.println("Game over");
//         }

//        Human human2 = new Human();
//        human2.name = "Joker";
//        human2.role = "Jester";

        // 5 - 8 prog val
        // jadefine speeks un jaliek cinities sava starpa

        // Komanda Bravo


    }
}
