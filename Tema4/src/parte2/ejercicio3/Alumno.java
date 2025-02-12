package parte2.ejercicio3;

public class Alumno {

	private String nombre;
	private double media;

	public Alumno(String nombre, double media) {

		
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		
		if(media <= 10 && media >= 0) {
		this.media = media;
		}

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {

		String cad;
		cad = nombre + " " + media;
		return cad;

	}

	public boolean equals(Object obj) {

		boolean iguales = false;

		Alumno a = (Alumno) obj;

		if (this.nombre.equals(a.nombre)) {
			iguales = true;
		}
		return iguales;

	}

}
