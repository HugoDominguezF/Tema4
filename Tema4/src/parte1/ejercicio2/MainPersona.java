package parte1.ejercicio2;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona a = new Persona();
		
		Persona b = new Persona();
		
		for(int i=0;i<2;i++) {
			
			System.out.println("Persona " + (i+1) +" introduzca sus datos");
			
			switch(i) {
			
			case 0->{
				System.out.println("DNI:");
				a.DNI = sc.next();
				System.out.println("Nombre:");
				a.nombre = sc.next();
				System.out.println("Apellidos:");
				a.apellidos = sc.next();
				a.apellidos += sc.nextLine();
				System.out.println("Edad:");
				a.edad = sc.nextInt();
				
			}
			case 1->{
				System.out.println("DNI:");
				b.DNI = sc.next();
				System.out.println("Nombre:");
				b.nombre = sc.next();
				System.out.println("Apellidos:");
				a.apellidos = sc.next();
				b.apellidos += sc.nextLine();
				System.out.println("Edad:");
				b.edad = sc.nextInt();
			}
			}
			
		}
		if(a.edad >= 18) {
		System.out.println(a.nombre + " " + a.apellidos + " con DNI " + a.DNI +" es mayor de edad");
		}else {
		System.out.println(a.nombre + " " + a.apellidos + " con DNI " + a.DNI +" NO es mayor de edad");
		}
		
		if(b.edad >= 18) {
		System.out.println(b.nombre + " " + b.apellidos + " con DNI " + b.DNI +" es mayor de edad");
		}else {
		System.out.println(b.nombre + " " + b.apellidos + " con DNI " + b.DNI +" NO es mayor de edad");
		}
	}

}
