package polimorfismo.figuras;


/*
 * Clase figura
 * Es abstracta porque tiene un método abstracto 
 * 
 */
public abstract class Figura {
	public String color;

	/**
	 * @param color
	 */
	public Figura(String color) {
		this.color = color;
	}
	
	

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}


	/*
	 * Es un metodo abstracto que se va a implementar en las clases herederas
	 */
	public  abstract double calcularArea();


	/*
	 * este metodo genera error porque no esta implementado en las subclases que heredan
	 * la unica forma es implementarlo o la subclase convertirla en abstract
	 */
	//private abstract double calcularPerimetro();

}
