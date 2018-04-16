import java.util.Scanner;

public class Divisor {
	
	static boolean dameDivisor(int numero, int candidato) {
		
		if (numero % candidato == 0){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	static int cantDivisores (int numero) {
		int cantidad = 0;
		for(int i = 1; i <= numero ; i++) {
			if (dameDivisor(numero,i)==true) {
				cantidad++;
			}
		
		}
		return cantidad;
	}

	
	
	
	public static void divisoresDe(int numero) {
		
		
		
		
		
	
		
		for(int i = 1; i <= numero ; i= i+1) {
			
			if (dameDivisor(numero,i)==true) {
				System.out.println("El número " + i + " es divisor de " + numero);
				
			}
			
		
			
		}
		
		System.out.println("\nTu número elegido tiene " + cantDivisores(numero) + " divisores \n\n\n");


	}

}
