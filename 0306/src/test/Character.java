package test;

public abstract class Character {
    // Abstract class means that your code is... abstract. It can contain both, a method/condition or/and abstract idea
    // of what should be here.
    
//    String name;
//     valodas nosaukums

    double tiobe;
//     TIOBE index

    double pypl;
//     PyPL rating

    double so;
//     StackOverFlow rating

    double gho;
//     GitHUB Octoverse rating

    double intrv;
//     user interview results


//public void pythStats() {
//        System.out.println("Python:\n" +
//                "Health: 70\n" +
//                "Attack: 12\n" +
//                "Heavy Attack: 29\n" +
//                "Ability: 48\n" +
//                "Recovery: 9\n");
//    }

    public void stats() {
        System.out.println();
    }
    

//     String name;
//     int life;
//     String role;

//     public void atk(int str) {
//         System.out.println("Attack with: " + str);
//     }

//     public void def(int protection) {
//         System.out.println("Use defense power: " + protection);
//     }

    // Attributes / Variables all characters share
    public String name;
    public int maxHp, hp;

    // Character constructor method
    public Character(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    // Here abstract means that every subclass has to override them with their own values/calculations
    // Methods every character has
//    public abstract int attack();
//    public abstract int defense();

}
