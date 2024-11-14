package colecciones;

import java.util.PriorityQueue;

public class EjemploPriorityQueue {

	public static void main(String[] args) {
		
		/**
		 * //offer y add hacen lo mismo
		 * ordena de manera inicial por una prioridad
		 */
		PriorityQueue<Integer>queue = new PriorityQueue<>();
		queue.add(1000);
		queue.add(200);
		queue.add(5);
		queue.add(100);
		queue.offer(50);
		System.out.println(queue);
		
		//offer y add hacen lo mismo
		

	}

}
