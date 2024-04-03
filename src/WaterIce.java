package src;

public class WaterIce extends WaterPokemon {

    public boolean iceMain;

    public WaterIce(String name, int hp, int capacity, Boolean attack, boolean iceMain) {
        super(name, hp, capacity, attack);
        this.iceMain = iceMain;
    }

    public void freezeEnemy() {
        System.out.println(getName() + " bevriest zijn vijanden");
    }

    @Override
    public void speaks() {
        if (iceMain) {
            System.out.println("I am an Ice-water Pokemon");
        } else {
            System.out.println("I am a Water-ice Pokemon");
        }
    }
}
