package files.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CopiarArchivos {

	public static final String BASE_PATH = "C:\\Users\\alope\\OneDrive\\CURSOS Udemy Programación\\JAVA";

	// se crea un flujo y se lee información de ese flujo
	public static String readMessage(String prompt) throws IOException {
		System.out.print(prompt);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String informacion = br.readLine();

		do {
			if (informacion.isEmpty()) {
				System.out.print(prompt);
				br = new BufferedReader(isr);
				informacion = br.readLine();
			}

		} while (informacion.trim().isEmpty());

		return informacion;
	}

	public static boolean copyFile(String fromFile, String toFile, String archivo) {
		// fromFile = "C:\\Users\\alope\\Documents\\PRUEBA\\";
		// toFile= "C:\\Users\\alope\\Documents\\PRUEBA\\MOVIDOS\\";

		fromFile = fromFile.concat(archivo);
		toFile = toFile.concat(archivo);

		File origin = new File(fromFile);
		File destination = new File(toFile);
		if (origin.exists()) {
			try (InputStream in = new FileInputStream(origin); OutputStream out = new FileOutputStream(destination)) {
				// InputStream in = new FileInputStream(origin);
				// OutputStream out = new FileOutputStream(destination);
				// We use a buffer for the copy (Usamos un buffer para la copia).
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				// in.close();
				// out.close();
				return true;
			} catch (IOException ioe) {
				System.out.println("Error " + ioe.toString());
				ioe.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * mover archivo
	 * 
	 * @param fromFile
	 * @param toFile
	 * @param archivo
	 * @return
	 */
	public static boolean moveFile(String fromFile, String toFile, String archivo) {

		fromFile = fromFile.concat(archivo);
		toFile = toFile.concat(archivo);

		File origin = new File(fromFile);
		File destination = new File(toFile);
		if (origin.exists()) {
			try (InputStream in = new FileInputStream(origin); OutputStream out = new FileOutputStream(destination)) {
				// InputStream in = new FileInputStream(origin);
				// OutputStream out = new FileOutputStream(destination);
				byte[] buf = new byte[1024];
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				//in.close();
				//out.close();
				return origin.delete();
			} catch (IOException ioe) {
				ioe.printStackTrace();
				return false;
			}
		} else {
			return false;
		}
	}

	// C:\Users\alope\Documents\PRUEBA\

	// MOVER.txt

	// C:\Users\alope\Documents\PRUEBA\MOVIDOS\

	public static void main(String[] args) throws IOException {

		String opcion = readMessage("Presiona 1 para copiar archivo y 2 para mover archivo: ");

		String nombreArchivo = readMessage("Nombre del archivo: ");
		String rutaInicial = readMessage("Ruta del archivo:");
		String rutaFinal = readMessage("Ruta Final archivo: ");

		boolean resultado = false;
		String texto = "";

		if (opcion.trim().equalsIgnoreCase("1")) {
			resultado = copyFile(rutaInicial, rutaFinal, nombreArchivo);
			texto = "copy";
		} else if (opcion.trim().equalsIgnoreCase("2")) {
			resultado = moveFile(rutaInicial, rutaFinal, nombreArchivo);
			texto = "move";
		} else {
			System.out.println("Opción no valida");
		}

		System.out.println(resultado ? "Success! File " + texto + " (Éxito! Fichero " + texto + ")"
				: "Error! Failed to " + texto + " the file (Error! No se ha podido " + texto + " el fichero)");

	}
}
