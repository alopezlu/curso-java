package sockets.simple;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	public static void main(String[] args) throws UnknownHostException, IOException {

		try (Socket socket = new Socket("localhost", 8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) // para escribir en el flujo,
		{
			dos.writeUTF("Hola soy un cliente del socket"); // se escribe mensaje que se envia al servidor
			dos.writeUTF("salir");
		}
	}

}
