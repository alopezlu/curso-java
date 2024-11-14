package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {
	public static void main(String[] args) {
		ArrayList <String>array = new ArrayList<>();
		
		array.add("raidentrance");
		array.add("dev4j");
		array.add("raidentrance");
		array.add("dev4j");
		array.add("raidentrance");
		array.add("dev4j");
		array.add("raidentrance");
		array.add("dev4j");
		array.add("raidentrance");
		array.add("dev4j");
		array.add("raidentrance");
		array.add("dev4j");
		
		
		//agregar en posición especifica  --> pero es ineficiente
		array.add(4, "prueba");
		
		
		System.out.println(array);
		System.out.println(array.size());
	}

}
