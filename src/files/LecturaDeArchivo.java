package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("C:\\Users\\andre\\OneDrive\\CURSOS Udemy Programación\\JAVA\\texto.txt");
		if (f.exists()) {

			try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {
				
				String cadena = null;
				do {
					 cadena = br.readLine();
					System.out.println(cadena);
				} while (cadena !=null);
			}

		} else {
			System.out.println("el archivo no existe");
		}
	}
}
