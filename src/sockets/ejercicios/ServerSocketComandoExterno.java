package sockets.ejercicios;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketComandoExterno {

	/**
	 * metodo que ejecuta el comando que envia el usuario
	 * 
	 * @param comando
	 * @return
	 */
	public static void ejecutarComando(String comando) {
		String mensaje = null;
		if (comando.equals("iniciar")) {
			mensaje = "Iniciando -- -- - - -";
		} else if (comando.equals("reiniciar")) {
			mensaje = "Reiniciando -- -- - - -";
		} else if (comando.equals("apagar")) {
			mensaje = "Apagando -- -- - - -";
		} else {
			mensaje = "**** Comando invalido ****";
		}

		System.out.println(mensaje);

	}

	public static void main(String[] args) throws IOException {

		try (ServerSocket socket = new ServerSocket(8090)) {

			System.out.println("Servidor Corriendo proceso");
			Socket client = socket.accept();

			System.out.printf("Se conecto el cliente %s \n", client.getInetAddress());

			// leo le mensaje del cliente
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String mensaje = null;

			do {
				mensaje = dis.readUTF();// mensaje del cliente

				ejecutarComando(mensaje);

			} while (!"salir".equals(mensaje));

			System.out.println("Conexión cerrada");

		}catch (Exception e) {
			System.out.println("Error conectandose con el cliente "+e.toString());
		}
	}

}
