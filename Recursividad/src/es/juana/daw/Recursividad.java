package es.juana.daw;

public class Recursividad {
	
	public static void main(String[] args) {
		
		
		
		//imprimirNNumeros2(5);
		
		System.out.println(cantidadDigitos(6435));
		
		
		
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
	
	public static void imprimirNNumeros(int n) {
		if(n>1) {
			imprimirNNumeros(n-1);	
		}
		System.out.println(n);
	}
	
	public static void imprimirNNumeros2(int n) {
		System.out.println(n);
		
		if(n>1) {
			imprimirNNumeros2(n-1);
		};
	}
	
	public static int cantidadDigitos(int n) {
		
		if(n > 0) {
			return 1 + cantidadDigitos(n/10);
		}
	
		return 0;
		 
	}
	
	public static void fibonacci(int n) {
		
	}
}
