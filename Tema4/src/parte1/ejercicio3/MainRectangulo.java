package parte1.ejercicio3;

public class MainRectangulo {

	public static void main(String[] args) {
		
		Rectangulo a = new Rectangulo();
		
		Rectangulo b = new Rectangulo();
		
		int ladoX;
		
		int ladoY;
		
		a.x1 = 0;
		a.x2 = 5;
		a.y1 = 0;
		a.y2 = 5;
		
		b.x1 = 7;
		b.x2 = 2;
		b.y1 = 9;
		b.y2 = 3;
		
		ladoX = (a.x1-a.x2);
		ladoX = Math.abs(ladoX);
		
		ladoY = (a.y1-a.y2);
		ladoY = Math.abs(ladoY);
		
		System.out.println("("+a.x1+","+a.y1+")("+a.x2+","+a.y2+")");
		System.out.println("Perimetro; "+(ladoX+ladoY) +", Area:"+(ladoX*ladoY));
		
		ladoX = (b.x1-b.x2);
		ladoX = Math.abs(ladoX);
		
		ladoY = (b.y1-b.y2);
		ladoY = Math.abs(ladoY);
		
		System.out.println("("+b.x1+","+b.y1+")("+b.x2+","+b.y2+")");
		System.out.println("Perimetro; "+(ladoX+ladoY) +", Area:"+(ladoX*ladoY));
		
		
	}

}
