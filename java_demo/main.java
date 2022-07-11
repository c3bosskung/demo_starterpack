package java_demo;

public class main {
    //test oop
    public static void main(String[] args) {
        oop oop1 = new oop("Player1", 100, 100);
        oop oop2 = new oop("Player2", 100, 100);
        oop1.attack(oop2);
        System.out.println(oop2.getName() + ": "  + oop2.getHp());
        oop1.fly();
        oop1.walk();
        oop1.run();
    }
}
