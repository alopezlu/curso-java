package files.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class EscrituraDeObjetos {
	public static void main(String[] args) throws IOException {
		Programador programadores[] = { new Programador("Andres", "JAVA"), new Programador("juan", "JAVA"),
				new Programador("Felipe", "JAVA")//,null
				};
		
		File f = new File("C:\\Users\\alope\\OneDrive\\CURSOS Udemy Programación\\JAVA\\programadores.txt");

		if (!f.exists()) {
			f.createNewFile();
		}
		
		try (FileOutputStream fos = new FileOutputStream(f); ObjectOutput oos = new ObjectOutputStream(fos)) {
			for (Programador programador : programadores) {
				oos.writeObject(programador);  //un objeto que voy a escribir en un flujo y para eso debe implementar una interfaz serializable
			}

		}

	}
}
