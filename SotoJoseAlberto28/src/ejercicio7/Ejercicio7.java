/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 15/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int respuesta = (int) Math.round(Math.random()*50);
		int num;
		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			if (num < respuesta) {
				System.out.println("El número introducido es menor que la respuesta");
			} else if (num > respuesta) {
				System.out.println("El número introducido es mayor que la respuesta");
			}
		} while (num != respuesta);
		System.out.println("Has acertado");
	}

}
