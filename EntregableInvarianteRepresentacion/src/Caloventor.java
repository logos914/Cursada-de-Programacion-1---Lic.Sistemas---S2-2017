public class Caloventor {
	boolean encendido;
	char modo;
	int velocidad;

	Caloventor(boolean e, char m, int v) {

		this.encendido = e;
		this.modo = m;
		this.velocidad = v;
	}

	public boolean validar() {
		if (this.modo != 'c' && this.modo != 'f') {
			return false;
		}

		if (this.velocidad < 0 || this.velocidad > 3) {
			return false;
		}

		if (this.encendido == false || this.velocidad != 0) {
			return false;

		}

		return true;

	}

}
