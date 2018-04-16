


public class Primos {
	
	
	

	
	
	static boolean esPrimo (int numero) {
		return Divisor.cantDivisores(numero)==2 ;
	}
	

	
	static void decimeSiEsPrimo(int numero) {

		
		
		
	
		
		if (esPrimo(numero)) {	
		System.out.print("Tu numero es Primo\n\n\n");
		}
		else {
			System.out.print("Tu numero es Compuesto\n\n\n");
		}
		
		

	}

}
