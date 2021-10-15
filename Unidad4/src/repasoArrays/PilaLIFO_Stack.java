package repasoArrays;

import java.util.Stack;

public class PilaLIFO_Stack {
	/**
	 * Probando con la clase Stack y sus m�todos push para insertar elementos y pop para
	 * vaciar elementos
	 * 
	 */
	public PilaLIFO_Stack() {
	}

	public static void main(String[] args) {

		// La clase Stack representa a una estructura de datos que sea una pila.
		Stack<String> pila = new Stack<String>();

		// El m�todo push inserta elementos en la pila
		for (int x = 1; x <= 10; x++)
			pila.push(Integer.toString(x));

		// El m�todo empty comprueba si no quedan elementos en la pila. Es decir, si est�
		// vac�a.
		while (!pila.empty())
			System.out.println(pila.pop());
		// El m�todo pop desapila un elemento a la pila, retir�ndolo de la misma.
	}
}
