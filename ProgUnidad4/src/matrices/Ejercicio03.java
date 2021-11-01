package matrices;

public class Ejercicio03 {
	/**
	 * (SALIDA VERTICAL) Realizar un programa en Java que rellene dos matrices de n�meros
	 * enteros de 3 x 4 con n�meros aleatorios entre 1 y 30. Despu�s calcular� la matriz
	 * suma (tambi�n de 3 x4) que ser� la suma elemento a elemento de las dos anteriores
	 * y por �ltimo mostrar� las tres matrices -> Matriz A + Matriz B = Matriz C
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int fil = 3;
		int col = 4;

		int[][] matriz1 = new int[fil][col];

		System.out.println("		  MATRIZ A");

		for (int i = 0; i < fil; i++)
			for (int j = 0; j < col; j++) {
				matriz1[i][j] = (int) ((Math.random() * 30) + 1);
			}
		for (int i = 0; i < fil; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print("\t" + matriz1[i][j]);
			}
			System.out.println("");
		}
		System.out.print("\n   		+");
		// System.out.println(" ");

		int[][] matriz2 = new int[fil][col];

		System.out.println(" MATRIZ B");

		for (int i = 0; i < fil; i++)
			for (int j = 0; j < col; j++) {
				matriz2[i][j] = (int) ((Math.random() * 30) + 1);
			}
		for (int i = 0; i < fil; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print("\t" + matriz2[i][j]);
			}
			System.out.println("");
		}
		System.out.print("\n  		=");
		// System.out.println(" ");

		int[][] matriz3 = new int[fil][col];

		System.out.println(" MATRIZ C");

		for (int i = 0; i < fil; i++)
			for (int j = 0; j < col; j++) {
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		for (int i = 0; i < fil; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print("\t" + matriz3[i][j]);
			}
			System.out.println("");
		}
	}
}
