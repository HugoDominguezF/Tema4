package parte2.ejercicio2;

import parte2.ejercicio1.CuentaCorriente;

public class Libro {
	
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numPrestados;
	enum Genero {NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO}
	private Genero genero;
	
	
	public Libro(String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
		
	}
	
	public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numPrestados = numPrestados;
		
	}
	public Libro(String titulo, String autor, int numEjemplares, int numPrestados, Genero genero) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numPrestados = numPrestados;
		this.genero = genero;
		
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public int getNumEjemplares() {
		return numEjemplares;
	}
	
	public int getNumPrestados() {
		return numPrestados;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	
	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String toString() {
		String cad;
		
		cad="Titulo: "+titulo+", Autor: "+autor+ ", Numero de Ejemplares: "+numEjemplares+", Numero de Prestamos: "+numPrestados+", Genero: "+genero;
		
		return cad;
		
	}
	
	public boolean equals(Object obj) {
		
		boolean iguales = false;

		Libro a = (Libro) obj;

		if (this.titulo.equals(a.titulo) && this.autor.equals(a.autor)) {
			iguales = true;
		}
		return iguales;
		
	}

}
