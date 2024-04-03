package src;

public class WaterPokemon extends Pokemon {
    private int capacity;
    private Boolean attack;

    public WaterPokemon(String name, int hp, int capacity, Boolean attack) {
        super(name, hp);
        this.capacity = capacity;
        this.attack = attack;
    }



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getAttack() {
        return attack;
    }

    public void setAttack(Boolean attack) {
        this.attack = attack;
    }
    @Override
    public void speaks() {
        System.out.println("I 'am a water pokemon!");

    }

    @Override
    public void catchRate() {
        System.out.println(getName()+ " heeft een catch rate van 45");
    }

    public void hydroCanon() {
        System.out.println(getName() + " used hydro canon!");
    }

    public void hydroPump() {
        System.out.println(getName() + " used hydro pump! ");
    }


}
