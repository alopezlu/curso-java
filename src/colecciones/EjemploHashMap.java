package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHashMap {

	public static void main(String[] args) {
		
		/**
		 * si se colocan llaves duplicadas entonces se sobre escribe
		 */
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("radi", "es la cuenta del instructor");
		diccionario.put("java", "es el lenguaje");
		diccionario.put("java", "es el mejoerrrrr");
		diccionario.put(null, "representa ausencia de un obj");
		
		System.out.println(diccionario);
		System.out.println();
		
		for(String llave: diccionario.keySet()) {
			System.out.println(llave+" ="+ diccionario.get(llave));
		}
		
		System.out.println();
		
		for(Entry<String, String> entry: diccionario.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}

	}

}
