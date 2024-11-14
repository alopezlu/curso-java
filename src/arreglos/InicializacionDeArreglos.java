package arreglos;

public class InicializacionDeArreglos {

	/**
	 * Metod is for print a  para imprimir arreglo
	 * @param arreglo
	 */
	static void imprimirArreglos(String arreglo[]) {
		for (String valor : arreglo) {
			System.out.println(valor);

		}
	}

	public static void main(String[] args) {
		// Explicita
		String nombres[] = new String[2];
		nombres[0] = "raindentrance";
		nombres[1] = "dev4j";
		imprimirArreglos(nombres);

		// Implicita
		String nombres2[] = { "raidentrance", "devs4j" };
		imprimirArreglos(nombres2);

		// Anonima
		String nombres3[] = new String[] { "raidentrance", "dev4j" };
		imprimirArreglos(nombres3);
		System.out.println("-----");
		imprimirArreglos(new String[] { "raidentrance", "dev4j" });
	}

}
