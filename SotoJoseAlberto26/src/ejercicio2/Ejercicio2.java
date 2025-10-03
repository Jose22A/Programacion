/*
 * Descripción: Manejo básico de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 03/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		String nombre;//Declaración de variable
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado
		
		byte edad;
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextByte();
		
		float notaAcademica;
		System.out.print("Introduce tu nota académica: ");
		notaAcademica = teclado.nextInt();
		
		if (edad > 18 && notaAcademica > 7) {
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		} else {
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		}
	}

}
