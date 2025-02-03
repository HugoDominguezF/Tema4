package parte1.ejercicio1;

public class MainPunto {

	public static void main(String[] args) {
		
		Punto o = new Punto();
		
		Punto p = new Punto();
		
		Punto q = new Punto();
		
		o.x = 5;
		p.x = 10;
		q.x = -3;
		
		o.y = 0;
		p.y = 10;
		q.y = 7;
		
		System.out.println(o.x + " " + o.y);
		System.out.println(p.x + " " + p.y);
		System.out.println(q.x + " " + q.y);
		
		o.x += 1;
		p.x *= 2;
		q.x -= 3;
		
		o.y += -2;
		p.y /= 2;
		q.y -= 7;
		
		
		System.out.println("\n" +o.x + " " + o.y);
		System.out.println(p.x + " " + p.y);
		System.out.println(q.x + " " + q.y);
		
		
	}

}
