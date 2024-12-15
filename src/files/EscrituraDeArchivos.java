package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDeArchivos {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\andre\\OneDrive\\CURSOS Udemy Programación\\JAVA\\texto.txt");
		
		/**
		 * try con recursos
		 * ry-with-resources y sus métodos close() serán llamados después del bloque finally
		 *como si su código estuviese de forma explícita.
		 */
		try(PrintWriter pw = new PrintWriter(f)) { 
			pw.println("Hola ");
			pw.println("siganme en");
			pw.println("@raintrance");
		}
	}
}
