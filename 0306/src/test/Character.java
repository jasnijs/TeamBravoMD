package test;

public class Character {

    String name;
    int life;
    String role;

    public void atk(int str) {
        System.out.println("Attack with: " + str);
    }

    public void def(int protection) {
        System.out.println("Use defense power: " + protection);
    }

}
