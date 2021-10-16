package claseAbstracta;

public class Main {
	/**
	 * Pruebas de polimorfismo y clases abstractas
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Circulo c = new Circulo(1, 2, 5);
		Cuadrado c2 = new Cuadrado(0, 0, 3);
		System.out.println("El �rea del c�rculo es: " + c.area());
		System.out.println("El �rea del cuadrado es: " + c2.area());
	}
}
