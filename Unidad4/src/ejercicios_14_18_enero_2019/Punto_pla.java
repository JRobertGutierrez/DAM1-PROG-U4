package ejercicios_14_18_enero_2019;

import java.util.Scanner;

public class Punto_pla {
	/**
	 * Punto en el plano con lo que lleva 2 coordenadas
	 * 
	 * @author Robert G
	 */
	public int x, y;

	// Constructor
	Punto_pla() {
		x = 0;
		y = 0;
	}

	// Constructor
	Punto_pla(int x1, int y1) {
		x = x1;
		y = y1;
	}

	// M�todo para pedir par�metros al usuario
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primera coordenada");
		x = sc.nextInt();
		System.out.println("Segunda coordenada");
		y = sc.nextInt();
		sc.close();
	}

	// M�todo toString para el formato de salida de dos par�metros
	public String toString() {
		return ("Coord(" + x + "," + y + ")");
	}

	// M�todo main
	public static void main(String[] args) {

		Punto_pla p1 = new Punto_pla();
		Punto_pla p2 = new Punto_pla(1, 2);

		p1.inicializar();

		System.out.println("El punto 1 introducido por el usuario es: " + p1);
		System.out.println("El punto 2 con los valores en el main es: " + p2);
	}
}