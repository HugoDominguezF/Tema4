package parte4.ejercicio1;

public class Hora {

	private int hora;
	private int min;
	private int sec;

	public Hora(int horas, int mins, int secs) {

		while (secs > 59) {
			secs = -60;
			mins++;
		}
		this.sec = secs;
		while (mins > 59) {
			mins = -60;
			horas++;
		}
		this.min = mins;

		while (horas > 23) {
			horas = -24;
		}
		this.hora = horas;
	}

	public void setHora(int horas) {
		while (horas > 23) {
			horas -= 24;
		}
		this.hora = horas;
	}

	public void setMin(int mins) {
		while (mins > 59) {
			mins -= 60;
			setHora(getHora() + 1);
		}
		this.min = mins;
	}

	public void setSec(int secs) {
		while (secs > 59) {
			secs = -60;
			setMin(getMin() + 1);
		}
		this.sec = secs;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}
}
