
public class clase7 {

	static int sumarDig(int n)
	{
		if (n<=9) {
			return n;
		} else {
			return n%10 + sumarDig(n/10);
		}
	}
	
	
	static void cantarCancion(int botellas) {
		if (botellas == 0) { 
			System.out.print("No hay más botellas de cerveza en la pared, no hay más botellas de cerveza, no la agarrás, y no la pasarás, porque no hay más botellas de cervezas en la pared");
			}
		else {
			int unamenos = botellas - 1;
			System.out.print("Hay " + botellas + " botellas de cervezas en la pared, hay " + botellas + " botellas de cerveza, una sola agarrás, y después la pasas, hay " + unamenos + " botellas de cerveza en la pared \n"); 
			cantarCancion(botellas-1);
		}
	}
	
	static void imprimirEspaciado(String cadena) {
		if (cadena.length() == 0) {
			
		} else {
			System.out.print(cadena.charAt(0) + " ");
			imprimirEspaciado(cadena.substring(1));
		}
	}
	
	static String inversa (String cadena) {
		
		if (cadena.isEmpty()) {
			return "";
		} else {
			return inversa(cadena.substring(1)) + cadena.charAt(0) ;
		}
		
	}
	
	static boolean esAbecedaria(String cadena) {
		
		if (cadena.length() == 1) {
			return true;
		}
		else {
			if(cadena.charAt(0) <= cadena.charAt(1) ) {
			return true && esAbecedaria(cadena.substring(1));
			}
		 else {
			return false;
		}
			}
		
	}
	
	
	
	public static void main(String[] args) {
		

	
		
		
System.out.print(sumarDig(235));

cantarCancion(99);

System.out.print("\n\n");
imprimirEspaciado("La Concha de tu madre");


System.out.print("\n\n");
imprimirEspaciado(inversa("La Concha de tu Madre"));


System.out.print("\n\n");
System.out.print("\n\n");

boolean abece = esAbecedaria("agil");
System.out.println(abece);

abece = esAbecedaria("tarro");
System.out.println(abece);
	}

}
