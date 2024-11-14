package arreglos;


class Taco2{
	private String sabor;
	private float precio;
	private boolean cebolla;
	private boolean cilantro;
	/**
	 * @param sabor
	 * @param precio
	 * @param cebolla
	 * @param cilantro
	 */
	public Taco2(String sabor, float precio, boolean cebolla, boolean cilantro) {

		this.sabor = sabor;
		this.precio = precio;
		this.cebolla = cebolla;
		this.cilantro = cilantro;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isCebolla() {
		return cebolla;
	}
	public void setCebolla(boolean cebolla) {
		this.cebolla = cebolla;
	}
	public boolean isCilantro() {
		return cilantro;
	}
	public void setCilantro(boolean cilantro) {
		this.cilantro = cilantro;
	}
	
	
}

public class ArreglosDeObjetosImplicito {

	public static void main(String[] args) {
		
		Taco2 orden[]= {new Taco2("Suadero", 12.0f, true , true),
				new Taco2("Pastor", 10.0f, true , true),
				new Taco2("Arrachera", 20.0f, true , true)		
		};
		
		//calculo el valor del pedido
		float cuenta=0.0f;
		
		for (Taco2 taco : orden) {
			
			System.out.println("Sabor " + taco.getSabor());
			System.out.println("Precio " + taco.getPrecio());
			System.out.println("Cebolla " + taco.isCebolla());
			System.out.println("Cilantro " + taco.isCilantro());
			
			System.out.println();
			cuenta += taco.getPrecio();
		}
		System.out.println("Monto total "+cuenta);
	}

}
