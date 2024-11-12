package polimorfismo.autos;

public class SUV extends Automovil implements Llantas {

	int peso;

	public SUV(int llantas, String tipoAuto, int puertas, String color, int cantidadPasajeros, int velocidad,
			String tipoLlanta, String colorLlanta) {
		super(llantas, tipoAuto, puertas, color, cantidadPasajeros, velocidad, tipoLlanta, colorLlanta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean subirPasajeros(int pasajeros) {
		// TODO Auto-generated method stub
		if ((getTipoAuto().equals("SUV")) && (pasajeros <= 4)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean acelerar(int velocidad) {
		// TODO Auto-generated method stub
		boolean respuesta = true;

		try {

			if ((getTipoAuto().equalsIgnoreCase("SUV")) && (velocidad < 100)) {
				System.out.println("Acelerar " + getTipoAuto());
				respuesta = true;
			} else {
				System.out.println("no puede acelerar");
				respuesta = false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erro en acelerar " + e.toString());
			respuesta = false;
		}
		return respuesta;
	}

	@Override
	public void instalarLlantas(int llantas, String colorLlanta, String tipoAuto) {
		if ((llantas > 5) && (colorLlanta.equalsIgnoreCase("blanco"))) {
			System.out.println("Es un " + tipoAuto + " de solo tiene 4 llantas " + colorLlanta);
		} else {
			System.out.println("Es un " + tipoAuto + " de llanta " + colorLlanta);
		}
	}

}
