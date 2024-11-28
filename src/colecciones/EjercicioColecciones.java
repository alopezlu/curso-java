package colecciones;



class Nodo {
	private int elemento;
	private Nodo siguiente;

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo(int elemento) {
		this.elemento = elemento;
	}

	/**
	 * @param elemento
	 * @param siguiente
	 */
	public Nodo(int elemento, Nodo siguiente) {

		this.elemento = elemento;
		this.siguiente = siguiente;
	}

}

/**
 * Clase de creación de la lista simple
 */
class ListaSimple {
	private Nodo primero;
	
	@SuppressWarnings("unused")
	private int numElem;

	public ListaSimple() {
		primero = null;
		numElem = 0;
	}
	public void insertarPrimero(int elemento) {
		Nodo nuevo = new Nodo(elemento, primero);
		primero = nuevo;
		numElem++;
		
	}
	public void insertarFinal(int elemento) {
		Nodo nuevo = new Nodo(elemento, null);
		
		if(primero==null) {
			primero = nuevo;
		}
		else {
			Nodo actual = primero;
			while(actual.getSiguiente()!=null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
			numElem++;
		}
		
		System.out.println("finalll");
	}
	
	
	public void listar() {
		Nodo actual = primero;
		while(actual.getSiguiente()!=null) {
			System.out.println(actual.getElemento());
			actual= actual.getSiguiente();
		}
		System.out.println(actual.getElemento());
	}

}

public class EjercicioColecciones {

	public static void main(String[] args) {

		/**
		 * Lista simple enlazada
		 */

		System.out.println("Comenzamos");
		
		int persona1 = 6;
		int persona2 = 4;
		int persona3 = 10;
		
		///ejemplo 1
		try {
			
			ListaSimple l1 = new ListaSimple();
			
			l1.insertarPrimero(persona1);
			l1.insertarPrimero(persona2);
			l1.insertarFinal(persona3);
			
			System.out.println("Listamos desde main");
			l1.listar();
			

		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
		//ejemplo 22222
		try {
			System.out.println("------ejmplo 2 ---------");
			int dat1 = 62;
			int dat2 = 43;
			int dat3 = 104;
			int dat4 = 1055;
						
			Nodo nuevo = new Nodo(dat1);
			Nodo segundo = new Nodo(dat2);
			Nodo tres = new Nodo(dat3);
			Nodo cuatro = new Nodo(dat4);
			
			nuevo.setSiguiente(segundo);
			segundo.setSiguiente(tres);
			tres.setSiguiente(cuatro);
			
			Nodo aux = nuevo;
			
			
			
			for (int i = 0; i < 4; i++) {
				
				int aux2 = (int)aux.getElemento();
				System.err.println(aux2);
				aux = aux.getSiguiente();
				
			}
			
			
		} catch (Exception e) {
			System.err.println("ejemplo 2 "+e.toString());
		}

	}

}
