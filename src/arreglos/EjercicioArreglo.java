package arreglos;


class Mascota{
	
	public String nombre;
	public int edad;
	public void dormir() {}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @param nombre
	 * @param edad
	 */
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	};
	
	
}

class Perro extends Mascota{
	String raza;

	/**
	 * @param nombre
	 * @param edad
	 * @param raza
	 */
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
}

class Gato extends Mascota{
	String raza;
	String tipoPelo;
	/**
	 * @param nombre
	 * @param edad
	 * @param raza
	 * @param tipoPelo
	 */
	public Gato(String nombre, int edad, String raza, String tipoPelo) {
		super(nombre, edad);
		this.raza = raza;
		this.tipoPelo = tipoPelo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTipoPelo() {
		return tipoPelo;
	}
	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	
	
}



class ArreglosVarios{
	
	/**
	 * Ejemplo 1 imprimir un triangulo
	 *
	 * 	     10	
	 *    11 12 13	
	 * 10 20 30 40 50
	 */
	public void imprimirTriangulo() {
	
		
		int arreglo[][] = new int[3][];

		arreglo[0] = new int[3];
		arreglo[0][0] = 0;
		arreglo[0][1] = 0;
		arreglo[0][2] = 10;

		arreglo[1] = new int[4];
		arreglo[1][0] = 0;
		arreglo[1][1] = 11;
		arreglo[1][2] = 12;
		arreglo[1][3] = 13;

		arreglo[2] = new int[5];
		arreglo[2][0] = 10;
		arreglo[2][1] = 20;
		arreglo[2][2] = 30;
		arreglo[2][3] = 40;
		arreglo[2][4] = 50;

		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				if (arreglo[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(arreglo[i][j] + "\t");
				}
			}

			System.out.println();
		}
		System.out.println();
	}
	
	
}

/**
 * Ejercicio del curso sobre arreglos
 */
public class EjercicioArreglo {


	public static void main(String[] args) {

		/**
		 * ejercicio 1 imprimir triangulo
		 */
		ArreglosVarios a = new ArreglosVarios();
		a.imprimirTriangulo();
		

		/**
		 * ejercicios 2 aplicar herencia con mascotas en arreglos tipo 
		 * mascota y llenarlo con subtipo
		 */
		try {
			
			Perro per = new Perro("Milo",3,"teckel");
			Gato gato = new Gato("Bruna", 5, "domestico", "largo");
			
			System.out.println(per
					instanceof Mascota);
		
			Mascota m[]= new Mascota[2];
			
			m[0]= per;
			m[1] = gato;
			
			for (Mascota mascota : m) {
				System.out.println("las mascota es "+mascota.getNombre());
				
				if(mascota.equals(per)) {
					Perro pe = (Perro)mascota;
					System.out.println("la raza es " + pe.getRaza());
				}else if(mascota.equals(gato)) {
					Gato gt = (Gato)mascota;
					System.out.println("la raza es " + gt.getRaza());
				}
				System.out.println();
				
			}
			
			
			
		}
		catch (Exception e) {
			System.out.println("Error "+e.toString());
		}//fin try

	}
	
	

}
