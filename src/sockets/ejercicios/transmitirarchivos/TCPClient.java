package sockets.ejercicios.transmitirarchivos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	/**
	 * permite leer mensajes desde el teclado
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String readMessage() throws IOException {
		System.out.printf("\\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		try (Socket socket = new Socket("localhost", 8090);
				//lo vamos a mandar un mensaje
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				DataInputStream dis = new DataInputStream(socket.getInputStream())) {	
			
			String mensaje = null;
			
			do {
				
				mensaje = readMessage();
				dos.writeUTF(mensaje);

			} while (!"salir".equals(mensaje));
		}

	}

}
