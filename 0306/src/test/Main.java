package test;
import java.util.Random;

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
        
        Java java = nev Java();
        java.name = "Java";
        java.tiobe = 10.71 + rand.nextDouble(6) - 3;
        java.pypl = 17.27 + rand.nextDouble(6) - 3;
        java.so = 35.35 + rand.nextDouble(6) - 3;
        java.gho = 8 + rand.nextDouble(2) - 1;
        java.intrv = 47.15 + rand.nextDouble(6) - 3;
//         Valodas "Java" reitingu parametru vērtības
        
        JavaScrypt js = new JavaScrypt();
        js.name = "JavaScrypt";
        js.tiobe = 2.66 + rand.nextDouble(6) - 3;
        js.pypl = 8.97 + rand.nextDouble(6) - 3;
        js.so = 64.96 + rand.nextDouble(6) - 3;
        js.gho = 10 + rand.nextDouble(2) - 1;
        js.intrv = 61.51 + rand.nextDouble(6) - 3;
//         Valodas "JavaScrypt" reitingu parametru vērtības
        
        LangC# c# = new LangC#();
        c#.name = "JavaScrypt";
        c#.tiobe = 2.66 + rand.nextDouble(6) - 3;
        c#.pypl = 8.97 + rand.nextDouble(6) - 3;
        c#.so = 64.96 + rand.nextDouble(6) - 3;
        c#.gho = 10 + rand.nextDouble(2) - 1;
        c#.intrv = 61.51 + rand.nextDouble(6) - 3;
//         Valodas "C#" reitingu parametru vērtības
        
        
           
        
        
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
