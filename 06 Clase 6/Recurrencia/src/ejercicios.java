
public class ejercicios {

	static void imprimirHasta(int n) {
		
		if (n == 1) {
			System.out.println(1);
		} else {
			imprimirHasta(n-1);
			System.out.println(n) ;
		}
		
	}

	
	static int sumaDesdeUnoHasta(int n) {
		
		if (n == 1) {
			 return 1;
		 }
		 else {
			 return n + sumaDesdeUnoHasta(n-1);
		 }
	}
	
	
	static void imprimirDesde(int n)  {
		
		if (n <= 1) {
			System.out.println(1);
		} else {
			System.out.println(n) ;
			imprimirDesde(n-1);
			
			
		}
		
	}
	
	static int sumaEntre(int n, int m) {
		 
		 if (m == n) {
			 return m;
		 }
		 else {
			 return n + sumaEntre(n+1,m);
		 }
	 }
	
	
	 static int potencia(int base, int exp) {
		 
		 if (exp == 1) {
			 return base;
		 } else {
			 return base * potencia(base,exp-1); 
		 }
		 
		 
	 }
	
	static int cantidadPrimosEntre(int n, int m) {
		
		if(n==m) {
			if (esPrimo(n)) {
				return 1 ;
				
			} else {
				return 0 ; }
			
		} else {
			
			if (esPrimo(n)) {
				return 1 + cantidadPrimosEntre(n+1,m);
				
			} else {
				return 0 + cantidadPrimosEntre(n+1,m);
				
				
			}
			
			
		}
		
		
	}
	
	static boolean esPrimo(int numero) {
		
		int cantidadDivisores = 0;
		
		for (int i=1; i <= numero ; i++ ) {
			
			if (numero % i == 0) {
				cantidadDivisores++;
			}	
		}
		
		if (cantidadDivisores > 2) {
			return false ;
		} else { 
			return true; 
			}
		
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("\n" + sumaEntre(4,7));
		System.out.println("");
		imprimirHasta(25);
		System.out.println("");
		System.out.println(sumaDesdeUnoHasta(4));
		System.out.println("");
		imprimirDesde(4);
		System.out.println("");
		System.out.println(potencia(2,5));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(cantidadPrimosEntre(2,11));
		
		
	
	
	}

}
