package files.objects;

import java.io.Serializable;

/**
 * Interfaz necesaria para poder Escribir un OBJETO en un FLUJO, DEBE implementar Serializable
 * a la interfaz le voy a poner que me genere un identificador
 */
public class Programador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;  // para que me represente la clase
	
	private String nombre;
	private String lenguajeFavorito;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLenguajeFavorito() {
		return lenguajeFavorito;
	}
	public void setLenguajeFavorito(String lenguajeFavorito) {
		this.lenguajeFavorito = lenguajeFavorito;
	}
	/**
	 * @param nombre
	 * @param lenguajeFavorito
	 */
	public Programador(String nombre, String lenguajeFavorito) {
		super();
		this.nombre = nombre;
		this.lenguajeFavorito = lenguajeFavorito;
	}
	/**
	 * 
	 */
	public Programador() {		
	}
	
	
}
