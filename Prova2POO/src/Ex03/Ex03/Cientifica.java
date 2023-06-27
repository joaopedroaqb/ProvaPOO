package Ex03;
import java.lang.Math;

public class Cientifica extends Basica{
	
	public static double Raiz(double valA) {
		return Math.sqrt(valA);
	}

	public static double Potencia(double valA, double valB) {
		return Math.pow(valA, valB);
	}
	
	public static double Modulo(double valA, double valB) {
		return valA % valB;
	}
	
}
