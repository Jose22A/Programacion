/*
 * Descripción: Manejo de cadenas de caracteres
 * Autor: Jose Alberto Soto Mas
 * Fecha: 20/11/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2;
		System.out.print("Introduce una cadena de texto: ");
		cadena1 = teclado.nextLine();
		System.out.print("Introduce otra cadena de texto: ");
		cadena2 = teclado.nextLine();
		
		if (cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Si no diferenciamos entre mayúsculas y minúsculas, las cadenas son iguales");
		} else {
			System.out.println("Si no diferenciamos entre mayúsculas y minúsculas, las cadenas son diferentes");
		}
	}

}
