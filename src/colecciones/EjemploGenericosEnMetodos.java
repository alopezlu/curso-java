package colecciones;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericosEnMetodos {

	/**
	 * metodo que suma valores es STATIC porque no necesito crear un metodo para
	 * invocarlo
	 * 
	 * @param valores
	 * @return
	 */

	static double sumaValores(List<Double> valores) {
		double suma = 0.0;

		for (Double valor : valores) {
			suma += valor;
		}
		return suma;
	}

	/**
	 * otro metodo de suma de valores pero que extiende de number  WILDCATS ?
	 * USO DE WILDCATS ?
	 * @param valores
	 * @return
	 */
	static double sumaValores2(List <? extends Number> valores) {  
		double suma = 0.0;

		for (Number valor : valores) {
			suma += valor.doubleValue();
		}
		return suma;
	}

	public static void main(String[] args) {

		double sumarVAlores = sumaValores(Arrays.asList(10.45, 11.45));

		System.out.println("Suma " + sumarVAlores);

		System.out.println();

		// metodo 2
		double sumarVAlores2 = sumaValores2(Arrays.asList(10.45, 11.45,10, 10.5f, 1200l));

		System.out.println("Suma " + sumarVAlores2);
	}

}
