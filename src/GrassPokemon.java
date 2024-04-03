package src;


public class GrassPokemon extends Pokemon{


    private Boolean hasFlower;
    private int  weight;

    public GrassPokemon(String name, int hp, Boolean hasFlower, int weight) {
        super(name, hp);
        this.hasFlower= hasFlower;
        this.weight = weight;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getHasFlower() {
        return hasFlower;
    }

    public void setHasFlower(Boolean hasFlower) {
        this.hasFlower = hasFlower;
    }

    @Override
    public void speaks() {
        System.out.println("I 'am a grass pokemon!");
    }

    @Override
    public void catchRate() {
        System.out.println(getName()+ " heeft een catch rate van 45");
    }

    public void leechSeed(){
        System.out.println(getName()+ " leeched seed!");
    }
    public void leaveBlade(){
        System.out.println(getName() + " left blade ");
    }
}



