import java.util.Random;

public class Rand {
	//solo para generar numero aleatorios
	public int generarNum(int intervalo){
		Random aleatorio = new Random();
		return 1 + aleatorio.nextInt(intervalo);
		
	}
}
