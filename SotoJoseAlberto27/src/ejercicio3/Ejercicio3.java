/*
 * Descripción: Manejo de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 10/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nota;//Declaración de variable
		System.out.print("Introduce la nota: ");
		nota = teclado.nextInt();//Petición y asignación de un dato introducido en el teclado
		
		switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Aprobado");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("La nota introducida es incorrecta");
		}
	}

}
