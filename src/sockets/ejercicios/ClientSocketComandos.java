package sockets.ejercicios;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketComandos {
	
	
	/**
	 * permite leer mensajes desde el teclado
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String readMessage() throws IOException {
		System.out.println("->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		try (Socket socket = new Socket("localhost", 8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
			
			String mensajeCliente = null;
			do {
				mensajeCliente = readMessage();
				dos.writeUTF(mensajeCliente);
				
			} while (!"salir".equals(mensajeCliente));
		
			
			
		}
	}

}
