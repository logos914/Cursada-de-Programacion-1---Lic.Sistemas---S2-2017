import java.util.Random;



public class Mazo  {

	private Carta[] baraja = new Carta[40];
	private int primeraPosicionNoNull;

	public Mazo() {
		this.primeraPosicionNoNull = 0;
		int a = 1;
		int b = 1;
		for (int i=0; i <= 39; i++) {
			
			if (a == 13) {
				a = 1;
				b ++;
			}
			if (a == 9 || a == 8) {
				a = 10;
			}
				
			this.baraja[i] = new Carta(a,b);
			a++;
			
		}
		
	}
	
	public void mezclar() {
		
Random generador = new Random();
		
		for(int i = 0; i < this.baraja.length; i++)
		{
			int n = generador.nextInt(39);
			
			Carta aux = this.baraja[i];
			this.baraja[i] = this.baraja[n];
			this.baraja[n] = aux;
		}
	}


	public void imprimir() {
		
for (int i = this.primeraPosicionNoNull; i<this.baraja.length; i++) {
		
				this.baraja[i].imprimir();
		
		}
	}
	
	public Carta repartir() {
		
		Carta auxi = new Carta(this.baraja[this.primeraPosicionNoNull].getNumero(),this.baraja[this.primeraPosicionNoNull].getPalo());
		
		this.baraja[this.primeraPosicionNoNull] = null;
		this.primeraPosicionNoNull++;
		return auxi;
	
	}
	
}



