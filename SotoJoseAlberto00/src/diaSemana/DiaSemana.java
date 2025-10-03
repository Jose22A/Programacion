package diaSemana;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		String dia;//Declaración de variables
		System.out.print("Introduce el día de la semana: ");
		dia = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado
		
		byte hora;
		System.out.print("Introduce la hora de clase: ");
		hora = teclado.nextByte();
		
		boolean esProgramacion = false;
		if (dia.equalsIgnoreCase("martes") && (hora == 5 || hora == 6)) {
			esProgramacion = true;
		}
		if (dia.equalsIgnoreCase("miercoles") && (hora == 3 || hora == 4)) {
			esProgramacion = true;
		}
		if (dia.equalsIgnoreCase("jueves") && (hora == 5 || hora == 6)) {
			esProgramacion = true;
		}
		if (dia.equalsIgnoreCase("viernes") && (hora == 2 || hora == 3)) {
			esProgramacion = true;
		}
		
		if (esProgramacion) {
			System.out.println("Estás en clase de programación");
		} else {
			System.out.println("No estás en clase de programación");
		}
	}

}
