package parte2.ejercicio4;

import java.util.Scanner;

public class MainPizza {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int respuesta;
		
		Pizza pizza1 = new Pizza(102973, Pizza.Tamaño.MEDIANA, Pizza.Tipo.FUNGHI);

		Pizza pizza2 = new Pizza(102974, Pizza.Tamaño.FAMILIAR, Pizza.Tipo.CUATROQUESOS);
		
		System.out.println("1)ToString");
		System.out.println("2)Equals");
		System.out.println("3)Salir");
		respuesta = sc.nextInt();
		
		while(respuesta!=3) {
			
			switch(respuesta) {
			
			case 1->{
				System.out.println(pizza1);
			}
			case 2->{
				System.out.println(pizza1.equals(pizza2));
			}
			
			}
			
			System.out.println("\n1)ToString");
			System.out.println("2)Equals");
			System.out.println("3)Salir");
			respuesta = sc.nextInt();
		}

	}

}

