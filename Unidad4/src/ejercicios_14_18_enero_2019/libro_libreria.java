package ejercicios_14_18_enero_2019;

public class libro_libreria {
	/**
	 * Libro en una librer�a
	 * 
	 * @author Robert G
	 */
	private String titulo;
	private String autor;
	private int edicion;
	private int npaginas;
	private String editorial;
	private String ISBN;
	private float precio;
	
	//Constructor sin valores
	public libro_libreria(String t, String a, int edic, int n, String edit, String I, float p) {
		
		titulo=t;
		autor=a;
		edicion=edic;
		npaginas=n;
		editorial=edit;
		ISBN=I;
		precio=p;
			
	}
	
	//M�todo toString
	public String toString() {
		return "Libro - Biblioteca Nacional [Titulo= "+titulo+",\n Autor= "+autor+", Edici�n= "+edicion+
				", N� P�ginas= "+npaginas+",\n Editorial= "+editorial+", ISBN= "+ISBN+
				", Precio= "+precio+"�]";
	}
	//M�todo main
	public static void main(String[] args) {
				
		libro_libreria l1=new libro_libreria("La casa de Bernarda Alba", "Federico Garc�a Lorca",
				2005, 288, "Catedra", "9788437622453", 8.85f);
		
		System.out.print(l1.toString());
		}
	}