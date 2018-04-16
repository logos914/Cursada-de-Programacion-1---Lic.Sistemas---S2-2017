
public class Ejercicio4 {

	 public static int[] quitar(int[] a, int pos) {
		 
			int largor = a.length;
			int[] b = new int[largor-1];
			boolean borro = false;
			
			for (int i = 0 ; i < largor ; i++) {
				
			if (i + 1 != pos && borro == false) {
				b[i] = a[i];
			}
			else if (i + 1 != pos && borro == true) {
				b[i-1] = a[i];
			}
			else if (i + 1 == pos && borro == false) {
				borro = true;
				}
			else if (i + 1 == pos && borro == true) {
			// No deberia ocurrir nunca
			}
			
			
			
			
			
	 }
			return b;
	 }
}
	

