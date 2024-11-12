package clases;

public class Persona {

	 //atributes
    String nombre;
    int edad;
    char genero;
    
    //constructor de la clase
    Persona()
    {
    	this("Pedro",45, 'M');
    	System.out.println("Esto es un constructor");
    	
    }

    //constructor de la clase
    //Se utiliza el constructor para inicializar los atributos de la clase
    
    Persona(String nom, int ed, char gen){
    	//this(); //por defecto ejecuta el constructor principal y debe ir de primera        
        this.nombre = nom;
        this.edad = ed;
        this.genero = gen;
        System.out.println("Se ha creado una persona: " + nom); //mensaje de creacion en el constructor de la clase Persona
    }

    //metodos
    void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

    void jugarVideoJuegos(Persona p2){
        System.out.println(this.nombre + " juega con " + p2.nombre);
    }

    public static void main(String[] args) {

    	Persona p = new Persona("Juan", 25, 'M'); //constructor de tipo persona
        p.imprimirInformacion(); //llamada al metodo imprimirInformacion()
        
        System.out.println();
        
        Persona p2 = new Persona("Ana",30,'F'); //constructor de tipo persona
     
        p2.imprimirInformacion(); //llamada al metodo imprimirInformacion()

        p.jugarVideoJuegos(p2);
        
        System.out.println();
        
        new Persona().imprimirInformacion();

       
    }

}
