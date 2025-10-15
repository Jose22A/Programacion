/*
 * Descripción: Manejo de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 14/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, notaMedia;//Declaración de variables
		System.out.println("Introduce la nota media de 4 asignaturas:");
		System.out.print("Primera asignatura: ");
		nota1 = teclado.nextDouble();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Segunda asignatura: ");
		nota2 = teclado.nextDouble();
		System.out.print("Tercera asignatura: ");
		nota3 = teclado.nextDouble();
		System.out.print("Cuarta asignatura: ");
		nota4 = teclado.nextDouble();
		
		notaMedia = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Nota media de las asignaturas: " + notaMedia);
		System.out.println("Nota media de las asignaturas redondeada hacia arriba: " + Math.ceil(notaMedia));
		System.out.println("Nota media de las asignaturas redondeada hacia abajo: " + Math.floor(notaMedia));
		if (notaMedia > 8) {
			System.out.println("Puede acceder a estudios superiores");
		} else {
			System.out.println("La nota media obtenida no es suficiente para acceder a los estudios que deseaba");
		}
	}

}
