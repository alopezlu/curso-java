package threads.cuentabancaria;

public class TransaccionPortal extends Thread {

	private CuentaBancaria cuenta;

	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	private int usuario;
	private int monto;

	/**
	 * @param cuenta
	 */
	public TransaccionPortal(CuentaBancaria cuenta, String name, int usuario, int monto) {
		super(name);
		this.cuenta = cuenta;
		this.usuario = usuario;
		this.monto = monto;
	}

	@Override
	public void run() {
		boolean retiroExitoso=false;
		
		// validar el monto que se recibio
		boolean montoValido = getCuenta().validarMontoRecibido(getUsuario(), getMonto());
		
		System.out.println("monto valido --> "+ montoValido);
		
		if(montoValido== true) {
			
			// operaciones de retirar dinero
			
			//consulto el saldo
			int saldo = getCuenta().consultarSaldo(getUsuario());
			
			if (saldo>1000) {
				retiroExitoso = getCuenta().realizarRetiro(getUsuario(), saldo, getMonto());
				System.out.println("retiroExitoso " + retiroExitoso);
				
			}else {
				retiroExitoso = false;
				System.out.println("retiroExitoso " + retiroExitoso);
			}

			System.out.printf("El usuario %d tiene el saldo %d \n", usuario, saldo);
		}else {
			System.out.println("*********monto no valido");
		}

		

	}

}
