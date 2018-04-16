
public class recursividadConAuxiliares {

	static void hanoi (int n, int desde, int hasta, int aux) {
		
		if(n==0) {
			// System.out.println("Terminamos");
		} else {
			
			hanoi(n-1,desde,aux,hasta);
			System.out.println(desde + "a" + hasta);
			hanoi(n-1,aux,hasta,desde);
		}
			
			
			
			
			
		
		
		
	}
	
	
}
