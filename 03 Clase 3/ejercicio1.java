
public class ejercicio1 {

	// Ejercicio 1
	static int cuentaLetras(String cadena, char letra) {
		
		int cantidad = 0;
		
		for (int i = 0 ; i < cadena.length() ; i++ ) {
			if (cadena.charAt(i) == letra) {
				cantidad++;
				}
		}
		
		return cantidad;
	}
	
	
// Ejercicio 2
	static boolean soloPorE(String cadena) {
		
		for (int i = 0 ; i < cadena.length() ; i++ ) {
			if (cadena.charAt(i) != 'e') {
				return false;
				}
		}
		return true;
	}
	
	
	
	static boolean sonIguales(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		for (int i = 0 ; i < s1.length() ; i++ ) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		
		return true;
		
	}
	// Ejercicio 4
	static boolean esDuodroma(String cadena) {
		if (cadena.length() % 2 != 0) {
			return false;
			}
		
		if (cadena.length() == 0) {
			return false;
		}
		
		for (int i = 0 ; i < cadena.length() ; i = i + 2 ) {
			if (cadena.charAt(i) != cadena.charAt(i+1)) {
				return false;
			}
		}

		return true;
	}
	
	// Ejercicio 5
	static boolean esPrefijo(String s, String prefijo) {
		
		if(s.length() == 0 || prefijo.length() == 0) { return false ; }
		
		if(s.length() < prefijo.length() ) { return false ; }
		
		for( int i = 0 ; i < prefijo.length(); i++ ) {
			
			if( s.charAt(i) != prefijo.charAt(i) ) {
				return false;
				
			}
									
		}
		return true;
		
	}
	
	// Ejercicio 6
	static boolean esPrefijoDesde(String s, String prefijo, int posicion) {
		
		if(s.length() == 0 || prefijo.length() == 0) { return false ; }
		
		if((posicion + prefijo.length()) > s.length()) { return false ; }
		
		for( int i = 0; i < prefijo.length(); i++ ) {
			
			if( s.charAt(posicion - 1 + i) != prefijo.charAt(i) ) {
				return false;
				
			}
									
		}
		return true;
		
	}
	

	
	static boolean esSubcadena( String s2 , String s1 ) {
		
		
		if(s1.length() > s2.length()) { return false; }
	
		int okDesde = 0;
		for (int i = 0; i < s2.length(); i++) {
			
			if (s2.charAt(i) == s1.charAt(okDesde) ) {
				okDesde++;
				if (okDesde == s1.length() - 1 ) { return true; } else { return false; }
			} else { okDesde = 0; }
			
			
				
			
			
			
			}
		
		if (okDesde == s1.length() - 1 ) { return true; } else { return false; }
		
			
			
		
		
	}
	
	

	public static void main(String[] args) {
		String cadenita = "La gran Siete esta cadena solo tiene 8 letras e";
		String cadenita2 = "eee";
		char letrita = 'e';
		
		//ejercicio 1
		System.out.println("EJERCICIO 1");

		int total = cuentaLetras(cadenita,letrita);
		System.out.println("Tiene " + total + " letras '" + letrita + "'");
		
		
		//ejercicio 2
		System.out.println("\nEJERCICIO 2");

		boolean resul = soloPorE(cadenita);
		System.out.println(resul);
		
		System.out.println("\nEJERCICIO 3");
		System.out.println(sonIguales("Hola Chau", "Chau hola"));
		System.out.println(sonIguales("Hola Chau", "Hola Chau"));
		System.out.println(sonIguales("1234", "54321"));

		
		System.out.println("\nEJERCICIO 4");
		System.out.println(esDuodroma("HHOOLLAA"));
		System.out.println(esDuodroma("hhooo"));
		System.out.println(esDuodroma("nada"));
		System.out.println(esDuodroma(""));
		
		System.out.println("\nEJERCICIO 5");
		System.out.println(esPrefijo("Hipermercado" , "Hiper"));
		System.out.println(esPrefijo("lero lero",""));
		System.out.println(esPrefijo("Cochino","corchi"));
		System.out.println(esPrefijo("cac","cacita"));
		
		System.out.println("\nEJERCICIO 6");
		System.out.println(esPrefijoDesde("1234Hipermercado" , "Hiper",4));
		
		System.out.println("\nEJERCICIO 7");
		System.out.println(esSubcadena("1234Hipermercado" , "Hiper"));
		System.out.println(esSubcadena("Hipermercado" , "Hiper"));
		System.out.println(esSubcadena("Hi7permercado" , "Hiper"));
		
		
	}
}

	
	

