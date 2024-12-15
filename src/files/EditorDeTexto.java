package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EditorDeTexto {

	public static final String BASE_PATH = "C:\\Users\\alope\\OneDrive\\CURSOS Udemy Programación\\JAVA";

	// se crea un flujo y se lee información de ese flujo
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Indica el nombre del archivo");
		String fileName = readMessage();
		File f = new File(BASE_PATH.concat(File.separator).concat(fileName));

		System.out.println("Empieza a escribir y escribe salir para terminar");

		String cadena = null;

		try (PrintWriter pr = new PrintWriter(f)) {

			do {
				cadena = readMessage();
				if(!"salir".equals(cadena)) {
					pr.println(cadena);	
				}
				

			} while (!"salir".equals(cadena));
		}
	}
}
