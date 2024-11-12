package polimorfismo.figuras;


/*
 * Clase circulo que hereda de Figura
 * implementa la interfaz Dibujable
 */
public class Circulo extends Figura implements Dibujable {
	
	private double radio;

	/**
	 * @param color
	 * @param radio
	 */
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	/*
	 * Calcula el area del circulo
	 */
	@Override
	public double calcularArea() {
		
		return Math.PI*Math.pow(radio, 2);
	}
	
	void rodar()
	{
		System.out.println("El circulo "+getColor()+" esta rodando");
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("dibujando un circulo");
		
	}

	
	
	

}
