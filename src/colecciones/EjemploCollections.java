package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollections {
	public static void main(String[] args) {
		
		
		/**
		 * lista no fucniona sino esta ordenada ascendente
		 */
		List<String> nombres = new ArrayList<>();
		
		nombres.add("chavela");
		nombres.add("rocky");
		nombres.add("alex");
		
		Collections.sort(nombres);  //ordena la lista en orden ascendente
		int index= Collections.binarySearch(nombres, "rocky");
		
		System.out.println(nombres);
		System.out.println(nombres.get(index));
		
		System.out.println(nombres.get(1));
	}
}
