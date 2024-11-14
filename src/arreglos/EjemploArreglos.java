package arreglos;

public class EjemploArreglos {

	public static void main(String[] args) {
		
		int array[] = new int[3];
		array[0] = 25;
		array[1] = 20;
		array[2] = 30;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		for(int i=0; i<array.length;i++ ) {
			System.out.println(array[i]);
		}
		
		System.out.println("-------");
		
		/*
		 * 
		 */
		int i = 0;
		while(i<array.length) {
			System.out.println(array[i]);
			i++;
		}
		System.out.println("-------");
		
		/*
		 * for each
		 */
		for(int temp:array) {
			System.out.println(temp);
		}
		
	}

}
