package threads.fumadores;

public class ExecuteSmokersMain {
	public static void main(String[] args) {
		
		ResourcesSmoker resources = new ResourcesSmoker();
		
		ProductorCerillo prodcerillo1 = new ProductorCerillo(resources, "cerillo-1");
		ProductorCerillo prodcerillo2 = new ProductorCerillo(resources, "cerillo-2");
		
		ProductorPapel prodPapel1 = new ProductorPapel(resources, "papel-1");
		ProductorPapel prodPapel2 = new ProductorPapel(resources, "papel-2");
		
		ProductorTabaco prodTabaco1 = new ProductorTabaco(resources,"tabaco-1");
		ProductorTabaco prodTabaco2 = new ProductorTabaco(resources,"tabaco-2");
		
		ConsumerCigarro consumidor = new ConsumerCigarro(resources, "Consumidor ***:");
		
		prodcerillo1.start();
		prodcerillo2.start();
		prodPapel1.start();
		prodPapel2.start();
		prodTabaco1.start();
		prodTabaco2.start();
		
		consumidor.start();
		
		
		
		
		
	}

}
