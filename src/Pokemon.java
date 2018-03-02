
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class Pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PokemonFarm pokemonFarm = new PokemonFarm();
        WildPokemon wildPokemon = new WildPokemon();
		CommandParser commandParser = new CommandParser(pokemonFarm, wildPokemon);
		commandParser.run();
    }
}
  

