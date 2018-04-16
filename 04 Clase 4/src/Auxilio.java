
public class Auxilio {
	
	static void print(int[] a) {
		
		int largor = a.length;
		
		for (int i = 0 ; i < largor ; i++) {
			System.out.print("[");
			System.out.print(a[i]);
			System.out.print("]");
			
			if (i + 1 < largor ) {
				System.out.print(",");
			}
		}
	}
}
