package threads.producersconsumers;

import java.util.Random;

public class ConsumerDev extends Thread {

	private ResourceDev resource;

	/**
	 * Constructor de la clase
	 * 
	 * @param resource
	 */
	public ConsumerDev(ResourceDev resource, String name) {
		super(name);
		this.resource = resource;

	}

	@Override
	public void run() {

		/**
		 * ciclo infinito consumidor saca el valor de la lista
		 */

		while (true) {
			try {
				int value = resource.consume();
				System.out.printf("%s consumed %d \n", getName(), value);
				Thread.sleep(new Random().nextInt(200)); // crea un tiempo de espera aleatorio de 200 mmseg

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
