import java.util.Random;



public class mazo  {

	carta[] baraja = new carta[40];
	

	public mazo() {
		
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
				
			this.baraja[i] = new carta(a,b);
			a++;
			
		}
		
	}
	
	public void mezclar() {
		
		carta[] copia = new carta[this.baraja.length];
		
for (int i = 0; i<this.baraja.length;i++) {
			copia[i] = new carta(this.baraja[i].numero,this.baraja[i].palo);
		}



		Random rnd = new Random();
		
		for (int i = 0; i<this.baraja.length;i++) {
			this.baraja[i] = copia[rnd.nextInt(39)];
		}
	}


	public void imprimir() {
		
for (int i=0; i<this.baraja.length; i++) {
			
			this.baraja[i].imprimir();
			
		}
	}
}



/* 
 * 
 * Código deprecado
for (int i=0; i<=39; i++) {
	
	candidatoNumero = generador1.nextInt(11+1);
	while (candidatoNumero == 9 || candidatoNumero ==  8 || candidatoNumero < 1 || candidatoNumero > 13) {
		candidatoNumero = generador1.nextInt(11+1);
		}
	
	candidatoPalo = generador2.nextInt(3)+1;
	
	if (i > 0) {
	while (this.existeEstaCartaEnMazo(candidatoNumero,candidatoPalo,i)){
		
		candidatoNumero = generador1.nextInt(11+1);
		while (candidatoNumero == 9 || candidatoNumero ==  8 || candidatoNumero < 1 || candidatoNumero > 13) {
			candidatoNumero = generador1.nextInt(11+1);
			}
		candidatoPalo = generador2.nextInt(3)+1;	
	}
	}
	
	this.baraja[i] = new carta(candidatoNumero,candidatoPalo);
	

	



}

*/
