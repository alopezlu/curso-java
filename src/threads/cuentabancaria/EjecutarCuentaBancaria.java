package threads.cuentabancaria;


import java.util.Random;

public class EjecutarCuentaBancaria {


	public static void main(String[] args) throws InterruptedException {
		
//		for(String arg: args) {
//			System.out.println("argumentos " + arg);
//		}
//		if(args.length>0){
//			System.out.println("tengo parametros"+ args.length);
//		}
		
		CuentaBancaria cuenta = new CuentaBancaria();
		
		int montoRandom = 0;
		
		
		
			montoRandom = new Random().nextInt(99000);
			System.out.println("el monto es " + montoRandom);
			TransaccionPortal transaccion1 = new TransaccionPortal(cuenta, "portal"+montoRandom, 1234, montoRandom);
			transaccion1.start();
			
			Thread.sleep(100);
			
			
			montoRandom = new Random().nextInt(99000);
			System.out.println("el monto2  es " + montoRandom);
			TransaccionPortal transaccion2 = new TransaccionPortal(cuenta, "portal"+montoRandom, 1234, montoRandom);							
			transaccion2.start();
			
			//Thread.sleep(100);
			
			montoRandom = new Random().nextInt(99000);
			System.out.println("el monto3  es " + montoRandom);
			TransaccionPortal transaccion3 = new TransaccionPortal(cuenta, "portal"+montoRandom, 1234, montoRandom);							
			transaccion3.start();
			
			montoRandom = new Random().nextInt(99000);
			System.out.println("el monto4  es " + montoRandom);
			TransaccionPortal transaccion4 = new TransaccionPortal(cuenta, "portal"+montoRandom, 567, montoRandom);
			transaccion4.start();
			
		
		
	}

}
