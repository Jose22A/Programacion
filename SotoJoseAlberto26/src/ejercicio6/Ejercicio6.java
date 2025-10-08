/*
 * Descripción: Manejo básico del condicional switch
 * Autor: Jose Alberto Soto Mas
 * Fecha: 08/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		String nombre, apellidos;//Declaración de variables
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce tus apellidos: ");
		apellidos = teclado.nextLine();
		
		String cicloFormativo;
		System.out.print("Introduce tu ciclo formativo: ");
		cicloFormativo = teclado.nextLine();
		
		int notaAcademica;
		System.out.print("Introduce tu nota académica: ");
		notaAcademica = teclado.nextInt();
		
		if (notaAcademica < 0 || notaAcademica > 10) {
			System.out.println("La nota académica indicada es incorrecta");
		} else {//Nota válida
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: " + cicloFormativo);
			System.out.print("Nota académica: " + notaAcademica);
			switch (notaAcademica) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println(" (Insuficiente)");
				break;
			case 5:
				System.out.println(" (Aprobado)");
				break;
			case 6:
				System.out.println(" (Bien)");
				break;
			case 7:
			case 8:
				System.out.println(" (Notable)");
				break;
			case 9:
				System.out.println(" (Sobresaliente)");
				break;
			case 10:
				System.out.println(" (Matrícula de Honor)");
				break;
			}
		}
		
	}

}
