package clientes_vehiculos;

import java.util.Scanner;

public class ProbarNif {
	/**
	 * @author Robert G
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("***********************************");
		System.out.println("Introduce n�mero de NIF sin letra: ");
		NIF.obtenerletra(sc.nextInt());		

		sc.close();
	}
}