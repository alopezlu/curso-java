package threads.fumadores;

import java.util.HashMap;
import java.util.LinkedList;

public class ResourcesSmoker {

	private LinkedList<Integer> resourcesPaper = new LinkedList<>();

	private LinkedList<Integer> resourcesTabaco = new LinkedList<>();

	private LinkedList<Integer> resourcesCerillo = new LinkedList<>();
	
	static int terminarHilos = 0;

	/**
	 * metodo que llena las listas de elemento cerillo
	 * 
	 * @param cerillo
	 */
	public synchronized void produceCerillo(int cerillo) {

		resourcesCerillo.offer(cerillo);
		notifyAll();
	}
	
	public synchronized void produceTabaco(int tabaco) {

		resourcesTabaco.offer(tabaco);
		notifyAll();
	}
	
	public synchronized void producePapel(int paper) {

		resourcesPaper.offer(paper);
		notifyAll();
	}
	/**
	 * metodo que consume el cerillo, obtiene el valor primero y lo quita
	 * @return HashMap<Integer, String>    --> integer= cantidad de fumadores  , string: datos de fumador, papel, cerillo, tabaco
	 * @throws InterruptedException
	 */
	public synchronized String consumerCigarrillo() throws InterruptedException {
		
		
		while ((resourcesCerillo.size() <= 0) ||(resourcesPaper.size()<=0)||(resourcesTabaco.size()<=0)){
			wait();
		}
		
		String fumador = "Cerillo: " + resourcesCerillo.poll() + "- Papel: " + resourcesPaper.poll() + "- Tabaco: "+resourcesTabaco.poll();
		
				
		return fumador;
	}

}
