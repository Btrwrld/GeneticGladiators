package datos.gengladiator.model;


public class Reproductor {
	 
	public Poblacion reproducir(Poblacion p){
		Rand r = new Rand();
		int numP = p.getPoblacion().size();
		
		//elige los individuos a cruzar
		for(int i = 0, j = numP/2; j < numP; i++ , j++){
			Individuo a = p.getPoblacion().get(i);
			Individuo b = p.getPoblacion().get(j);
			Individuo c = new Individuo(0);
			Individuo d = new Individuo(0);
			
			//realiza el cruce de los cromosomas
			for(int k = 0, w = 3; w < 6; k++, w++){
				c.setCromosoma(a.getCromosoma()[k], k);
				c.setCromosoma(b.getCromosoma()[w], w);
				d.setCromosoma(a.getCromosoma()[w], w);
				d.setCromosoma(b.getCromosoma()[k], k);
			}
			//mutar
			if(r.generarNum(9) > 5){
				c.setCromosoma(r.generarNum(4)+5, r.generarNum(6)-1);
				d.setCromosoma(r.generarNum(4)+5, r.generarNum(6)-1);
			}
			//set fitness
			c.setFitness();
			d.setFitness();
			//add to population
			p.addIndividuo(c);
			p.addIndividuo(d);
		}
		return p;
	} 
}
