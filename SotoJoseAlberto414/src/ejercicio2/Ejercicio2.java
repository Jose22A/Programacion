/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 25/11/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		if (esMayorEdad(edad)) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
	
	// Devuelve verdadero si a>=18, falso en caso contrario
	public static boolean esMayorEdad(int a) {
		 boolean resultado;
		 if (a >= 18) {
			 resultado = true;
		 } else {
			 resultado = false;
		 }
		 return resultado;
	}
}
