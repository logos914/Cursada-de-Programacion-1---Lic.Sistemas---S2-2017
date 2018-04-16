
public class arregloRecursivo {

	static int[] menosPrimero(int [] arreglo) {
		int [] nuevoArreglo = new int[arreglo.length-1];
				
				for(int i = 1; i<arreglo.length; i++) {
					nuevoArreglo[i-1] = arreglo[i];
				}
		return nuevoArreglo;
	}
	
	
	static boolean estaElNum(int numero, int [] arreglo) {
		if (arreglo.length == 0) {
			return false;
		} else {
			if (arreglo[0] == numero) {
				return true || estaElNum(numero,menosPrimero(arreglo));	
				} else {
				return false || estaElNum(numero,menosPrimero(arreglo));
			}
			
		}
	}
	
	
	static int sumarArreglin(int[] arreglo) {
		
		if (arreglo.length == 0) {
			return 0;
		
	} else {
		
		return arreglo[0] + sumarArreglin(menosPrimero(arreglo));
		
	}
	}
	
	
	static int devuelvaMaximo(int [] arreglo) {
		if (arreglo.length == 1) {
			return arreglo[0];
		} else {
			if (arreglo[0] >= devuelvaMaximo(menosPrimero(arreglo))) {
				return arreglo[0];
			} else {
				return devuelvaMaximo(menosPrimero(arreglo));
			}
			
		}
	}
	
	
	
	


}
