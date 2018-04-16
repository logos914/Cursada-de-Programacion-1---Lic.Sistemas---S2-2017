
public class Ejercicio1 {

	static int maximo(int[] a) {
		
		int largor = a.length;
		int grandor = 0;
		
		for (int i=0; i< largor ; i++) {
			
			if( i==0 ) {
				grandor = a[i];
			}
			
		if ( a[i] > grandor) {
			grandor = a[i];
		}
			
		}
		return grandor;
		
	}
	

}
