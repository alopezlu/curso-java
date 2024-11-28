package colecciones;

import java.util.ArrayList;



class Mascota{
	
	public String nombre;
	public int edad;
	public String tipo;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
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
	 * @param tipo
	 */
	public Mascota(String nombre, int edad, String tipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
	}
	
	
	
}


class Perro1 extends Mascota{
	String raza;

	

	/**
	 * @param nombre
	 * @param edad
	 * @param tipo
	 * @param raza
	 */
	public Perro1(String nombre, int edad, String tipo, String raza) {
		super(nombre, edad, tipo);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
}

class Gato1 extends Mascota{
	String raza;
	String tipoPelo;
	
	
	
	/**
	 * @param nombre
	 * @param edad
	 * @param tipo
	 * @param raza
	 * @param tipoPelo
	 */
	public Gato1(String nombre, int edad, String tipo, String raza, String tipoPelo) {
		super(nombre, edad, tipo);
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

public class EjercicioMascotasConListas {

	public static void main(String[] args) {
		
		try {
			/**
			 * crear lista de mascotas
			 */
			
			ArrayList <Mascota> arrayMascotas = new ArrayList<>();
			
			Perro1 per = new Perro1("perro", 10,"perro","chanda");
			Gato1 gat = new Gato1("fifi",8,"gato", "domestico", "largo");
			Perro1 per2 = new Perro1("otroP",10,"perro", "perrito");
			
			arrayMascotas.add(per);
			arrayMascotas.add(gat);
			arrayMascotas.add(per2);
			
			arrayMascotas.forEach(System.out::println);
			
			System.out.println("Cantidad de mascotas "+arrayMascotas.size());
			
		for (Mascota mascota : arrayMascotas) {
			System.out.println("mascota nombre "+mascota.getNombre());
			System.out.println("Tipo " + mascota.getTipo()+"\n");
			
			String tipoMas= mascota.getTipo();
			
			if(tipoMas.equals("perro")) {
				Perro1 per1 = (Perro1)mascota;
				System.out.println("El perro "+per1.getNombre()+"\n");
			}else {
				Gato1 gats = (Gato1)mascota;
				System.out.println("El gato "+gats.getNombre()+"\n");
			}
			
			
		}
			
			
			
		}catch (Exception e) {
			System.err.println("Error en ejercicios mascotas "+e.toString());
		}

	}

}
