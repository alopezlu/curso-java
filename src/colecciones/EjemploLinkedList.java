package colecciones;

import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		
		LinkedList <String>lista = new LinkedList<>();
		lista.add("raidentrance");
		lista.add("devor");
		lista.add("kluistas");
		System.out.println(lista.peek());
		System.out.println(lista);
		
		System.out.println(lista.poll());
		System.out.println(lista);
		
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		
	}

}
