package datos.gengladiator.model;

import java.util.LinkedList;

public class Poblacion {
	
	private LinkedList<Individuo> poblacion;
	//fitness total de la poblacion
	private int fitnessT; 
	
	public Poblacion(){
		this.poblacion = new LinkedList<Individuo>();
		this.fitnessT = 0;
	}
	
	void addIndividuo(Individuo individuo){
		this.poblacion.addLast(individuo);
	}
	//genera la poblacion inicial
	public void pInicial(int numIndividuos){
		Rand r = new Rand();
		for(int i = 0; i < numIndividuos; i++){
			Individuo a = new Individuo(0);
			for(int j = 0; j < 6; j++){
				a.setCromosoma(r.generarNum(9), j);
			}
			a.setFitness();
			this.poblacion.addLast(a);
		}
	}
	public LinkedList<Individuo> getPoblacion(){
		return this.poblacion;
	}
	//actualizar el fitness total
	public void refreshFitness(){
		if( this.poblacion.size() < 1){
			return;
		}
		else{
			int total = 0;
			for(int i = 0; i < this.getPoblacion().size(); i++){
				total = total + this.getPoblacion().get(i).getFitness();
			}
			this.fitnessT = total;
		}
	}
	
	public int getFitnessT(){
		return this.fitnessT;
	}
	
}
