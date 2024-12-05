package threads.producersconsumers;

import java.util.Random;

public class ProducerDev extends Thread {
	private ResourceDev resource;

	/**
	 * @param resource
	 */
	public ProducerDev(ResourceDev resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {

			try {
				int value = new Random().nextInt(1000);
				System.out.printf("%s produced %d \n", getName(), value);
				resource.produce(value);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
