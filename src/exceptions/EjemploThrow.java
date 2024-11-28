package exceptions;

public class EjemploThrow {

	/**
	 * Manejar excepciones será una de dos cosas
	 * - Atrapar la excepción con try catch
	 * - Propagar a quien invocó el método
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception
	 */
	static double dividir2(int a, int b) throws Exception  {
		if(b!=0) {
			return a/b;	
		}else {
			
			//forma 2.  de propagarlo
			
			throw new Exception("No se puede dividir entre 0");
			
		}
		
	}
	
	/**
	 * metodo que lanza un error
	 * @param a
	 * @param b
	 * @return
	 */
	static double dividir(int a, int b) {
		if(b!=0) {
			return a/b;	
		}else {
			throw new IllegalArgumentException("No se puede dividir entre 0");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		/**
		 * este metodo hace la propagación
		 */
		double resultado2 = 0;
		try {
			resultado2 = dividir2(10, 0);
			System.out.println("Resultado " + resultado2);
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.err.println("Error "+e.getMessage());  //imprime el mensaje que se lanzo en el metodo divir 2
		}
		
		System.out.println();
		/**
		 * 
		 */
		double resultado = dividir(10, 0);
		System.out.println("Resultado " + resultado);
		
	}

}
