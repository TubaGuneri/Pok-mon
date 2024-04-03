package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
ElectricPokemon pikachu = new ElectricPokemon("Thor", 35, 108, "volt" );
GrassPokemon celebi = new GrassPokemon("Tangela", 65, true, 35);
WaterPokemon slowbro = new WaterPokemon("Slowbro", 95, 100, false);
FirePokemon charmander = new FirePokemon("Charmander", 39, true, "orange");
WaterIce dewgong = new WaterIce("Dew", 64, 89, true, false);

pikachu.electroBall();
celebi.leechSeed();
slowbro.hydroCanon();
charmander.flameThrower();
dewgong.freezeEnemy();

List<Pokemon> pokemonList = new ArrayList<>();
pokemonList.add(pikachu);
pokemonList.add(celebi);
pokemonList.add(slowbro);
pokemonList.add(charmander);
pokemonList.add(dewgong);
for(Pokemon p: pokemonList){
    p.eats();
    p.catchRate();
    p.speaks();
}
    }
}
