package src;

public class FirePokemon extends Pokemon{

   private Boolean fireFlame;
   private String color;
   public FirePokemon(String name, int hp, Boolean fireFlame, String color) {
        super(name, hp);
        this.fireFlame = fireFlame;
        this.color = color;
    }


    public Boolean getFireFlame() {
        return fireFlame;
    }

    public void setFireFlame(Boolean fireFlame) {
        this.fireFlame = fireFlame;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void speaks() {
        System.out.println("I 'am a fire pokemon!");
    }

    @Override
    public void catchRate() {
        System.out.println(getName()+ " heeft een catch rate van 45");
    }

    public void fireLash(){
        System.out.println(getName() + " used fire lash!");
    }
    public void flameThrower(){
        System.out.println(getName() + " used flame thrower!");
    }
}

