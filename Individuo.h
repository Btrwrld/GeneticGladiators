
class Individuo{
	public:
		Individuo(){
			fitness = 0;
			cromosoma = new int[6];
		}
		
		int getFitness() {
			return fitness;
		}
		
		int* getCromosoma() {
			return cromosoma;
		}
		
		void setCromosoma(int num, int pos){
			cromosoma[pos] = num;
		}
		
		void setFitness(){
			int temp = 0;
			
			for (int i = 0; i < 6; i++){
				temp += cromosoma[i];
			}
			
			fitness = temp;
		}
		
	private:
		int fitness;
		int* cromosoma;
};
