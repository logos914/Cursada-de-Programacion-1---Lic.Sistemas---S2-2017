
public class principal {

	public static void main(String[] args) {
		
		int[] arreglin = new int[5];
		arreglin[0] = 9;
		arreglin[1] = 14;
		arreglin[2] = 28;
		arreglin[3] = 22;
		arreglin[4] = 1;
		
		
		
		System.out.print(arregloRecursivo.estaElNum(14,arreglin));
		System.out.print("\n");
		System.out.print(arregloRecursivo.sumarArreglin(arreglin));
		System.out.print("\n");
		System.out.print(arregloRecursivo.devuelvaMaximo(arreglin));
		System.out.print("\n");
		recursividadConAuxiliares.hanoi(3,0,2,1);
		

	}

}
