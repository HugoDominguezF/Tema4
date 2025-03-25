package pruebaexamen;

import java.util.Objects;

public class Empleado {
	
	String dni="0000000X";
	String nombre="Sin nombre";
	int sueldoBase=0;
	int horasExtra=0;
	static int importe=100;
	
	public Empleado(String dni, String nombre, int sueldoBase, int horasExtra) {
		if(dni != null && !dni.isBlank()) {
		this.dni = dni;
		}
		if(nombre != null && !nombre.isBlank()) {
		this.nombre = nombre;
		}
		if(sueldoBase>=0) {
		this.sueldoBase = sueldoBase;
		}
		if(horasExtra>=0) {
		this.horasExtra = horasExtra;
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	
	public double calcularComplemento() {
		return horasExtra*importe;
	}
	public double sueldoBruto() {
		return sueldoBase+calcularComplemento();
	}
	
	public String toString() {
		return dni+" "+nombre+"\nHoras Extras: "+horasExtra+"\nSuledo bruto: "+sueldoBruto();
	}

}
