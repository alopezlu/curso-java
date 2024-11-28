package exceptions;


/**
 * como esta clase implementa AutoCloseable SIEMPRE EJECUTA EL METODO :   CLOSE
 * por eso se sobre escribe el metodo porque podemos hacer el cierre de una bd.
 */

class RecursoDev4d implements AutoCloseable{

	void foo() {
		System.out.println("FOO");
	}
	
	@Override
	public void close()  {
		System.out.println("Liberando recursos");
		//se puede obligar a cerrar una bd
	}
	
}

public class EjemploTryWithResources {

	public static void main(String[] args) {
		
		try(RecursoDev4d recurso = new RecursoDev4d()){    //try con recursos, implementa interfaz autoclose, siempre ejecuta close();
			recurso.foo();
		}
		
		

	}

}
