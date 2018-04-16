
public class Ejercicio3 {

	public static int[] agregarAtras(int[] a, int x) {
		
		int largor = a.length;
		int[] b = new int[largor+1];
		
		String hola = "hola como va?";
		
		hola.length();
		
		
		for (int i = 0 ; i < largor ; i++) {
			b[i] = a[i];
		}
		
		b[largor] = x;
		return b;
		
		
	}
	
}
