package parte1.ejercicio4;

public class MainArticulo {

	public static void main(String[] args) {
		
		Articulo a = new Articulo();
		
		double pvp;
		
		a.cuantosQuedan =5;
		a.nombre = "Ibuprofeno";
		a.precio = 4.99;
		
		pvp = a.precio + (a.precio * a.IVA/100);
		pvp = (int)(pvp*100);
		pvp = pvp/100;
		
		System.out.println(a.nombre +" - Precio:"+a.precio+"€ - IVA:"+a.IVA+"% - PVP:"+pvp+"€");
		
		a.precio = 82.49;
		
		pvp = a.precio + (a.precio * a.IVA/100);
		pvp = (int)(pvp*100);
		pvp = pvp/100;
		
		System.out.println(a.nombre +" - Precio:"+a.precio+"€ - IVA:"+a.IVA+"% - PVP:"+pvp+"€");
		
	}

}
