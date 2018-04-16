
public class ManoJugador {

		Carta[] mano;
		int primeraPosicionNoNull;
		
		ManoJugador() {
			this.mano = new Carta[14];
			
			
		}
		
		public void recibirCarta (Carta c) { 
			
			this.mano[this.primeraPosicionNoNull] = c;
			this.primeraPosicionNoNull++;
			
			
		}
		
		public double calcularPuntaje() {
			int puntaje = 0;
			for (int i = 0; i<this.primeraPosicionNoNull;i++ ) {
				if (this.mano[i].getNumero() <=7) {
					puntaje +=  this.mano[i].getNumero();
				}
				else {
					puntaje +=  0.5;
				}
			}
			return puntaje;
		}
		
		public void imprimir() {
			for (int i = 0; i<this.primeraPosicionNoNull;i++ ) {
				this.mano[i].imprimir();
			}
		}
}
