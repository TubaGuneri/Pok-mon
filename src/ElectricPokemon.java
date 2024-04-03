package src;

public class ElectricPokemon extends Pokemon {

    int attackElectric;
    String food;
    public ElectricPokemon(String name, int hp, int attackElectric, String food) {
        super(name, hp);
        this.attackElectric = attackElectric;
        this.food = food;
    }
    public int getAttackElectric() {
        return attackElectric;
    }

    public void setAttackElectric(int attackElectric) {
        this.attackElectric = attackElectric;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void speaks() {
        System.out.println("I 'am an electric pokemon!");

    }

    @Override
    public void catchRate() {
        System.out.println(getName() + " heeft een catch rate van 45");
    }

    public void thunderPunch(){
      System.out.println(getName() + " used thunder punch!");
  }
  public void electroBall(){
      System.out.println(getName() + " used electro ball!");
  }


}
