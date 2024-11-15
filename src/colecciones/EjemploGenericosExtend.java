package colecciones;

class Transporte{}
class Coche extends Transporte{}
class Deportivo extends Coche{}


class BeanGenerico2<T extends Transporte>{
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
	public BeanGenerico2(T valor) {
		super();
		this.valor = valor;
	}
	
	
	
}
public class EjemploGenericosExtend {
	public static void main(String[] args) {
		
		
		/**
		 * Bean generico pero al momento de crear el objeto
		 * defino a T como un <String> 
		 */
		
		BeanGenerico2<Transporte> bean = new BeanGenerico2<>(new Transporte());   
		
		BeanGenerico2<Deportivo> bean2= new BeanGenerico2<>(new Deportivo()); 
		
		System.out.println(bean.getValor());
		
		

		System.out.println(bean.getValor());
		
	}
}
