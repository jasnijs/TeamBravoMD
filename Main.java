package test;
import java.sql.SQLOutput;
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
        String input = sc.nextLine().toLowerCase();
        System.out.println("You chose: " + input);
        System.out.println("Enter Action:");
        System.out.println("first | second | third | fourth | fifth | summ");


        while (true) {

//            Java
            if (input.contains("java")) {
                String input2 = sc.nextLine().toLowerCase();

                if (input2.contains("first")) {
                    if (chash.tiobe < java.tiobe) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("second")) {
                    if (chash.pypl < java.pypl) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("third")) {
                    if (chash.so < java.so) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fourth")) {
                    if (chash.gho < java.gho) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fifth")) {
                    if (chash.intrv < java.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("summ")) {
                    System.out.println("C#: " + (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv));
                    System.out.println("Java: " + (java.tiobe + java.pypl + java.so + java.gho + java.intrv));
                    if (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv <
                            java.tiobe + java.pypl + java.so + java.gho + java.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }
            }

//            Python
            if (input.contains("python")) {
                String input2 = sc.nextLine().toLowerCase();

                if (input2.contains("first")) {
                    if (chash.tiobe < pyth.tiobe) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("second")) {
                    if (chash.pypl < pyth.pypl) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("third")) {
                    if (chash.so < pyth.so) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fourth")) {
                    if (chash.gho < pyth.gho) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fifth")) {
                    if (chash.intrv < pyth.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("summ")) {
                    System.out.println("C#: " + (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv));
                    System.out.println("Python: " + (pyth.tiobe + pyth.pypl + pyth.so + pyth.gho + pyth.intrv));
                        if (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv < pyth.tiobe + pyth.pypl + pyth.so + pyth.gho + pyth.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

            }

//            C
            if (input.contains("c")) {
                String input2 = sc.nextLine().toLowerCase();

                if (input2.contains("first")) {
                    if (chash.tiobe < c.tiobe) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("second")) {
                    if (chash.pypl < c.pypl) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("third")) {
                    if (chash.so < c.so) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fourth")) {
                    if (chash.gho < c.gho) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fifth")) {
                    if (chash.intrv < c.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("summ")) {
                    System.out.println("C#: " + (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv));
                    System.out.println("C: " + (c.tiobe + c.pypl + c.so + c.gho + c.intrv));
                    if (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv < c.tiobe + c.pypl + c.so + c.gho + c.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }
            }

//            JavaScrypt
            if (input.contains("javascript")) {
                String input2 = sc.nextLine().toLowerCase();

                if (input2.contains("first")) {
                    if (chash.tiobe < js.tiobe) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("second")) {
                    if (chash.pypl < js.pypl) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("third")) {
                    if (chash.so < js.so) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fourth")) {
                    if (chash.gho < js.gho) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("fifth")) {
                    if (chash.intrv < js.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }

                if (input2.contains("summ")) {
                    System.out.println("C#: " + (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv));
                    System.out.println("JavaScrypt: " + (js.tiobe + js.pypl + js.so + js.gho + js.intrv));
                    if (chash.tiobe + chash.pypl + chash.so + chash.gho + chash.intrv < js.tiobe + js.pypl + js.so + js.gho + js.intrv) {
                        System.out.println("You win");
                    } else {
                        System.out.println("You lose");
                    }
                }
            }
        }
    }
}