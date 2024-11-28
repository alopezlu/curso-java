package innerclasses;

class EjemploAnonima{
	void foo() {
		System.out.println("foo");
	}
	
}



public class EjmploClasesAnonimas {
	
	public static void main(String[] args) {
		
		//clase anonima
		EjemploAnonima obj = new EjemploAnonima() {
			
			@Override
			void foo() {
				System.out.println("emprimo barr");
			}
		};
		obj.foo();

		
	}

}
