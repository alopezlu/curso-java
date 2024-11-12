package herencia;

public class Persona {

	String nombre;
	String fechaDeNacimiento;
	
	

	public Persona(String nombre, String fechaDeNacimiento) {
		//super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	void dormir() {
		System.out.println("soy" + nombre + "estoy dormido");

	}

	void respirar() {
		System.out.println("Soy " + nombre + "estoy respirando desde" + fechaDeNacimiento);
	}

	void comer() {
		
		System.out.println("estoy comiendo ");
	}

}
