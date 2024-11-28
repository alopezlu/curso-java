package innerclasses;

abstract class FiguraAnonima{
	
	abstract void foo();
}

public class EjemploAnonimasAbstractas {

	public static void main(String[] args) {
		
		FiguraAnonima figura = new FiguraAnonima() {
			
			@Override
			void foo() {
				System.out.println("Foo ");
				
			}
		};
		
		figura.foo();
	}
}
