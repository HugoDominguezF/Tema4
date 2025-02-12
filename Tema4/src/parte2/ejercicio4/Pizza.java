package parte2.ejercicio4;

public class Pizza {

	enum Tamaño {
		FAMILIAR, MEDIANA
	}

	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, SERVIDA
	}

	private int codigo;
	private Tamaño tamaño;
	private Tipo tipo;
	private Estado estado;

	public Pizza(int codigo, Tamaño tamaño, Tipo tipo) {

		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;

	}

	public int getCodigo() {
		return codigo;
	}

	public Estado getEstado() {
		return estado;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		String cad;
		cad = codigo + ": " + tamaño + " - " + tipo + " - " + Pizza.Estado.PEDIDA;
		return cad;
	}

	public boolean equals(Object obj) {

		boolean iguales = false;

		Pizza a = (Pizza) obj;
		if (a.codigo == this.codigo) {
			iguales = true;
		}
		return iguales;
	}
}
