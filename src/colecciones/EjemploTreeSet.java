package colecciones;

import java.util.TreeSet;

public class EjemploTreeSet {

	public static void main(String[] args) {
		
		/**
		 * no duplicados
		 * ordena ascendente
		 */
		TreeSet<String> set = new TreeSet<>();
		set.add("rai");
		set.add("rai");
		set.add("zii");
		set.add("alex");
		set.add("gin");
		System.out.println(set);

	}

}
