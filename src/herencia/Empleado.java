package herencia;

public class Empleado extends Persona {

	float sueldo;

	public Empleado(float sueldo, String nombre, String fechaDeNacimiento) {
		super(nombre, fechaDeNacimiento);
		// TODO Auto-generated constructor stub
		this.sueldo = sueldo;
	}

	void trabajar() {
		System.out.println("soy " + nombre + "trabajo");
	}

	void cobrar() {
		System.out.println("soy " + nombre + " y cobro " + sueldo);
	}

	@Override
	void comer() {
		System.out.println("si ingresa es porque voy a volver a comer");

	}
}
