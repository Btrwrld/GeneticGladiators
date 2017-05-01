

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poblacion p = new Poblacion();
		//total de individuos
		int totalInd = 12;
		int totalFitness = 54*totalInd;
		int generaciones = 30;
		p.pInicial(totalInd);
		
		int numGeneracion = 1;
		Reproductor r = new Reproductor();
		Seleccionador s = new Seleccionador();
		while(p.getFitnessT() <= totalFitness){
			if(numGeneracion >= generaciones){
				break;
			}
			else{
				p = s.seleccionar(p);
				p = r.reproducir(p);
				numGeneracion+=1;
				}
		}
		for(int i = 0; i < p.getPoblacion().size(); i++){
			System.out.printf("%d  :", p.getPoblacion().get(i).getFitness());
			for(int j = 0; j<6; j++){
				System.out.printf("%d ",p.getPoblacion().get(i).getCromosoma()[j]);
			}
			System.out.println("");
		}

	}

}
