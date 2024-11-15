package colecciones;

import java.util.TreeSet;

class Perro implements Comparable<Perro>{
	private String nombre;

	/**
	 * @param nombre
	 */
	public Perro(String nombre) {
		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}
//	@Override
//	public int compareTo(Object o ) {
//		Perro p = (Perro)o;
//		return nombre.compareTo(p.getNombre());
//	}
	
	@Override
	public int compareTo(Perro p) {
		return nombre.compareTo(p.getNombre());
	}
	
}

public class EjemploComparables {

	public static void main(String[] args) {
		/**
		 * no duplicados
		 * ordena ascendente
		 */
		TreeSet<String> set = new TreeSet<>();
		set.add("rai");
		set.add("rai");
		set.add("zii");
		set.add("alex");
		set.add("gin");
		System.out.println(set);
		
		System.out.println(new Perro("chabelita"));
		
		System.out.println();
		
		TreeSet<Perro> sep = new TreeSet<>();
		sep.add(new Perro("cha"));
		sep.add(new Perro("cha1"));
		sep.add(new Perro("sdd"));
		sep.add(new Perro("csdfasdha"));
		sep.add(new Perro("ffff"));
		
		System.out.println(sep);
		

	}

}
