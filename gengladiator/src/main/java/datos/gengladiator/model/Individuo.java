package datos.gengladiator.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Individuo {
	
	@XmlElement
	private int fitness;
	@XmlElement
	private int cromosoma[];
	
	public Individuo(int num){
		this.fitness = num;
		this.cromosoma = new int[6];
	}
	
	public Individuo(){
		
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
