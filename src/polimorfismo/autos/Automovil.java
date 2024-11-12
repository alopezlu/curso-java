package polimorfismo.autos;

public abstract class Automovil {

	int llantas;
	String tipoAuto;
	int puertas;
	String color;
	int cantidadPasajeros;
	int velocidad;
	String tipoLlanta;
	String colorLlanta;

	/**
	 * @param llantas
	 * @param tipoAuto
	 * @param puertas
	 * @param color
	 * @param cantidadPasajeros
	 * @param velocidad
	 * @param tipoLlanta
	 * @param colorLlanta
	 */
	public Automovil(int llantas, String tipoAuto, int puertas, String color, int cantidadPasajeros, int velocidad,
			String tipoLlanta, String colorLlanta) {
		super();
		this.llantas = llantas;
		this.tipoAuto = tipoAuto;
		this.puertas = puertas;
		this.color = color;
		this.cantidadPasajeros = cantidadPasajeros;
		this.velocidad = velocidad;
		this.tipoLlanta = tipoLlanta;
		this.colorLlanta = colorLlanta;
	}

	/**
	 * metodo que permite saber si un vehiculo puede subir más pasajeros.
	 * 
	 * @param pasajeros
	 * @param tipoAuto
	 * @return
	 */
	public abstract boolean subirPasajeros(int pasajeros);

	public abstract boolean acelerar(int velocidad);

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	public String getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getTipoLlanta() {
		return tipoLlanta;
	}

	public void setTipoLlanta(String tipoLlanta) {
		this.tipoLlanta = tipoLlanta;
	}

	public String getColorLlanta() {
		return colorLlanta;
	}

	public void setColorLlanta(String colorLlanta) {
		this.colorLlanta = colorLlanta;
	}
}
