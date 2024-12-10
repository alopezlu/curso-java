package threads.cuentabancaria;

import java.util.Arrays;

public class EjecutarCuentaBancaria {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		//int monto  = Integer.parseInt(args[0]);
		
		//System.out.println("el monto es " + monto);
		
		TransaccionPortal transaccion1 = new TransaccionPortal(cuenta, "portal1", 1234);
		
		TransaccionPortal transaccion2 = new TransaccionPortal(cuenta, "portal2", 567);
		
		transaccion1.start();
		transaccion2.start();

	}

}
