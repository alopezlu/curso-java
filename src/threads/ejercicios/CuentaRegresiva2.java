package threads.ejercicios;

import java.util.Random;

public class CuentaRegresiva2 extends Thread {
	private int numeroContar;
	private String nameThread;
	private int numPriority;

	/**
	 * @param numeroContar
	 * @param nameThread
	 * @param numPriority
	 */
	public CuentaRegresiva2(int numeroContar, String nameThread, int numPriority) {
		super(nameThread);
		this.numeroContar = numeroContar;
		this.nameThread = nameThread;
		this.numPriority = numPriority;
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

	public int getNumPriority() {
		return numPriority;
	}

	public void setNumPriority(int numPriority) {
		this.numPriority = numPriority;
	}

	/**
	 * Cuenta regresiva dando un numero de inicio todos los hilos esperan igual
	 * tiempo se les asigna diferente prioridad 30 hilos y revisa cual termina
	 * primero
	 */
	@Override
	public void run() {
		
		asignarPrioridad();
		
		for (int i = getNumeroContar(); i > 0; i--) {

			System.out.printf("Hilo %s : Contador: %d \n", getNameThread(), i);
			
			try {
				
				Thread.sleep(100); // esperan igual tiempo

			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}
		System.out.println("FIN CUENTA 2 *******************************getNameThread:" + getNameThread());

	}
	
	/**
	 * metodo que asigna la prioridad
	 */
	public void asignarPrioridad() {
		if (getNumPriority() == 2) {
			Thread.currentThread().setPriority(MAX_PRIORITY);
			System.out.println("maxP hilo " + getNameThread());
		} else if (getNumPriority() == 1) {
			Thread.currentThread().setPriority(NORM_PRIORITY);
		} else {
			Thread.currentThread().setPriority(MIN_PRIORITY);
		}
	}

}
