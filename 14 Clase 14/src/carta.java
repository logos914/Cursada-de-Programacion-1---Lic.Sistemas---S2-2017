
public class carta {
	int numero;
	int palo;
	
public carta(int numero,int palo) {
	if (numero == 9 || numero ==  8 || numero < 1 || numero > 13) {
		throw new RuntimeException("Estás intentando crear una carta inválida Numero=" + numero);
	}
	if (palo < 1 || palo > 5) {
		throw new RuntimeException("Estás intentando crear una carta inválida Palo=" + palo);
		
	}
	this.numero = numero;
	this.palo = palo;
	}

public void imprimir() {
	String paloString = "";
	
	switch(this.palo) {
	case 1: 
		paloString = "Basto";
		break;
		
	case 2:
		paloString = "Copa";
		break;
		
	case 3:
		paloString = "Espada";
		break;
		
	case 4:
		paloString = "Oro";
		break;
	}
	
	
	System.out.println(numero + " de " + paloString );
}

}
