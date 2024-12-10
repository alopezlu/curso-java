package threads.cuentabancaria;

public class EjecutarCuentaBancaria {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		TransaccionPortal transaccion1 = new TransaccionPortal(cuenta, "portal1", 1234);
		
		TransaccionPortal transaccion2 = new TransaccionPortal(cuenta, "portal2", 567);
		
		transaccion1.start();
		transaccion2.start();

	}

}
