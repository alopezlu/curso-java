package threads.producersconsumers;

import java.util.LinkedList;

public class ResourceDev {
	
	private LinkedList<Integer> resources = new LinkedList<>();
	
	public synchronized int consume() throws InterruptedException {
		while(resources.size()<=0) {
			wait();
		}
		return resources.poll();  //obtiene el valor y lo remueve de la lista - Retrieves and removes the head (first element) of this list.
	}
	
	public synchronized void produce(int value) {
		resources.offer(value);//agrega un elemento en la cola de la lista
		notifyAll(); //despierta todos los hilos, les notifica que estamos listos para empezar
	}

}
