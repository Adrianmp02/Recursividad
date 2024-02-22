package es.juana.daw;

public class Recursividad {
	
	public static void main(String[] args) {
		
		
		
		//imprimirNNumeros2(5);
		
		//System.out.println(cantidadDigitos(6435));
		//System.out.println(fibonacci(10));
		System.out.println(elevar(2,2));
		
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
	
	public static int fibonacci(int n) {
		
		if(n>1) {
			return fibonacci(n-1) + fibonacci(n-2);
		}else if(n==1) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int elevar(int base, int exponente) {
		
		if(exponente == 0) return 1;
		else if(exponente == 1) return base;
		else {
			return base * elevar(base, exponente-1);
		}
		
	}
}
