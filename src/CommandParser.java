
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
public class CommandParser {
        private final PokemonFarm pokemonFarm;
        private WildPokemon wildPokemon;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm, WildPokemon wildPokemon){
		this.pokemonFarm = pokemonFarm;
                this.wildPokemon = wildPokemon;
                commandScanner = new Scanner(System.in);
		isRunning = false;
	}
	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addNewPokemon();
			else if(command.equals("list"))
				this.listNewPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
                        else if(command.equals("gotowild"))
                                this.goToWild();
                }
        }
	void addNewPokemon(){
		commandScanner.nextLine();
		// input name weight length
		String pokemonType = "Aggy";
		String name = "aggy";
		float weight = 10f;
		float stepLength = 5f;

		if(pokemonType.equals("Aggy")){
			Aggy aggy = new Aggy(name, weight, stepLength);
			pokemonFarm.addNewPokemon(aggy);
		}

	}

	private void listNewPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
	}
        
        private void goToWild(){
               this.wildPokemon.run();
        } 
    }


