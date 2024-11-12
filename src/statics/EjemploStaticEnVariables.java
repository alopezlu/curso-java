package statics;

class Humano{
	static int numeroDeHumanos=0;  //genera una copia unica de la variable
	
	public Humano() {
		numeroDeHumanos++;
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
		new Humano();
		
		System.out.println(Humano.numeroDeHumanos);
		
		Humano.numeroDeHumanos=0;
		System.out.println(Humano.numeroDeHumanos);
		
	}

}
