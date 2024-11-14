package arreglos;

public class EjemploArreglosUnidimensionales {

	public static void main(String[] args) {
		
		int arreglo[] = new int[3];
		arreglo[0] = 25;
		arreglo[1] = 20;
		arreglo[2] = 30;
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
		System.out.println(arreglo[2]);
		
		for(int i=0; i<arreglo.length;i++ ) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("-------");
		
		/*
		 * 
		 */
		int i = 0;
		while(i<arreglo.length) {
			System.out.println(arreglo[i]);
			i++;
		}
		System.out.println("-------");
		
		/*
		 * for each
		 */
		for(int temp:arreglo) {
			System.out.println(temp);
		}
		
	}

}
