import java.util.Scanner;


public class primos {
	
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
	
	
	
	static boolean esPrimo (int numero) {
		return cantDivisores(numero)==2 ;
	}
	

	public static void main(String[] args) {
		Scanner scentrada = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Meté un número:");
		numero = scentrada.nextInt();
		
		if (esPrimo(numero)) {	
		System.out.print("Tu numero es Primo");
		}
		else {
			System.out.print("Tu numero es Compuesto");
		}
		
		

	}

}
