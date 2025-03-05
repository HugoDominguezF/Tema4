package parte4.ejercicio1;

public class Contador {

	private int cont;
	
	public Contador(int cont) {
		this.cont=cont;
	}

	public void incrementar() {
		this.cont += 1;
	}

	public void decrementar() {
		if(cont>=1) {
		this.cont -= 1;
		}else {
			setCont(0);
		}
	}
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

}
