package files.objects;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File f = new File("C:\\Users\\alope\\OneDrive\\CURSOS Udemy Programación\\JAVA\\programadores.txt");

		try (FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)) {

			while (true) {
				try {
					Programador programador = (Programador) ois.readObject();
					if (programador != null) {
						System.out.println(programador.getNombre());
						System.out.println(programador.getLenguajeFavorito());
					}else {
						System.out.println("Null");
					}

				} catch (EOFException e) // cuando se produce esta excepción, porque se lee nulo, se para el
											// readObject();
				{
					break;
				}

			}
		}
	}
}
