package threads.fumadores;



public class ConsumerCigarro extends Thread {

	private ResourcesSmoker resource;

	/**
	 * @param resource
	 */
	public ConsumerCigarro(ResourcesSmoker resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {

		
		while (true) {

			try {

				String identificadorFumador = resource.consumerCigarrillo();
				

				System.out.printf("%s consumed %s \n", getName(), identificadorFumador);
				
				if(Thread.currentThread().isInterrupted()==true) {
					System.out.println("interrumpidoooo");
					
				}

				// Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
