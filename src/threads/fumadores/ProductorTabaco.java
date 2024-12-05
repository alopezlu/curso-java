package threads.fumadores;

import java.util.Random;

public class ProductorTabaco extends Thread {

	private ResourcesSmoker resourceTabaco;

	/**
	 * @param resourceTabaco
	 */
	public ProductorTabaco(ResourcesSmoker resourceTabaco, String name) {
		super(name);
		this.resourceTabaco = resourceTabaco;
	}

	/**
	 * producir tabaco
	 */
	@Override
	public void run() {
		while (true) {
			try {

				int value = new Random().nextInt(100);
				System.out.printf("%s produced tabaco %d \n", getName(), value);

				resourceTabaco.produceTabaco(value);

				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
