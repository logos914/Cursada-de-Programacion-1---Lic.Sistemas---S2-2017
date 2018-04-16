public class Tateti {
	char[][] tablero;
	char proximoTurno;
	boolean terminado;
	char ganador;

	public boolean estaCorrecto() {

		if (this.terminado == true) {
			// Juego terminado

			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					if (tablero[a][b] == ' ') {
						return false; // si hay un lugar vacio en el tablero
										// terminado, alguien hace trampa
					}
				}
			}
		} else {

			// Juego no terminado
			int contar = 0;
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					if (tablero[a][b] != ' ') {
						contar++; // cuenta espacios vacios
					}
				}
			}
			if (contar == 9) {
				return false; // si las posiciones distintas a vacio es igual al
								// total entonces este juego deberia estar
								// terminado.
			}

		}
		return true;
	}
}
