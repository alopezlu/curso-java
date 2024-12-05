 package threads;

 class SyncCounter{
	 static int counter = 10;
	 
	 /**
	  * synchronized hace que el metodo ejecute los hilos de manera organizada
	  * 
	  * un hilo accede al metodo al mismo timpo, se evita problemas de sincronización, asignar el mismo dato a un hilo
	  */
	 public synchronized static void decrement() {
		 counter--;
		 
		 System.out.println(counter);
		 
		 try {
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
 }
 
 class Decrementor extends Thread{

	@Override
	public void run() {
		System.out.println("Decrementando Synccounter");
		SyncCounter.decrement(); //metodo estatico
	}
	 
 }
 
public class EjemploSincronizacion {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			new Decrementor().start();
		}
	}

}
