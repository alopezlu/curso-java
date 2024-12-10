package threads.cuentabancaria;

public class TransaccionPortal extends Thread{
	
	private CuentaBancaria cuenta;
	private int usuario;
	
	
	
	/**
	 * @param cuenta
	 */
	public TransaccionPortal(CuentaBancaria cuenta, String name, int usuario) {
		super(name);
		this.cuenta = cuenta;
		this.usuario = usuario;
	}
	
	



	@Override
	public void run() {
	
		//validar el monto que se recibio
		
		//operaciones de retirar dinero
		int saldo = cuenta.consultarSaldo(usuario);
		
		
		
		
		
		System.out.printf("El usuario %d tiene el saldo %d \n", usuario, saldo);
		
	}





	

}
