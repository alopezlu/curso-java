package threads.fumadores;

import java.util.Random;

public class ProductorCerillo extends Thread {
	private ResourcesSmoker resourceCerillo;

	/**
	 * @param resourceCerillo
	 */
	public ProductorCerillo(ResourcesSmoker resourceCerillo, String name) {
		super(name);
		this.resourceCerillo = resourceCerillo;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int value = new Random().nextInt(200);
				
				System.out.printf("%s produced cerillo %d \n", getName(), value);
				resourceCerillo.produceCerillo(value);

				Thread.sleep(new Random().nextInt(10));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
