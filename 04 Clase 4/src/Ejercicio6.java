
public class Ejercicio6 {

	public static void reverstir(int[] a) {
		
		
		
				
		int[] b = new int[a.length];
		int nuevoIndice = 0;
		
		for (int i = a.length - 1 ; i >= 0 ; i--) {

			b[nuevoIndice] = a[i];
			nuevoIndice++;
			
		}
			
		a = b;
	
	}
		
		
	
	
}
