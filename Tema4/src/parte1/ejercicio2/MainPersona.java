package parte1.ejercicio2;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dni, nombre, apellidos;
		int edad;

		Persona a = null;
		Persona b = null;

		for (int i = 0; i < 2; i++) {
			System.out.println("Persona " + (i + 1) + " introduzca sus datos");

			System.out.println("DNI:");
			dni = sc.next();
			System.out.println("Nombre:");
			nombre = sc.next();
			System.out.println("Apellidos:");
			apellidos = sc.next();
			apellidos += sc.nextLine();
			System.out.println("Edad:");
			edad = sc.nextInt();

			if (i == 0) {
				a = new Persona(dni, nombre, apellidos, edad);
			} else if (i == 1) {
				b = new Persona(dni, nombre, apellidos, edad);
			}
		}

		if (a.edad >= 18) {
			System.out.println(a.nombre + " " + a.apellidos + " con DNI " + a.DNI + " es mayor de edad");
		} else {
			System.out.println(a.nombre + " " + a.apellidos + " con DNI " + a.DNI + " NO es mayor de edad");
		}

		if (b.edad >= 18) {
			System.out.println(b.nombre + " " + b.apellidos + " con DNI " + b.DNI + " es mayor de edad");
		} else {
			System.out.println(b.nombre + " " + b.apellidos + " con DNI " + b.DNI + " NO es mayor de edad");
		}

		sc.close();
	}
}
