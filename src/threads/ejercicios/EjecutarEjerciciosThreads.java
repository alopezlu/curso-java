package threads.ejercicios;

import java.util.Random;

public class EjecutarEjerciciosThreads {

	public static void main(String[] args) {
		
		
		
		/**
		 * Ejercicio 1 - Cuenta regresiva
		 */
//		CuentaRegresiva cuenta1 = new CuentaRegresiva(20, "numero1");
//		CuentaRegresiva cuenta2 = new CuentaRegresiva(17, "numero2");
//		CuentaRegresiva cuenta3 = new CuentaRegresiva(25, "numero3");
//		CuentaRegresiva cuenta4 = new CuentaRegresiva(32, "numero4");
//		cuenta1.start();
//		cuenta2.start();
//		cuenta3.start();
//		cuenta4.start();
//		
//		
//		CuentaRegresiva2 cuenta2Reg1 = new CuentaRegresiva2(10, "pato1", 1);
//		CuentaRegresiva2 cuenta2Reg2 = new CuentaRegresiva2(10, "pato2", 2);
//		CuentaRegresiva2 cuenta2Reg3 = new CuentaRegresiva2(10, "pato3", 1);
//		cuenta2Reg1.start();
//		cuenta2Reg2.start();
//		cuenta2Reg3.start();
		
		int valPriority = 0;
		
		CuentaRegresiva2 cuenta2Reg = null; 
		
		//crea los hilos de manera automatica
		for (int i = 0; i < 3; i++) {
			valPriority = new Random().nextInt(3);
			System.out.printf("Hilo %d prioridad %d \n",i,valPriority);
			cuenta2Reg = new CuentaRegresiva2(80, "automatico"+i, valPriority);
			cuenta2Reg.start();
		}

	}

}
