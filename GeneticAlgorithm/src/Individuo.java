


public class Individuo {
	
	private int fitness;
	private int cromosoma[];
	
	public Individuo(){
		this.fitness = 0;
		this.cromosoma = new int[6];
	}
	
	int getFitness(){
		return this.fitness;
	}
	
	int[] getCromosoma(){
		return this.cromosoma;
	}
	
	void setCromosoma(int num, int pos){
		this.cromosoma[pos] = num;
	}
	void setFitness(){
		int tempFitness = 0;
		for(int i = 0; i < 6; i++){
			tempFitness = tempFitness + this.cromosoma[i];
		}
		this.fitness = tempFitness;
	}
	
}
