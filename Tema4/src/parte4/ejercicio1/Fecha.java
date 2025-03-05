package parte4.ejercicio1;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha(int año, int mes, int dia) {
			
		
		this.dia = dia;
		this.año = año;
		this.mes = mes;
		
		if (!fechaCorrecta()) {
			
			setDia(1);
			setAño(1970);
			setMes(1);
			
		}

	}

	public boolean esBisiesto(int año) {

		boolean bisiesto;

		if (año % 4 == 0) {
			bisiesto = true;
		} else {
			bisiesto = false;
		}

		return bisiesto;
	}

	public boolean fechaCorrecta() {

		boolean correcta = true;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (this.dia > 31 || this.dia <= 0) {
				correcta = false;
			}
		}
		case 4, 6, 9, 11 -> {
			if (this.dia > 30 || this.dia <= 0) {
				correcta = false;
			}
		}
		case 2 -> {
			if ((!esBisiesto(this.año) && this.dia > 28) || (esBisiesto(this.año) && this.dia > 29) || this.dia <= 0) {
				correcta = false;
			}
		}
		}

		return correcta;
	}

	public void diaSiguiente() {

		this.dia += 1;

		if (!fechaCorrecta()) {
			setDia(1);
			this.mes += 1;
			if (this.mes >= 12) {
				this.mes = 1;
				this.año++;
			}
		}

	}

	public String toString() {

		String frase;

		if (this.dia < 10 && this.mes >= 10) {
			frase = "0" + dia + "-" + mes + "-" + año;
		} else if (this.dia < 10 && this.mes < 10) {
			frase = "0" + dia + "-" + "0" + mes + "-" + año;
		} else if (this.dia >= 10 && this.mes < 10) {
			frase = dia + "-" + "0" + mes + "-" + año;
		} else {
			frase = dia + "-" + mes + "-" + año;
		}

		return frase;

	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

}
