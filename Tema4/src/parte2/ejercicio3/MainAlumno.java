package parte2.ejercicio3;

import java.util.Scanner;

public class MainAlumno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int respuesta;
		
		Alumno alumno1 = new Alumno("Juan Carlos", 7.5);
		
		Alumno alumno2 = new Alumno("Juan Luis", 9.5);
		
		Alumno alumno3 = new Alumno("Roberto", 4.5);
		
		Alumno alumno4 = new Alumno("Juan Luis", 5);
		
		
		System.out.println("1)ToString");
		System.out.println("2)Equals");
		System.out.println("3)Salir");
		respuesta = sc.nextInt();
		
		while(respuesta!=3) {
			
			switch(respuesta) {
			
			case 1->{
				System.out.println(alumno1);
			}
			case 2->{
				System.out.println(alumno2.equals(alumno4));
			}
			
			}
			
			System.out.println("1)ToString");
			System.out.println("2)Equals");
			System.out.println("3)Salir");
			respuesta = sc.nextInt();
		}

	}

}
