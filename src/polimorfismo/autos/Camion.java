package polimorfismo.autos;

public class Camion extends Automovil {
	
	public Camion(int llantas, String tipoAuto, int puertas, String color, int cantidadPasajeros, int velocidad,
			String tipoLlanta, String colorLlanta) {
		super(llantas, tipoAuto, puertas, color, cantidadPasajeros, velocidad, tipoLlanta, colorLlanta);
		// TODO Auto-generated constructor stub
	}

	int pesoCarga;

	@Override
	public boolean subirPasajeros(int pasajeros) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acelerar(int velocidad) {
		// TODO Auto-generated method stub
		
		if((velocidad <80)&& (getPesoCarga()<100))
		{
			System.out.println("No se acelera el "+getTipoAuto());
			return false;
		}else {
			System.out.println("se acelera el "+getTipoAuto());
			return true;
		}
	}

	public int getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(int pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

}
