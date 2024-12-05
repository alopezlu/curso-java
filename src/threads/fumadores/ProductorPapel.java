package threads.fumadores;

import java.util.Random;

public class ProductorPapel extends Thread {

	private ResourcesSmoker resourcePapel;

	/**
	 * @param resourcePapel
	 */
	public ProductorPapel(ResourcesSmoker resourcePapel, String name) {
		super(name);
		this.resourcePapel = resourcePapel;
	}

	@Override
	public void run() {

		while (true) {
			try {
				int value = new Random().nextInt(500);

				System.out.printf("%s produced Papel %d \n", getName(), value);
				resourcePapel.producePapel(value);

				Thread.sleep(100);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
