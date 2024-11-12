package polimorfismo.figuras;

public class Cuadro extends Figura {
	private double lado;

	/**
	 * @param color
	 * @param lado
	 */
	public Cuadro(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		return lado * lado;
	}

}
