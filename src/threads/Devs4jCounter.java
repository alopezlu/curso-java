package threads;

class Counter implements Runnable{
	private int valor;
	
	

	public Counter(int valor) {
		this.valor = valor;
	}



	@Override
	public void run() {
		
		System.out.printf("Estado %s \n", Thread.currentThread().getState());
		
		
		for (int i = valor; i >=0; i--) {
			System.out.printf("Valor %s de  %d \n", Thread.currentThread().getName(),i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

public class Devs4jCounter {
	public static void main(String[] args) throws InterruptedException {
		
		Thread hilo1 = new Thread(new Counter(5),"hilo 1");
		hilo1.start();
		
		Thread hilo2 = new Thread(new Counter(9), "hilo 2");
		hilo2.start();
		
		System.out.println("Fin de la creación");
		
		
		try {
			
			/**
			 * metodo join permite pausar la ejecución
			 */
			System.out.println("se lanzaron los hilos");
			hilo1.join();
			hilo2.join();
			System.out.println("fin del programa");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * CICLO DE VIDA DE LOS HILOS
		 */
		
		Thread hilo3 = new Thread(new Counter(20));
		
		System.out.printf("Estado %s \n", hilo3.getState());
		hilo3.start();
		
		System.out.printf("Estado %s \n", hilo3.getState());
		hilo3.join();
		
		
	}
}
