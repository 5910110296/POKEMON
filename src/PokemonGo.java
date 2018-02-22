/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class PokemonGo {
        private String name;
	private float weight;
        private int step;
	private float stepLength;
        private float putonweight;
        private String[] types;
        
	
	public PokemonGo (String name, float weight, float stepLength, float putonweight, String[] types){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
                this.putonweight = putonweight;
                step = 0;

		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
                
	}
	public String getName() {
		return this.name;
	}
	public float getWeight() {
		return this.weight;
	}
	public float getDistance(float stepLength) {
		return stepLength;
	}
	public float getJumpDistance(int step) {
		return 3*stepLength;
	}
        public void walk(){
		step += 1;
	}

	public void eat(){
		weight += putonweight;
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
		System.out.println("------------------------------------------");
	}

}
