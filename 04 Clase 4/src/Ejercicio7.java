
public class Ejercicio7 {

	public static int[] opuestos(int[] a) {
		
		int[] b = new int[a.length];
		
		for (int i = 0; i< a.length ; i++) {
			b[i] = a[i] * (-1);
		}
		return b;
	}
	
	
}
