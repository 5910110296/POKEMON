
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
public class WildPokemon {
        String command;
        private Scanner commandScanner;
	private boolean isRunning;
        private int num;
        private float mood;
        private int bag;
        private PokemonBall pokemonBall;
        private CommandParser commandParser;
        
        public void run(){
		isRunning = true;
                this.pokemonBall = pokemonBall;
		String command;
                System.out.println("Hello Welcome to WildPokemon");
                    while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, go back to CommandParser.");
			}
                        else if(command.equals("catch")) {
                                catchPokemon(this.pokemonBall.getOpportunity());
                        }          
                        else if(command.equals("pick")){
                                pickPokemon();
                        }
            }
        }
        public void randomPokemon(){
            num = 3%(int)(Math.random()*10);
            if(num == 1){
                mood = (float) 0.5;
            }
            else if(num == 2){
                mood = (float) 0.6;
            }
            else if(num == 3){
                mood = (float) 0.7;
            }
        }
        
        public float getMood(){
            return mood;
        }
        
        public void catchPokemon(float opportunity){
            this.randomPokemon();
            if(mood*opportunity > 0.5){
                bag += 1;
            }
        }
        
        public void pickPokemon(){
            if(bag > 0){
               commandParser.addNewPokemon();
               bag--;
            }
        }
}
