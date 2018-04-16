import java.awt.*;
import java.math.*;

public class objetitos {

	static double distancia(Point p1, Point p2) {

		return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
	}

	static double diagonal(Rectangle r) {

		Point p1 = new Point(r.x, r.y);
		Point p2 = new Point(r.x + r.width, r.y + r.height);
		return distancia(p1, p2);

	}

	static boolean estaDentro(Point p, Rectangle r) {

		if ((p.x >= r.x && p.x <= (r.x + r.width))
				&& (p.y >= r.y && p.y <= (r.y + r.height))) {
			return true;

		} else {
			return false;
		}
	}

	static String dondeEsta(boolean afir) {
		if (afir == true) {
			return "La Tiene Adentro";
		} else {
			return "No está adentro";
		}
	}

	static Point puntoMedio(Point p1, Point p2) {

		Point mediatriz = new Point(promedio(p1.x, p2.x), promedio(p1.y, p2.y));
		return mediatriz;

	}

	// Aca me fui a la mierda
	static int promedio(int... numeros) {
		int suma = 0;
		for (int n : numeros) {
			suma = suma + n;
		}

		Double prom = new Double(suma / numeros.length);
		return prom.intValue();

	}

	static boolean loContiene(Rectangle r1, Rectangle r2) {

		if (r2.x >= r1.x) {
			if (extremoOpuesto(r2).y <= extremoOpuesto(r1).y) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	static Point extremoOpuesto(Rectangle r1) {
		Point nuevoPunto = new Point(r1.x + r1.width, r1.y + r1.height);
		return nuevoPunto;
	}

	// Ejercicio 6
	static Rectangle encuadrar(Rectangle r1, Rectangle r2) {

		// Necesito dos puntos
		// El punto más pequeño (Inferior izquierdo de nuestro nuevo rectángulo)
		// El punto más grande (Superior Derecho del nuestro nuevo rectángulo)
		Point puntoGenerador = new Point();
		Point puntoOpositor = new Point();

		// ¿Qué punto tiene la coordenada en x más pequeña? ¿el x de r1 ó el x
		// de r2?
		if (r1.x <= r2.x) {
			puntoGenerador.x = r1.x; // Nuevo valor de nuestro punto más pequeño
		} else {
			puntoGenerador.x = r2.x; // Nuevo valor de nuestro punto más pequeño
		}

		// ¿Qué punto tiene la coordenada en y más pequeña? ¿el y de r1 ó el y
		// de r2?
		if (r1.y <= r2.y) {
			puntoGenerador.y = r1.y;
		} else {
			puntoGenerador.y = r2.y;
		}

		// ¿Qué punto tiene la coordenada en x más grande? ¿el x+width de r1 ó
		// el x+width de r2?
		if (extremoOpuesto(r1).x >= extremoOpuesto(r2).x) {
			puntoOpositor.x = extremoOpuesto(r1).x;
		} else {
			puntoOpositor.x = extremoOpuesto(r2).x;
		}

		// ¿Qué punto tiene la coordenada en y más grande? ¿el y+heigth de r1 ó
		// el y+heigth de r2?

		if (extremoOpuesto(r1).y >= extremoOpuesto(r2).y) {
			puntoOpositor.y = extremoOpuesto(r1).y;
		} else {
			puntoOpositor.y = extremoOpuesto(r2).y;
		}

		// Necesito saber el width y el height de nuestro nuevo rectangulo no
		// las coordenadas del punto x+width , y+height

		int altura = puntoOpositor.y - puntoGenerador.y;
		int ancho = puntoOpositor.x - puntoGenerador.x;

		Rectangle r3 = new Rectangle(puntoGenerador.x, puntoGenerador.y, ancho,
				altura);
		return r3;
	}

	public static void main(String[] args) {
		// Ejercicio 1
		Point punto1 = new Point(10, 10);
		Point punto2 = new Point(0, 0);
		System.out.println(distancia(punto1, punto2));

		// Ejercicio 2
		Rectangle r1 = new Rectangle(0, 0, 150, 200);
		System.out.println(diagonal(r1));

		// Ejercicio 3
		Point punto3 = new Point(-50, 250);
		System.out.println(dondeEsta(estaDentro(punto1, r1)));
		System.out.println(dondeEsta(estaDentro(punto3, r1)));

		// Ejercicio 4
		System.out.println(puntoMedio(punto1, punto2));

		// Ejercicio 5
		Rectangle r2 = new Rectangle(10, 10, 120, 190); // Esta dentro de 1
		Rectangle r3 = new Rectangle(100, 100, 151, 199); // No esta dentro de 1
		Rectangle r4 = new Rectangle(100, 100, 151, 299); // No esta dentro de 1
		Rectangle r5 = new Rectangle(140, 190, 200, 201); // No esta dentro de 1
		Rectangle r6 = new Rectangle(140, 190, 199, 200); // Esta dentro de 5
		System.out.println(loContiene(r1, r2));
		System.out.println(loContiene(r1, r3));
		System.out.println(loContiene(r1, r4));
		System.out.println(loContiene(r1, r5));
		System.out.println(loContiene(r5, r6));

		// Ejercicio 6
		System.out.println("Comenzando ejercicio 6");
		System.out.println(encuadrar(r5, r2));

	}

}
