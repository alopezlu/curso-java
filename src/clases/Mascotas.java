/**
 * 
 */
package clases;

/**
 * 
 */
public class Mascotas {

	/**
	 * 
	 */
	String tipo;
	int edad;
	int peso;
	String nombre;
	
	public Mascotas() {
		// TODO Auto-generated constructor stub
		System.out.println("entro constructor");
	}
	
	public Mascotas(String t, int e, int p, String n)
	{
		this(n);
		this.tipo= t;
		this.edad=e;
		this.peso=p;
		//this.nombre=n;
		
	}
	
	public Mascotas(String n)
	{
		this();
		this.nombre=n;
	}
	
	public void imprimirMascota(Mascotas m) {
		
		System.out.println("la mascota es "+ m.nombre);
		System.out.println("edad es "+ m.edad);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mascotas m = new Mascotas("caballo", 5, 250, "tornillo");
		
		m.imprimirMascota(m);
		
		Mascotas m2 = new Mascotas("milo");
		
		m2.imprimirMascota(m2);
		

	}

}
