package innerclasses;

interface Jugable{
	void jugar();  //es abstracto
}
public class EjemploInterfacesAnonimas {
	public static void main(String[] args) {
		Jugable j = new Jugable() {
			
			@Override
			public void jugar() {
				System.out.println("se debe sobreescribgir el metodo de la interfaz ya que es abstracto");
				
			}
		};
		
		j.jugar();
		
	}
}
