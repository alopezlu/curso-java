package colecciones;


class BeanGenerico<T>{
	private T valor; //T es un generico y se llama valor

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	/**
	 * @param valor
	 */
	public BeanGenerico(T valor) {
		super();
		this.valor = valor;
	}
	
	
	
}
public class EjemploGenericos {
	public static void main(String[] args) {
		
		
		/**
		 * Bean generico pero al momento de crear el objeto
		 * defino a T como un <String> 
		 */
		BeanGenerico<String> bean = new BeanGenerico<>("alexa");  //la T es generica, pero al crear objeto lo creo como String 
		
		System.out.println(bean.getValor());
		
		bean.setValor("412");
		//bean.setValor(123); // funciona si cambio el codigo como  -->  BeanGenerico bean= new BeanGenerico("alexa");

		System.out.println(bean.getValor());
		
	}
}
