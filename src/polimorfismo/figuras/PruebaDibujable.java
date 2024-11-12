package polimorfismo.figuras;

public class PruebaDibujable {

	void probarDibujar(Dibujable dibujable) {
		dibujable.dibujar();
		
		
	}
	
	
	
	public static void main(String[] args) {
		PruebaDibujable p = new PruebaDibujable();
		p.probarDibujar(new Circulo("Verde", 10.5f));
		p.probarDibujar(new Rectangulo("Verde", 10.5f,10.1f));
		p.probarDibujar(new Imagen());
		
		System.out.println(new Circulo("Verde", 10.5f) instanceof Dibujable); //valida la herencia

	}

}
