package test;
public class Python extends Character {

//    Python pyth = new Python();
//    String pyth.stats = "Python:\n" +
//            "Health: 70\n" +
//            "Attack: 12\n" +
//            "Heavy Attack: 29\n" +
//            "Ability: 48\n" +
//            "Recovery: 9\n";

//    int hp = 70;
//    int atk = 12;
//    int hatk = 29;
//    int ability = 48;
//    int rec = 9; // Heals your given amount
//
//    public void stats(){
//        System.out.println("Python:\n" +
//            "Health: " + hp + "\n" +
//            "Attack: " + atk + "\n" +
//            "Heavy Attack: " + hatk + "\n" +
//            "Ability: " + ability + "\n" +
//            "Recovery: " + rec + "\n");
//    }


    // Int to store numbers of skills
    public int numAtks;

    // Array to store attacks n such
    public String[] atks = {"Attack", "Heavy Attack", "Ability"};

    // Player specific constructor
    public Python(String name, int maxHP) {
        // Calls constructor from superclass (Character)
        super(name, 70);
        // Setting # of upgrades to 0
        this.numAtks = 0;
    }

    // Player specific of chosen character (replaces abstract methods in "Character")
//    @Override
//    public int attack() {
//        return 0;
//    }
//
//    @Override
//    public int defense() {
//        return 0;
//    }

}
