package ejercicios_14_18_enero_2019;

public class cancion {
	/**
	 * Canci�n (en una emisora de radio)
	 * 
	 * @author Robert G
	 */
	private String titulo, autor, genero;
	private float duracion;

	// Constructor sin valores
	public cancion(String t, String a, String g, float d) {

		titulo = t;
		autor = a;
		genero = g;
		duracion = d;
	}

	// M�todo toString
	public String toString() {
		return "Canci�n [T�tulo= " + titulo + ", Autor= " + autor + ",\n G�nero= " + genero + ", Duraci�n= " + duracion
				+ " min.]";
	}

	// M�todo main
	public static void main(String[] args) {

		cancion c = new cancion("Fear of the dark", "Iron Maiden", "Metal", 7.17f);

		System.out.println(c.toString());

	}
}