package datos.gengladiator.model;

import java.util.LinkedList;

public class Data {

	private static Poblacion poblacion = new Poblacion();
	private static int NumPobla;
	private static Reproductor r = new Reproductor();
	private static Seleccionador s = new Seleccionador();
	
	public static LinkedList<Individuo> getPoblacion() {
		return Data.poblacion.getPoblacion();
	}

	public static int getNumPobla() {
		return NumPobla;
	}

	public static LinkedList<Individuo> firstPob(int numInd) {
		Data.poblacion.pInicial(numInd);
		NumPobla = 1;
		return Data.poblacion.getPoblacion();
	}
	
	public static LinkedList<Individuo> newPob() {
		Data.poblacion = s.seleccionar(Data.poblacion); 
		Data.poblacion = r.reproducir(Data.poblacion); 
		NumPobla += 1;
		return Data.poblacion.getPoblacion();
	}
	
}
