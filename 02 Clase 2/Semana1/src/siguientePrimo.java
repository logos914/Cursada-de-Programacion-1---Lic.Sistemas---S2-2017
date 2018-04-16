


public class siguientePrimo {
	

		

	
	static int siguientePrimo (int numero) {
		int siguiente = numero + 1;
		
		while (Divisor.cantDivisores(siguiente) >= 3) {
			siguiente++;
			
		}
		
		
		return siguiente;
	}
	

	static void dameElSiguientePrimo(int numero) {

		
		
		System.out.print("Tu siguiente primo es " + siguientePrimo(numero) + "\n\n\n");
		
		
		

	}

}
