package exceptions;

public class EjemploTryCatch {
	
	
	
	/**
	 * como no ejecutar el bloque finally
	 * @param args
	 */
	static void test() {
		try {
			System.out.println("bloque try");
			System.exit(0);                    /////////  SIRVE PARA TERMINAR EL PROGRAMA Y NO EJECUTA EL FINALLY
			
		} finally {
System.out.println("bloque finally");
		}
	}
	

	public static void main(String[] args) {
		try {
			
			test();
			// exception 1 si coloco x =0
			int x = 0;
			int y = 10 / x;
			System.out.println("valor de la división " + y);

			/// exception 2 nomre = null
			String nombre = "otro";

			
			System.out.println(nombre.toString());

			// exception 3 de una array sin tamaño
			String arr[] = { "dass", "324523" };
			System.out.println(arr[4]);

		} catch (ArithmeticException | NullPointerException e) { //

			System.err.printf("Arithmetic y nullo Error %s \n ", e.getMessage());

			e.printStackTrace();
		}
//		catch (NullPointerException e) {
//			System.err.printf("nullpointer exception %s \n", e.getMessage());
//		}
		catch (Exception e) {
			System.err.printf("Exception %s \n", e.getMessage());
		}catch (Throwable e) {
			System.err.printf("Excepto throw ", e.getMessage());
		} 
		finally {
			System.out.println("siempre se ejecuta");

		}

	}

}
