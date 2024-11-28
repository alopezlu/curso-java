package innerclasses;


class Externa{
	
	void foo() {
		System.out.println("Foo");
	}
	
	class Internal{
		void bar() {
			System.out.println("bar");
		}
	}
}

public class ClasesInternasRegulaes {
	public static void main(String[] args) {
		
		//llamdo a clase externa
		Externa ex = new Externa();
		ex.foo();
		
		//llamado a la clase interna
		Externa.Internal interna = ex.new Internal();
		interna.bar();
		
		
	}
	

}
