/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, contador = 1, numPos = 0, numNeg = 0;
		System.out.println("Introduce 100 números no nulos:");
		do {
			System.out.print("Número " + contador + ": ");
			num = teclado.nextInt();
			if (num != 0) {
				contador = contador + 1;
				if (num < 0) {
					numNeg = numNeg + 1;
				} else {
					numPos = numPos + 1;
				}
			}
		} while (contador <= 100);
		
		System.out.println("Cantidad de números positivos: " + numPos);
		System.out.println("Cantidad de números negativos: " + numNeg);
	}

}
