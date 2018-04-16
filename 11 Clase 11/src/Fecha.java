public class Fecha {

	int dia;
	int mes;
	int anio;

	public Fecha(int d, int m, int y) {
		this.dia = d;
		this.mes = m;
		this.anio = y;
	}

	public Fecha(int timestamp) {
		int dia_temp = 1;
		int mes_temp = 1;
		int anio_temp = 1970;
		int cantidad_dias;
		int cantidad_anios;

		cantidad_dias = timestamp / 86400;
		cantidad_anios = cantidad_dias / 365;

		while (cantidad_dias > 364) {
			cantidad_dias = descontandoDiasParaSumarAnios(cantidad_dias,anio_temp);
			anio_temp = anio_temp + 1;

		}

		while (cantidad_dias > 28) {
			cantidad_dias = cantidad_dias - 30
					- complementoA30(mes_temp, anio_temp);
			mes_temp = mes_temp + 1;

		}

		dia_temp = cantidad_dias;

		/*
		 * Enero 31 d� Febrero 28 d� (el 29 se suma con la
		 * funci󮠣uantosBisiestospara1970) Marzo 31 d� Abril 30 d� Mayo 31 d�
		 * Junio 30 d� Julio 31 d� Agosto 31 d� Septiembre 30 d� Octubre 31 d�
		 * Noviembre 30 d� Diciembre 31 d�
		 */

		this.dia = dia_temp;
		this.mes = mes_temp;
		this.anio = anio_temp;

	}

	public static int descontandoDiasParaSumarAnios(int dias, int anio_temp) {
		if (esBisiesto(anio_temp)) {
			return dias - 366;
		} else {
			return dias - 365;
		}
	}

	public void imprimir() {
		System.out.print(this.dia);
		System.out.print("/");
		System.out.print(this.mes);
		System.out.print("/");
		System.out.print(this.anio);
	}

	static public boolean esBisiesto(int anio) {
		return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
	}

	static public int cuantosBisiestosPara1970(int anioDePartida) {
		if (anioDePartida == 1970) {
			return 0;
		} else {
			if (esBisiesto(anioDePartida)) {
				return 1 + cuantosBisiestosPara1970(anioDePartida - 1);
			} else {
				return 0 + cuantosBisiestosPara1970(anioDePartida - 1);
			}
		}
	}

	static public int cuantosDias31NosComimos(int mes) {

		switch (mes) {
		case 1:
			return 1;

		case 2:
			return 0;

		case 3:
			return 1;

		case 4:
			return 1;

		case 5:
			return 2;

		case 6:
			return 2;

		case 7:
			return 3;

		case 8:
			return 4;

		case 9:
			return 4;

		case 10:
			return 5;

		case 11:
			return 5;

		case 12:
			return 6;

		default:
			return 0;

		}
	}

	static public int complementoA30(int mes, int anio) {

		switch (mes) {
		case 1:
			return 1;

		case 2:
			if (esBisiesto(anio)) {
				return -1;
			} else {
				return -2;
			}

		case 3:
			return 1;

		case 4:
			return 0;

		case 5:
			return 1;

		case 6:
			return 0;

		case 7:
			return 1;

		case 8:
			return 1;

		case 9:
			return 0;

		case 10:
			return 1;

		case 11:
			return 0;

		case 12:
			return 1;

		default:
			return 0;

		}
	}

	static int diasDelMes(int mes, int anio) {
		return 30 + complementoA30(mes, anio);

	}

	static int aniosADias(int anios) {

		int i = 0;
		int cantDias = 0;

		while (i < anios) {
			if (esBisiesto(i)) {
				cantDias = cantDias + 366;
				i++;
			} else {
				cantDias = cantDias + 365;
				i++;
			}

		}
		return cantDias;
	}

	static int mesesADias(int meses, int anio) {

		int i = 0;
		int cantDias = 0;

		while (i < meses) {
			cantDias = cantDias + 30 + complementoA30(i, anio);
			i++;
		}

		return cantDias;
	}

	int diasDeDiferenciaCon(Fecha otra) {

		int diasDeEsta = this.dia + mesesADias(this.mes, this.anio)
				+ aniosADias(this.anio);
		int diasdeOtra = otra.dia + mesesADias(otra.mes, otra.anio)
				+ aniosADias(otra.anio);

		if (diasDeEsta > diasdeOtra) {
			return diasDeEsta - diasdeOtra;
		} else {
			return diasdeOtra - diasDeEsta;
		}

	}

}
