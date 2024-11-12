package modificadores;

class Prueba {
	
	
	@SuppressWarnings("unused") //anotación que le quita los warnings
	private String nombre;   // solo se puede acceder a private cuando es de la misma clase
	
	public Prueba() {
		
	}
	
	
}

public class EjemploPrivate {
	public static void main(String[] args) {
		//Prueba p = new Prueba();
		//p.nombre = "Alex"; //genera error porque el atributo es privado.
	}
}
