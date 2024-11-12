package statics;

class SerVivo {

	public SerVivo() {
		System.out.println("Constructor clase padre");
	}

}

class Humano extends SerVivo{
	static int numeroDeHumanos = 0; // genera una copia unica de la variable
	String nombre;

	public Humano() {
		super();
		System.out.println("Constructor");
	}

	/**
	 * @param nombre
	 */
	public Humano(String nombre) {
		System.out.println("Constructur sobrecargado");
		this.nombre = nombre;
	}

	/**
	 * bloque anonimo
	 */
	{
		System.out.println("Bloque anonimo");
		numeroDeHumanos++;
	}
	
	{
		System.out.println("Bloque 2");
	}

}

public class EjemploStaticEnVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Humano.numeroDeHumanos);
		new Humano();
		new Humano();
		new Humano("Alex");
		new Humano();

		System.out.println(Humano.numeroDeHumanos);

		Humano.numeroDeHumanos = 0;
		System.out.println(Humano.numeroDeHumanos);

	}

}
