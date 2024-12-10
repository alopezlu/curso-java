package threads.cuentabancaria;

import java.util.HashMap;

public class CuentaBancaria {
	
	
	private HashMap<Integer, Integer> cuentasUsuario = new HashMap<>();
	
	
	
	/**
	 * @param cuentasUsuario
	 */
	public CuentaBancaria() {
		llenarCuentas();
	}

	public int consultarSaldo(int usuario) {
		
		int saldo = cuentasUsuario.get(usuario);
	
		return saldo;
	}
	
	public String validarMontoRecibido(int usuario, int monto) {
		String mensaje=null;
		
		return mensaje;
	}
	
	public void realizarRetiro(int usuario,int saldo, int montoRetiro) {
		//consultar saldo y validar si se puede hacer el retiro.
	}
	
	public void restarMontoAlSaldo(int usuario,int montoRetiro) {
		
	}
	
	public void llenarCuentas() {
		
		cuentasUsuario.put(1234, 500000);
		cuentasUsuario.put(567, 200000);
		cuentasUsuario.put(2345, 100000);
		cuentasUsuario.put(789, 700000);
	}
	
	

}
