package entradaDatos;

import java.util.Scanner;

public class PeticionDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		byte edadAlumno;
		System.out.print("Dame la edad del alumno: ");
		edadAlumno = teclado.nextByte();
		System.out.println("La edad del alumno es: " + edadAlumno);
		
		teclado.nextLine(); //Despues de pedir un valor numérico y antes de pedir un String
		String nombreAlumno;
		System.out.print("Dame tu nombre: ");
		nombreAlumno = teclado.nextLine();
		System.out.println("El nombre es: " + nombreAlumno);
		
		float alturaAlumno;
		System.out.print("Dame la altura del alumno: ");
		alturaAlumno = teclado.nextFloat();
		System.out.println("La altura del alumno es: " + alturaAlumno);
	}

}
