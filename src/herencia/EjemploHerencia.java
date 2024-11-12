package herencia;
class Animal{
	String nombre;
	
	public void respirar() {
		System.out.println("Soy un animal y estoy respirando");
	}
}

class Perro extends Animal{
	
}

class Gato extends Animal{
	
}


public class EjemploHerencia {

	public EjemploHerencia() {
		// TODO Auto-generated constructor stub
	}
	
	public static void  main (String args[]) {
		
		Animal a = new Animal();
		Perro p = new Perro();
		p.respirar();
		p.nombre="Milo";
		
		Gato g = new Gato();
		g.respirar();
		
		//a es un animal? --> si true  para eso instanceof
		System.out.println(a instanceof Animal); //a es una instancia de Animal - es un objeto.
		System.out.println(a instanceof Object); //todos tienen una super clase
		System.out.println(a instanceof Perro);
		System.out.println(a instanceof Gato);
		System.out.println(p instanceof Animal); // polimorfismo, capacidad de ser identificados con otros.
	}

}
