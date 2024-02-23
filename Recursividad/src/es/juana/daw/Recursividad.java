package es.juana.daw;

public class Recursividad {

	public static void main(String[] args) {



		//imprimirNNumeros2(5);

		//System.out.println(cantidadDigitos(6435));
		//System.out.println(fibonacci(10));
		//System.out.println(elevar(2,2));
		//invertir(5432);
		//System.out.println(ordenarAlfabeticamente("abc"));
		//System.out.println(palindromo("abccba"));
		//binario(13);
		System.out.println(esBinario(1121));
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

	public static void invertir(int n) {

		if(n<10) System.out.println(n);

		else {
			System.out.print(n%10);
			invertir(n/10);
		}

	}

	public static boolean ordenarAlfabeticamente(String n) {
		n = n.toLowerCase();
		if(n.length() > 1) {
			if(n.charAt(0) <= n.charAt(1)) {
				return ordenarAlfabeticamente(n.substring(1, n.length()));
			}
			return false;
		}
		return true;
	}

	public static boolean palindromo(String n) {

		n = n.toLowerCase();
		if(n.length() > 1) {
			if(n.charAt(0) == n.charAt(n.length()-1)) {
				return palindromo(n.substring(1, n.length()-1));
			}
			return false;
		}
		return true;
	}

	public static void binario(int n) {
		if(n>1) {
			binario(n/2);
			System.out.print(n%2);
		}else {
			System.out.print(n);
		}

	}

	public static boolean esBinario(int n) {

		if(n>1) {
			esBinario(n/10);
		}
		return true;
	}
}
