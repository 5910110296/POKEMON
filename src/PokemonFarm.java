
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class PokemonFarm {
    private ArrayList<PokemonGo> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<PokemonGo>();
	}

	public void addNewPokemon(PokemonGo pokemongo){
		pokemons.add(pokemongo);
	}

	public void list(){
		for(PokemonGo pokemongo: pokemons){
			pokemongo.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(PokemonGo pokemon: pokemons){
				pokemon.eat();
			}
		}
	}
}
