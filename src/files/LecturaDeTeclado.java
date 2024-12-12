package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDeTeclado {

	//se crea un flujo y se lee información de ese flujo
	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
	
//		int value = System.in.read();  //mismo numero que se escribe no es el mismo que se imprime, porque se esta leyendo el bite no el valor
//		System.out.println(value);
		String mensaje = readMessage("Como te llamas?");
		
		System.out.println("Te llamas: "+ mensaje);
	}

}
