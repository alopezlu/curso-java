package files;

import java.io.File;

public class EjemploFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\alope\\OneDrive\\CURSOS Udemy Programación\\JAVA");
		System.out.println("is file "+ f.isFile());
		System.out.println("is directory: "+f.isDirectory());
		System.out.println("name "+f.getName());
		System.out.println("can read "+f.canRead());
		
		File[] content = f.listFiles();
		for (File file : content) {
			System.out.println("-----------------");
			System.out.println("Content is file "+ file.isFile());
			System.out.println("Content is directory: "+file.isDirectory());
			System.out.println("Content name "+file.getName());
			System.out.println("Content can read "+file.canRead());
		}
	}
}
