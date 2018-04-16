import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	private int vidas = 6;
	private String adiviname;
	private char[] letrasDisplay;
	private char[] letrasAdivinar;
	private char[] letrasErradas = new char[vidas];
	
	

	
	public Ahorcado(String adivinar) {
		
		//Sólo si la palabra es válida
		if (adivinar.length() > 0) {
			
			for (int i = 0; i<6;i++) {
				letrasErradas[i] = '♥';
			}
			
			this.adiviname = adivinar;

			this.letrasAdivinar = new char[adivinar.length()];
			this.letrasDisplay = new char[adivinar.length()];

			// Poblar los arrays con '_' o con la letra de la palabra
			for (int i = 0; i < adivinar.length(); i++) {
				this.letrasAdivinar[i] = adivinar.charAt(i);
				this.letrasDisplay[i] = '_';
			}

		} else {
			throw new RuntimeException("La Palabra debe contener letras");

		}

	}

	
	public void imprimir() {
		
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@    A H O R C A D O   1 . 0    @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < this.letrasDisplay.length; i++) {
			System.out.print(" " + this.letrasDisplay[i] + " ");
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Vidas Disponibles: ");
		for (int i = 0; i<6;i++) {
			System.out.print( " " + letrasErradas[i] + " ");
		}
		
		
	}
	
	public boolean sigueJugando() {
		
		if (this.vidas == 0) {
			return false;
		}
		
		
		for(int a = 0; a<this.letrasAdivinar.length;a++) {
			if (this.letrasAdivinar[a] != this.letrasDisplay[a]) {
				return true;
			}
			
		
			
			
		}
		
		return false;
		
	}
	
	public boolean estaGanado() {
		
	
		
		for(int a = 0; a<this.letrasAdivinar.length;a++) {
			if (this.letrasAdivinar[a] != this.letrasDisplay[a]) {
				return false;
			}
		}
		return true;
		
	
	}
	
	public void intentarLetra(char letra) {
		int aciertos = 0;
		for(int i = 0; i<this.letrasAdivinar.length;i++) {
			if (letra == this.letrasAdivinar[i]) {
				this.letrasDisplay[i] = letra;
				aciertos++;
			}
		
			
		}
		if (aciertos == 0) {
			
			switch(vidas) {
			case 6:
				this.letrasErradas[0] = letra;
				break;
			case 5:
				this.letrasErradas[1] = letra;
				break;
			case 4:
				this.letrasErradas[2] = letra;
				break;
			case 3:
				this.letrasErradas[3] = letra;
				break;
			case 2:
				this.letrasErradas[4] = letra;
				break;
			case 1:
				this.letrasErradas[5] = letra;
				break;
			case 0:
				throw new RuntimeException("No mereces jugar y encima le erras");
				
			default:
				throw new RuntimeException("Peor todavia");
				
				
			}
			
			this.vidas--;
			
			
		}
		
	}
	
	public void intentarPalabra(String palabra) {
		
		if (palabra.length() != this.adiviname.length()) {
			this.vidas = 0;
			for (int i = 0;i<this.letrasErradas.length;i++) {
				this.letrasErradas[i] = '*';
				
			}
			
		}
		else {
			
		
		for(int i = 0; i<this.adiviname.length();i++) {
			if (palabra.charAt(i) != this.adiviname.charAt(i)) {
				this.vidas = 0;
				for (int a = 0;a<this.letrasErradas.length;a++) {
					this.letrasErradas[a] = '*';
				}
				
			}
			else {
				this.letrasDisplay[i] = palabra.charAt(i);
			}
		}
		}
		
	}
	
	
	public static void main(String[] args)  {    
	   
		Scanner escaner = new Scanner(System.in);
		
		
		try {
		Scanner sc = new Scanner(new File("E:\\diccionario.txt"));
		}
		catch (FileNotFoundException e) {
		
	}
		List<String> lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  lines.add(sc.nextLine());
		}

		String[] arr = lines.toArray(new String[0]);
		
		Random randomm = new Random();
		int pos = randomm.nextInt(arr.length - 0 + 1) + 0;
		
		Ahorcado juego = new Ahorcado(arr[pos]);
		
		
		
		
		while(juego.sigueJugando()) {
			juego.imprimir();
			System.out.print("\nIngresa tu opción: ");
			String intento = escaner.next();
			if (intento.length()==1) {
			juego.intentarLetra(intento.charAt(0));
			}
			else {
				juego.intentarPalabra(intento);
			}
			
		juego.imprimir();
		if (juego.estaGanado()) {
			System.out.print("\nGANASTE!!!");
			
		} else {
			System.out.print("\nlooooooser");
		}
			
		}
		
		
		
		
	}
	
}
