package parte2.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Juan Pérez", 1500.0, CuentaCorriente.Nacionalidad.ESPAÑOL);

		CuentaCorriente cuenta2 = new CuentaCorriente("12345678A", "Juan Pérez", 1500.0, CuentaCorriente.Nacionalidad.EXTRANJERO);

		int respuesta;

		double dinero;
		
		double saldo;

		
			System.out.println("1)Sacar dinero");
			System.out.println("2)Ingresar dinero");
			System.out.println("3)Informacion de la cuenta");
			System.out.println("4)Ver si hay dos cuentas iguales");
			System.out.println("5)Salir");
			respuesta = sc.nextInt();
			
			while (respuesta != 5) {
				
			switch (respuesta) {
			case 1 -> {
				System.out.println("¿Cuanto dinero quieres sacar?");
				dinero = sc.nextDouble();

				saldo = cuenta1.getSaldo();
				
				cuenta1.setSaldo(saldo - dinero);

			}
			case 2 -> {
				System.out.println("¿Cuanto dinero quieres ingresar?");
				dinero = sc.nextDouble();
				
				saldo = cuenta1.getSaldo();

				cuenta1.setSaldo(saldo + dinero);
			}
			case 3 -> {
				System.out.println(cuenta1);

			}
			case 4 -> {
				System.out.println(cuenta1.equals(cuenta2));

			}
			
			}
			
			System.out.println("\n1)Sacar dinero");
			System.out.println("2)Ingresar dinero");
			System.out.println("3)Informacion de la cuenta");
			System.out.println("4)Ver si hay dos cuentas iguales");
			System.out.println("5)Salir");
			respuesta = sc.nextInt();

		}
	}
}
