package threads.cuentabancaria;

import java.util.Arrays;
import java.util.Random;

public class EjecutarCuentaBancaria {
	private static int consec=0;

	public static void main(String[] args) {
		
//		for(String arg: args) {
//			System.out.println("argumentos " + arg);
//		}
//		if(args.length>0){
//			System.out.println("tengo parametros"+ args.length);
//		}
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		int montoRandom = 0;
		boolean bandera =  true;
		
		
		do {
			montoRandom = new Random().nextInt(99000);
			System.out.println("el monto es " + montoRandom);
			TransaccionPortal transaccion1 = new TransaccionPortal(cuenta, "portal"+consec, 1234, montoRandom);
			consec++;
			//TransaccionPortal transaccion2 = new TransaccionPortal(cuenta, "portal"+consec, 567, montoRandom);
			TransaccionPortal transaccion2 = new TransaccionPortal(cuenta, "portal"+consec, 1234, montoRandom);
			consec++;
			
			transaccion1.start();
			transaccion2.start();
			
			if(consec==4) {
				bandera=false;
			}
		}while(bandera == true);
		
		
		

	}

}
