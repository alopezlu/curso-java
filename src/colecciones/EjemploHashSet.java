package colecciones;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
		
		/**
		 * no deja crear duplicados
		 */
		HashSet<String> nombres = new HashSet<>();
		nombres.add("rainda");
		nombres.add("rainda");
		System.out.println(nombres.add("rainda"));  //devuelve false porque no deja crear elementos duplicados
		nombres.add("dev");
		nombres.add(null);
		
		System.out.println(nombres);
		
	}

}
