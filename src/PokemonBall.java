
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
public class PokemonBall {
    
    private Scanner commandScanner;
    private float opportunity;
  
    
    
    public PokemonBall(){
        String command;
        System.out.print("\nWhich ball do you want? Type: ");
        command = commandScanner.next();
        if(command.equals("PokeBall")){
            this.opportunity = (float) 0.8;    
        }
        else if(command.equals("GreatBall")){
            this.opportunity = (float) 0.9;
        }
        else if(command.equals("UltraBall")){
            this.opportunity = (float) 1.0;
        }
    }
    public float getOpportunity(){
        return this.opportunity;
    }
}

