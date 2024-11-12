package encapsulamiento;

class Examen {
	private float calificacion;
	private int numeroDePreguntas;
	private boolean activo;
	
	
	public int getNumeroDePreguntas() {
		return numeroDePreguntas;
	}

	public void setNumeroDePreguntas(int numeroDePreguntas) {
		this.numeroDePreguntas = numeroDePreguntas;
	}
	

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
		
	}
	public float getCalificacion() {
		return calificacion;
	}
}

public class PruebaExamen {
	public static void main(String[] args) {
		Examen e = new Examen();
		e.setCalificacion(10.0f); 
	}
}
