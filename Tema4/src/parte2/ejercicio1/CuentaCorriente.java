package parte2.ejercicio1;

public class CuentaCorriente {

	private String DNI;
	private String nombre;
	private double saldo;

	enum Nacionalidad {
		ESPAÑOL, EXTRANJERO
	};

	private Nacionalidad nacionalidad;

	public CuentaCorriente(String DNI, String nombre, double saldo) {

		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;

	}

	public CuentaCorriente(String DNI, double saldo) {

		this.DNI = DNI;
		this.saldo = saldo;
	}

	public CuentaCorriente(String DNI, String nombre, double saldo, Nacionalidad nacionalidad) {

		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;

	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String toString() {
		String cad;
		cad = "DNI: " + DNI + ", Nombre: " + nombre + ", tiene " + saldo + "€ y nacionalidad " + nacionalidad;
		return cad;
	}

	public boolean equals(Object objeto) {

		boolean iguales = false;

		CuentaCorriente a = (CuentaCorriente) objeto;

		if (this.nombre.equals(a.nombre) && this.DNI.equals(a.DNI)) {
			iguales = true;
		}
		return iguales;
	}

}
