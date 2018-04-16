
public class ejecumate {

	public static void main(String[] args) {
		
		
		// Ejecutar Ejercicio 1
		int [] prueba1 = { 5,9,0,-19,8};

		System.out.println(Ejercicio1.maximo(prueba1));
		
		
		// Ejecutar Ejercicio 2
		int [] prueba2 = { 6,7,8};

		System.out.println(Ejercicio2.promedio(prueba2));
		
		
		
		
		// Ejecutar Ejercicio 3
		Auxilio.print(prueba2);
		System.out.println("\n");
		prueba2 = Ejercicio3.agregarAtras(prueba2, 914);
		System.out.println("\n");
		Auxilio.print(prueba2);
		
		System.out.println("\n");
		System.out.println("\n");
		
		// Ejecutar Ejercicio 4
		Auxilio.print(prueba1);
		System.out.println("\n");
		prueba1 = Ejercicio4.quitar(prueba1, 3);
		System.out.println("\n");
		Auxilio.print(prueba1);
		
		
		// Ejecutar Ejercicio 5
		System.out.println("\n");
		System.out.println("\n");
		Auxilio.print(prueba1);
		System.out.println("\n");
		int[] prueba3;
		prueba3 = Ejercicio5.reverso(prueba1);
		System.out.println("\n");
		Auxilio.print(prueba3);
		
		
		// Ejecutar Ejercicio 6
		System.out.println("\n");
		System.out.println("\n");
		Auxilio.print(prueba2);
		
		Ejercicio6.reverstir(prueba2);
		System.out.println("\n");
		System.out.println("\n");
		Auxilio.print(prueba2);
		
		
		// Ejecutar Ejercicio 7
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		int [] prueba4 = { 1,2,3,4,5,6,7,8,9,0};
		Auxilio.print(prueba4);
		System.out.println("\n");
		System.out.println("\n");
		prueba4 = Ejercicio7.opuestos(prueba4);
		Auxilio.print(prueba4);
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		int [] prueba5 = new int[0];
		System.out.println(Ejercicio1.maximo(prueba5));
		
		
		

}

	
}
