/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, contador = 1;
		boolean hayNegativos = false;
		System.out.println("Introduce 100 números no nulos:");
		do {
			System.out.print("Número " + contador + ": ");
			num = teclado.nextInt();
			if (num != 0) {
				contador = contador + 1;
				if (num < 0) {
					hayNegativos = true;
				}
			}
		} while (contador <= 100);
		
		if (hayNegativos) {
			System.out.println("Se ha introducido algún número negativo");
		} else {
			System.out.println("No se ha introducido ningún número negativo");
		}
	}

}
