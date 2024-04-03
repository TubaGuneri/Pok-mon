package src;

import java.awt.*;

public abstract class Pokemon {

    private String name;
    private int hp;

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
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

    public abstract void speaks();
    public abstract void catchRate();

    public void eats(){
        System.out.println(getName() + " eats a muffin");
    }
}
