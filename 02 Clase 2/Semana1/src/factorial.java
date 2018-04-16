


public class factorial {
	
	static int dameFactorial(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	static void dameElFactorial(int numero) {
			
		System.out.print("El factorial de " + numero + " es " + dameFactorial(numero) + "\n\n\n");
		
		
		
		

	}

}
