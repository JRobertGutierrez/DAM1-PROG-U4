package tienda;

//Esta es una clase hija de la clase producto(padre)
public class Deporte extends Producto {
	/**
	 * Clase Deporte
	 * 
	 * @author Robert G
	 */
	// ejercicio = ejercicio f�sico a realizar
	public String ejercicio;// musculaci�n, dieta, mantenimiento, artes marciales, etc.

	// Constructor sin par�metros
	public Deporte() {
		super();
		ejercicio = "";
	}

	// Constructor con par�metros
	public Deporte(String ejercicio, String nombre, int codproduc, double precio, int nunids) {
		super(codproduc, nombre, nunids, precio);
		setEjercicio(ejercicio);
	}

	public String getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
}