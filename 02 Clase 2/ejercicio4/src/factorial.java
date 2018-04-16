import java.util.Scanner;


public class factorial {
	
	static int dameFactorial(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Indica un número:");
		numero = sc.nextInt();
		System.out.print("El factorial de " + numero + " es " + dameFactorial(numero));
		
		
		
		

	}

}
