package tienda;

//Esta es una clase hija de la clase producto(padre)
public class Musica extends Producto {
	/**
	 * Clase Musica
	 * 
	 * @author Robert G
	 */
	//formato = tipo de m�sica que va a reproducir
	public String formato;//Soporta mp3, mp4, ogg, etc
	
	//Constructor sin par�metros
	public Musica() {
		super();
		formato="";
	}
	//Constructor con par�metros
	public Musica(String formato, String nombre, int codproduc, double precio, int nunids) {
		super(codproduc, nombre, nunids, precio);
		setFormato(formato);
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
}