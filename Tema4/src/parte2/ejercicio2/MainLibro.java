package parte2.ejercicio2;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Libro libro1 = new Libro("Don quijote de la mancha", "Cerbantes", 156, 44, Libro.Genero.NARRATIVO);
		
		Libro libro2 = new Libro("Don quijote de la mancha", "Cerbantes", 156, 44, Libro.Genero.DIDACTICO);
		
		int respuesta;
		
		int ejemplares;
		
		int prestados;
		
		boolean hay;
		
		System.out.println("1)Prestamo");
		System.out.println("2)Devolucion");
		System.out.println("3)toString");
		System.out.println("4)equals");
		System.out.println("5)Salir");
		respuesta = sc.nextInt();
		
		while(respuesta != 5) {
			
			switch(respuesta) {
			
			case 1->{
				
				hay= libro1.getNumEjemplares()!=0 ? true : false;
				
				if(hay) {
					
					ejemplares = libro1.getNumEjemplares()-1;
					
					libro1.setNumEjemplares(ejemplares);
					
					prestados = libro1.getNumPrestados()+1;
					
					libro1.setNumPrestados(prestados);
					
					System.out.println("Se ha prestado correctamente");
					
				}else {
					System.out.println("No hay ejemplares disponibles");
				}
				
			}
			case 2->{
				hay= libro1.getNumPrestados()!=0 ? true : false;
				
				if(hay) {
					
					ejemplares = libro1.getNumEjemplares()+1;
					
					libro1.setNumEjemplares(ejemplares);
					
					prestados = libro1.getNumPrestados()-1;
					
					libro1.setNumPrestados(prestados);
					
					System.out.println("Se ha devuelto correctamente");
				}else {
					System.out.println("No hay ejemplares que se hayan prestado");
				}
			}
			case 3->{
				System.out.println(libro1);
			}
			case 4->{
				System.out.println(libro1.equals(libro2));
			}
			
			}
			
			System.out.println("\n1)Prestamo");
			System.out.println("2)Devolucion");
			System.out.println("3)toString");
			System.out.println("4)equals");
			System.out.println("5)Salir");
			respuesta = sc.nextInt();
			
		}
		

	}

}
