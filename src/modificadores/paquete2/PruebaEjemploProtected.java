package modificadores.paquete2;

import modificadores.paquete1.EjemploProtected;

public class PruebaEjemploProtected extends EjemploProtected{
	void bar() {
		foo();  // metodo protegido de clase EjemploProtected, se puede alcanzar por herencia
	}
	public static void main(String[] args) {
		PruebaEjemploProtected e = new PruebaEjemploProtected();
		e.bar();
	}

}
