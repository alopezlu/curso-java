package sockets.simple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {

	public static void main(String[] args) throws IOException {

		try (ServerSocket socket = new ServerSocket(8090)) {
			System.out.println("Escuchando peticiones ...");
			Socket client = socket.accept();
			System.out.printf("Cliente %s conectado \n", client.getInetAddress().getHostName());

			DataInputStream dis = new DataInputStream(client.getInputStream());// este es un objeto para leer los datos
			// cana de comunicacion referncia hacia ese cliente y la leo en un datainput
			String mensaje = null;
			do {

				mensaje = dis.readUTF();// leer el contenido de los mensajes ,
				System.out.printf("%s dice %s \n", client.getInetAddress().getHostName(), mensaje); // imprime lo que dice
																									// el cliente
			} while (!"salir".equals(mensaje));  // si el mensaje se salir, termina

			System.out.println("Conexion cerrada");
//			socket.close();
//			client.close();
//			dis.close();
		}

	}
}
