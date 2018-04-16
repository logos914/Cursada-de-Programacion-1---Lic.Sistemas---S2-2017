import java.util.Scanner;
public class tartertir {

	static int auxColumna(int i) {
		if (i == 1 || i==4 || i==7) {
			return 1;
		}
		if (i == 2 || i==5 || i==8) {
			return 2;
		}
		if (i == 3 || i==6 || i==9) {
			return 3;
		} else { return 0; }
	}
	
	static int auxFila(int i) {
		if (i == 1 || i==2 || i==3) {
			return 1;
		}
		if (i == 4 || i==5 || i==6) {
			return 2;
		}
		if (i == 8 || i==7 || i==9) {
			return 3;
		} else { return 0; }
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TaTeTi juegon;
	juegon = new TaTeTi();
	Scanner  sc = new Scanner(System.in);
	int jugaren;
	int fila;
	int columna;
	
	System.out.println("Bievenido al Tar Ter Tir");
	System.out.println("Se juega del 1 al 9");
	System.out.println(" 1 . 2 . 3 ");
	System.out.println(" 4 . 5 . 6 ");
	System.out.println(" 7 . 8 . 9 ");

	System.out.println(" ========= ");
	System.out.println(" ========= \n\n");
	int sum = 0;
	
	juegon.mostrar();

	while(juegon.terminado() == false) {
	

		
		try {
			
			if (sum == 0) {
				System.out.print(" Comienza Jugando ");
				sum = sum + 1;
			}
			else {
				System.out.print(" Continúa Jugando ");
				
			}
			System.out.print(juegon.proximoTurno());
			
			System.out.print("\nIndicá donde jugas: ");
			jugaren = sc.nextInt();
			juegon.jugar(auxFila(jugaren), auxColumna(jugaren));
			juegon.mostrar();

			
			}
			catch(RuntimeException unavar) {
				System.out.print("\nNo hagas cagada \n Probá de nuevo");
				
				
					System.out.print("\n Ese lugar está ocupado por)");
					
				
			}

		if (juegon.terminado() == true) {
			try {
				if (juegon.ganador() == ' ') {
					System.out.print("\nPERDEDORES! ");
					System.out.print("ninguno gano");
				} else {
				
				
				System.out.print("\nFELICITACIONES! ");
				System.out.print(juegon.ganador());
				System.out.print(" es el ganador.");
				}
			}
			catch(RuntimeException unavar) {
				System.out.print("\nPERDEDORES! ");
				System.out.print("ninguno gano");
			}
		}
	
	}

}
}