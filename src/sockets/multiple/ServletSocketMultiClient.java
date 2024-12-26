package sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * creo una clase hilo con multiples sockets
 */
class WorkerSocket extends Thread {
	private Socket client;

	/**
	 * @param client
	 */
	public WorkerSocket(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		try (DataInputStream dis = new DataInputStream(client.getInputStream())) {

			String mensaje = null;
			do {
				mensaje = dis.readUTF();

				System.out.printf("%s dice %s \n", client.getInetAddress().getHostName(), mensaje); // imprime lo que
																									// dice

			} while (!"salir".equals(mensaje));

		} catch (IOException e) {
			System.err.println("Error al conectarse con el cliente " + e.getMessage());
		}

	}

}

public class ServletSocketMultiClient {
	public static void main(String[] args) throws IOException {
		try (ServerSocket ss = new ServerSocket(8090)) {
			while(true) {
				System.out.println("Escuchando clientes");
				Socket client = ss.accept();
				System.out.println("Cliente conectado "+client.getInetAddress().getHostName());
				
				//objeto de tipo hilo , creado más arriba
				new WorkerSocket(client).start();
				
			}
		}
	}

}
