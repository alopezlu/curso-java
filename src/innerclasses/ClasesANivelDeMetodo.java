package innerclasses;

public class ClasesANivelDeMetodo {
	static void foo() {
		class ClaseInternalMetodo{
			void bar() {
				System.out.println("bar");
			}
		}
		
		ClaseInternalMetodo obj = new ClaseInternalMetodo();
		obj.bar();
	}
	
	public static void main(String[] args) {
		
		foo();
		
	}
}
