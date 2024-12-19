package files.ejercicios;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class ListarDirectorio {
	
	public static final String BASE_PATH = "C:\\Users\\alope\\OneDrive\\CURSOS Udemy Programación\\JAVA";
	
	/**
	 * metodo que formatea la fecha
	 * @param fechaModificacion
	 * @return
	 * @throws ParseException
	 */
	public static String formatoFecha(long fechaModificacion) throws ParseException {
		String resultado=null;
			
		try {
			Date d = new Date(fechaModificacion);
			
					
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");    //yyyy-MM-dd
			resultado = formatter.format(d);
			
		} catch(Exception e) {
		    System.out.println("Error occurred"+ e.getMessage());
		}
				
		return resultado;
	}
	
	/**
	 * metodo que imprime en consola los datos de la carpeta
	 */
	public static void printFiless(String fechaModificacion, long tamanoArchivo, String isDirectory, String nameFile) {
		
		
		
		System.out.printf("%s %d %s %s  \n",fechaModificacion, tamanoArchivo, isDirectory, nameFile);
		
//		if(isDirectory.equals("<DIR>"))
//		{
//			System.out.printf("%s %d %s %s  \n",fechaModificacion, tamanoArchivo, isDirectory, nameFile);
//			
//		}else {
//			System.out.printf("%s %d %s %s  \n",fechaModificacion, tamanoArchivo, isDirectory, nameFile);
//		}
//		
	}
	
	
	
	public static void main(String[] args) throws ParseException {
		
		File f = new File(BASE_PATH);
		
		File[] lista = f.listFiles();
		
		//System.out.println(lista.length);
		
		
		if (lista!= null) {
			
			for (File file : lista) {
				
				String fechaFinal = formatoFecha(file.lastModified());
				
				if ( file.isFile()) {
					
					//String fecha = Long.toString(file.lastModified());
					
									
					printFiless(fechaFinal, file.length(), "          ", file.getName());								
					//System.out.printf("%s %d %s %s  \n",fechaFinal, file.length(), " ", file.getName());
				}else {
					//System.out.printf("%s  %s \n", "<DIR>", file.getName());
					printFiless(fechaFinal, file.length(), "       <DIR>", file.getName());	
					
				}
			}
		}
		
		
			
		
	}

}
