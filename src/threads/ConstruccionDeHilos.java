package threads;

import java.util.Iterator;

/**
 * Clase de hilo hereda de la clase Thread
 * Forma 1 de implementar un hilo
 */
class Dev4jThread extends Thread {

	public Dev4jThread(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//System.out.println("Hilo "+ getName()+" esta es una tarea concurrente "+i);
			System.out.printf("Hilo %s indice %d \n",getName(), i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}

public class ConstruccionDeHilos {
	public static void main(String[] args) {
		
		Dev4jThread hilo1 = new Dev4jThread("Hilo 1");
		Dev4jThread hilo2 = new Dev4jThread("Hilo 2");
		
		/**
		 * si ejecutamos el hilo de esta manera primero ejecuta hilo 1 y luego hilo 2
		 */
		//hilo1.run();
		//hilo2.run();
		
		/**
		 * manera correcta de ejecutar los hilos porque de esta forma los ejecuta concurrentes
		 */
		hilo1.start();
		hilo2.start();

	}

}
