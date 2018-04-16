
public class Ejercicio2 {

	public static double promedio(int[] a) {
		
		int largor = a.length;
		int suma = 0;
		int promedio = 0;
		

		for (int i = 0 ; i < largor ; i++) {
			suma = suma + a[i];
		}
		
		promedio = suma / largor;
		return promedio;
		
	}
	
}
