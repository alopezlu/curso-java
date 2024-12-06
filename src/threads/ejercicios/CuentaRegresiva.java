package threads.ejercicios;

import java.util.Random;

public class CuentaRegresiva extends Thread {

	private int numeroContar;
	private String nameThread;

	/**
	 * @param numeroContar
	 * @param name
	 */
	public CuentaRegresiva(int numeroContar, String nameThread) {
		super(nameThread);
		this.numeroContar = numeroContar;
		this.nameThread = nameThread;
	}

	public int getNumeroContar() {
		return numeroContar;
	}

	public void setNumeroContar(int numeroContar) {
		this.numeroContar = numeroContar;
	}

	public String getNameThread() {
		return nameThread;
	}

	public void setNameThread(String nameThread) {
		this.nameThread = nameThread;
	}

	/**
	 * Cuenta regresiva dando un numero de inicio Tiempo que debe esperar el hilo
	 * debe ser aleatorio Inicia 10 hilos y revisa cual termina primero
	 */

	@Override
	public void run() {
		
		int valorR = new Random().nextInt(100);
		for (int i = getNumeroContar(); i > 0; i--) {
			
			try {
				System.out.printf("Hilo %s : Contador: %d \n", getNameThread(),i);
				int valor = new Random().nextInt(valorR);
				Thread.sleep(valor);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Fin------------------------------------"+getNameThread());

	}
	

	
}
