package exceptions;


/**
 * hereda errores de tipo unchecked, se deben implementar
 */
class TituloIncorrectoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4037539706838423051L;

	/**
	 * 
	 */
	public TituloIncorrectoException(String error) {
		super(error);
	}
	
}


/**
 * hereda errores de tipo checked, los maneja la manquina virtual
 */
class TituloIncorrectoException2 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4037539706838423051L;

	/**
	 * 
	 */
	public TituloIncorrectoException2(String error) {
		super(error);
	}
	
}

public class ExcepcionesPropias {
	
	
	/**
	 * si el nombre del curso no esta en mayusculas es incorrecto :  unchecked
	 * @param titulo
	 */
	static void crearCurso(String titulo) {
		if(!titulo.toUpperCase().equals(titulo)) {
		
			throw new TituloIncorrectoException("el titulo debe estar en mayusculas");
		}
		System.out.println("Titulo correcto");
		
	}
	
	
	
	/**
	 * si el nombre del curso no esta en mayusculas es incorrecto :  checked
	 * @param titulo
	 * @throws TituloIncorrectoException2 
	 */
	static void crearCurso2(String titulo) throws TituloIncorrectoException2 {   //este metodo lleva declaración Throws
		if(!titulo.toUpperCase().equals(titulo)) {
		
			throw new TituloIncorrectoException2("el titulo debe estar en mayusculas");
		}
		System.out.println("Titulo correcto");
		
	}
	
	
	
	public static void main(String[] args) {
		
		crearCurso("JAVA DESDE dd CERO");  
		
		System.out.println();
		
		try {
			crearCurso2("prueba");
		} catch (TituloIncorrectoException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
