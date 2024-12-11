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

	/**
	 * metodo que valida que el monto a retirar sea valido
	 * 
	 * @param usuario
	 * @param monto
	 * @return
	 */
	public boolean validarMontoRecibido(int usuario, int monto) {
		boolean mensaje = false;
		if (monto >= 1000 || monto <= 80000) {
			mensaje = true;
		}

		return mensaje;
	}

	public boolean realizarRetiro(int usuario, int saldo, int montoRetiro) {
		// consultar saldo y validar si se puede hacer el retiro.

		boolean resultado = false;
		boolean actualizarSaldo = false;

		int saldoActualizado = 0;

		if ((saldo - montoRetiro) > 0) {
			saldoActualizado = saldo - montoRetiro;

			System.out.println("saldo-montoRetiro : " + saldoActualizado);
			
			resultado= actualizarSaldo(usuario, saldoActualizado);
			
		}

		return resultado;
	}

	public boolean actualizarSaldo(int usuario, int saldoActualizado) {
		boolean resultado = false;
		cuentasUsuario.put(usuario, saldoActualizado);
		
		return resultado;    

	}

	public void llenarCuentas() {

		cuentasUsuario.put(1234, 500000);
		cuentasUsuario.put(567, 200000);
		cuentasUsuario.put(2345, 1000000);
		cuentasUsuario.put(789, 700000);
	}

}
