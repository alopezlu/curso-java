package herencia;

class Estudiante extends Persona {
	int numeroDeCuenta;

	public Estudiante(int numeroDeCuenta, String nombre, String fechaDeNacimiento) {
		// TODO Auto-generated constructor stub

		super(nombre, fechaDeNacimiento);// inicializamos el constructor por defecto de la clase padre.
		this.numeroDeCuenta = numeroDeCuenta;
	}
	
	/*
	 * voy a sobre escribir un metodo de la clase padre Persona
	 * la anotación Override me permite sobreescribir
	 */
	@Override   
	void dormir() { 
		
		System.out.println("Soy "+nombre+ " metodo dormir sobre escrito Overrride");
		
		super.dormir(); //hago llamado al metodo origintal para tambien ejecutarlo.

	}


	void aprobar() {
		System.out.println("Soy " + nombre + " aprobe el examen");
	}

	void reprobar() {
		System.out.println("Soy " + nombre + " reaprobe el examen");
	}

	float presentarExamen1(String ExamenNormal) {

		float e = 0;

		return e;
	}

	float presentarExamen(String ExamenExtraordinario) {
		float e = 0;

		return e;
	}

}
