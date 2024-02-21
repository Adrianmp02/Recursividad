package es.juana.daw;

public class Recursividad {
	
	public static void main(String[] args) {
		System.out.println(factorialNNumeros(5));
	}
	
	
	public static int sumarNPrimerosNumeros(int n) {
		if(n == 1) return 1;
		System.out.println("Suma de "+n+" mas los "+(n-1)+" primeros");
		return n + sumarNPrimerosNumeros(n-1);
	}
	
	public static int factorialNNumeros(int n) {
		if(n == 1) return 1;
		System.out.println("Multiplicacion de "+n+" mas los "+(n-1)+" siguientes");
		return n * factorialNNumeros(n-1);
	}
}
