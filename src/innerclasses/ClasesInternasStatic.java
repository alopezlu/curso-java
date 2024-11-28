package innerclasses;

class ExternalStatic{
	public void foo() {
		System.out.println("fpp");
	}
	
	static class InternalStatic{
		void bar() {
			System.out.println("bar");
		}
	}
}

public class ClasesInternasStatic {
	public static void main(String[] args) {
		ExternalStatic.InternalStatic obj = new ExternalStatic.InternalStatic();
		obj.bar();
	}
	

}
