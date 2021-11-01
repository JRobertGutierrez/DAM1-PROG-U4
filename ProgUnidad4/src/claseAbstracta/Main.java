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

		// Ejecuta los m�todos de finalizaci�n de cualquier objeto pendiente de finalizaci�n.
		System.runFinalization();
		// Ejecuta el recolector de basura.
		System.gc(); // Garbage Collector
	}
}

/**
 * Ejecuta los m�todos de finalizaci�n de cualquier objeto pendiente de finalizaci�n.
 * Llamar a este m�todo sugiere que la m�quina virtual Java se esfuerce por ejecutar
 * los m�todos de finalizaci�n de los objetos que se han encontrado descartados pero
 * cuyos m�todos de finalizaci�n a�n no se han ejecutado. Cuando el control regresa
 * de la llamada al m�todo, Java Virtual Machine ha hecho un gran esfuerzo para
 * completar todas las finalizaciones pendientes.
 * 
 * Ejecuta el recolector de basura. Llamar al m�todo gc sugiere que Java
 * VirtualMachine se esfuerza por reciclar los objetos no utilizados para que la
 * memoria que ocupan actualmente est� disponible para su r�pida reutilizaci�n.
 * Cuando el control regresa de la llamada al m�todo, Java VirtualMachine ha hecho un
 * gran esfuerzo para recuperar espacio de todos los objetos descartados.
 * 
 */
