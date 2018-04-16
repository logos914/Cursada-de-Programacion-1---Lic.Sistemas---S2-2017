import java.util.Scanner;

public class divisor {
	
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
		for(int i = 1; i != numero ; i++) {
			if (dameDivisor(numero,i)==true) {
				cantidad++;
			}
		
		}
		return cantidad;
	}

	public static void main(String[] args) {
		Scanner scentrada = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Meté un número:");
		numero = scentrada.nextInt();
		
		scentrada.close();	
		
		for(int i = 1; i != numero ; i= i+1) {
			
			if (dameDivisor(numero,i)==true) {
				System.out.println("El número " + i + " es divisor de " + numero);
				
			}
			
			
				
			
		}
		
		System.out.println("\nTu número elegido tiene " + cantDivisores(numero) + " divisores");


	}

}
