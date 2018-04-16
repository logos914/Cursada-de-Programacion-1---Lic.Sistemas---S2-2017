import java.util.Scanner;


public class clase15 {

	public static void main(String[] args) {

		Mazo m = new Mazo();
		m.mezclar();
				
		ManoJugador j = new ManoJugador();
		
		Carta c = m.repartir();
		j.recibirCarta(c);
		
		c = m.repartir();
		j.recibirCarta(c);
		
		String respuesta = null;
		
		System.out.print(" ### Te tocaron las cartas:\n");
		j.imprimir();
		System.out.print(" ### Tu puntaje es:" + j.calcularPuntaje());
		
		if (j.calcularPuntaje() < 7.5) {
			System.out.print("\n @ Te toca jugar, ¿Pedís otra carta? ('S' para si, 'N' para no)");
			Scanner sc = new Scanner(System.in);
			respuesta = sc.nextLine();	
			
		}
		
		while ((respuesta.equals("S") || respuesta.equals("s")  ) && j.calcularPuntaje() < 7.5) {
			
			c = m.repartir();
			j.recibirCarta(c);
			
			System.out.print(" ### Te tocaron las cartas:\n");
			j.imprimir();
			System.out.print(" ### Tu puntaje es:" + j.calcularPuntaje());
			
			if (j.calcularPuntaje() < 7.5) {
				System.out.print("\n @ Te toca jugar, ¿Pedís otra carta? ('S' para si, 'N' para no)");
				Scanner sc = new Scanner(System.in);
				respuesta = sc.nextLine();	
				
			}
			
		}
		
		if ( ( respuesta.equals("N") || respuesta.equals("n") ) && j.calcularPuntaje() <= 7.5) {
			
			ManoJugador b = new ManoJugador();
			
			Carta cc = m.repartir();
			b.recibirCarta(c);
			
			cc = m.repartir();
			b.recibirCarta(c);
			
			while (b.calcularPuntaje() < j.calcularPuntaje() && b.calcularPuntaje() < 7.5) {
				
				cc = m.repartir();
				b.recibirCarta(c);
				
			}
			
			
			System.out.print(" ### Te tocaron las cartas:\n");
			j.imprimir();
			System.out.print(" ### Tu puntaje es:" + j.calcularPuntaje());
			
			System.out.print(" ### La banca tiene estas cartas:\n");
			b.imprimir();
			System.out.print(" ### Puntaje de la banca:" + j.calcularPuntaje());
			
			if ((b.calcularPuntaje() < j.calcularPuntaje()) || (b.calcularPuntaje() > 7.5 && j.calcularPuntaje() <= 7.5 )) {
				System.out.print("\nGANASTE");
			}
			
			if (b.calcularPuntaje() > j.calcularPuntaje() || (b.calcularPuntaje() <= 7.5 && j.calcularPuntaje() <= 7.5 ) ) {
				System.out.print("\nPERDISTE");
			}
		
			
			
		}
		
		
		
		
		
	}

}
