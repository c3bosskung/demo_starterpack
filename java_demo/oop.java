package java_demo;

public class oop {
    private String name;
    private int hp;
    private int mp;

    public oop(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }   

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void attack(oop target) {
        target.hp -= 10;
    }

    public void fly() {
        System.out.println(this.name + " is flying");
    }

    public void walk() {
        System.out.println(this.name + " is walking");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

}
