package arreglos;

enum SaborPalomitas {
	CHILE("Chile",3.3f), MANTEQUILLA("Mantequilla",4.5f), QUESO("Quesito",3.2f), CARAMELO("Caramel",2.8f);

	private String nombreDeVenta;
	private float precio;

	/**
	 * @param nombreDeVenta
	 */
	private SaborPalomitas(String nombreDeVenta, float precio) {
		this.nombreDeVenta = nombreDeVenta;
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getNombreDeVenta() {
		return nombreDeVenta;
	}

	public void setNombreDeVenta(String nombreDeVenta) {
		this.nombreDeVenta = nombreDeVenta;
	}

}

public class EjemploEnumeraciones {

	public static void main(String[] args) {

		SaborPalomitas queso = SaborPalomitas.QUESO;
		System.out.println(queso.name());
		System.out.println(queso.getNombreDeVenta());
		System.out.println(queso.getPrecio());
	}

}
