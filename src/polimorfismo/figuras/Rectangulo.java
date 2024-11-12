package polimorfismo.figuras;



public class Rectangulo extends Figura implements Dibujable{
	private double base;
	private double altura;

	/**
	 * @param color
	 * @param base
	 * @param altura
	 */
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando un Rectangulo");
		
	}

	
	
	

}
