package datos.gengladiator.model;


public class Seleccionador {
	
	public Poblacion seleccionar(Poblacion p){
		Rand r = new Rand();
		Poblacion newP = new Poblacion();
		int numP = p.getPoblacion().size();
		
		for(int i = 0; i < (numP/2) ; i++ ){
			//utiliza el algoritmo de la ruleta
			p.refreshFitness();
			int total = p.getFitnessT();
			int ranNum = r.generarNum(total);
			int suma = 0;
			int index = 0;
			//se busca el indice sobre el individuo posicionado por ultima ves segun la suma y comparacion del algortimo
			for(int k = 0; k < p.getPoblacion().size(); k++){
				suma = suma + p.getPoblacion().get(k).getFitness();
				index = k;
				if(suma >= ranNum){
					break;
				}
				else{
					continue;
				}
			}
			Individuo ind = p.getPoblacion().get(index);
			p.getPoblacion().remove(index);
			newP.addIndividuo(ind);
		}
		return newP;
	}

}
