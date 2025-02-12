package parte1.ejercicio3;

public class MainRectangulo {

	public static void main(String[] args) {
		

		
		
		
		int x1;
		int y1;
		int x2;
		int y2;
		
		
		int ladoX;
		
		int ladoY;
		
		x1 = 0;
		x2 = 5;
		y1 = 0;
		y2 = 5;
		
		Rectangulo a = new Rectangulo(x1,y1,x2,y2);
		
		x1 = 7;
		x2 = 2;
		y1 = 9;
		y2 = 3;
		
		Rectangulo b = new Rectangulo(x1,y1,x2,y2);
		
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
