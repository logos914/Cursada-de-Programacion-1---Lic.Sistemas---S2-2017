import java.util.Scanner;


public class siguientePrimo {
	
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
	
	static int siguientePrimo (int numero) {
		int siguiente = numero + 1;
		
		while (cantDivisores(siguiente) >= 3) {
			siguiente++;
			
		}
		
		
		return siguiente;
	}
	

	public static void main(String[] args) {
		Scanner scentrada = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Meté un número:");
		numero = scentrada.nextInt();
		
		
		System.out.print("Tu siguiente primo es " + siguientePrimo(numero));
		
		
		

	}

}
