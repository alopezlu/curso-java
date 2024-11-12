package herencia;

public class EjemploPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final Estudiante e = new Estudiante(10145,"Alex","19-08-1998");
	
		e.numeroDeCuenta=256;
		e.dormir(); //metodo sobre escrito de clase estudiante
		e.aprobar();
		e.aprobar();
		e.reprobar();
		
		Empleado em = new Empleado((float) 102.1456, "Juan", "15-02-2000");
		em.cobrar();
		em.trabajar();
		em.dormir(); //metodo original de clase Persona
		em.comer();

	}

	
}
