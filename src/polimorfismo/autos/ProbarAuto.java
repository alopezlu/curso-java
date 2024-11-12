package polimorfismo.autos;

public class ProbarAuto {

	void pruebaAuto(Automovil auto) {
		// autoSuv.subirPasajeros(auto.cantidadPasajeros);
		System.out.println(auto.acelerar(auto.getVelocidad()));
		System.out.println(auto.subirPasajeros(auto.getCantidadPasajeros()));
	}

	public static void main(String[] args) {
		ProbarAuto pa = new ProbarAuto();
		pa.pruebaAuto(new SUV(4, "SUV", 5, "blanco", 6, 90, "goodyear", "negra"));

		System.out.println("---------------------------------");

		SUV ejeS = new SUV(4, "SUV", 5, "blanco", 6, 90, "goodyear", "negra");
		ejeS.acelerar(ejeS.getVelocidad());

	}

}
