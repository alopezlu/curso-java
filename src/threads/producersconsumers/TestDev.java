package threads.producersconsumers;

public class TestDev {
	
	
	/**
	 * orquesta todo el ejemplo de productores y consumidores
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ResourceDev resource = new ResourceDev();
		
		ConsumerDev consumer1 = new ConsumerDev(resource, "Consumer 1");
		ConsumerDev consumer2 = new ConsumerDev(resource, "Consumer 1");
		ProducerDev producer1 = new ProducerDev(resource, "Producer 1");
		ProducerDev producer2 = new ProducerDev(resource, "Producer 2");
		
		producer1.start();
		producer2.start();
		//Thread.sleep(1000);
		consumer1.start();
		consumer2.start();
		
		
	}

}
