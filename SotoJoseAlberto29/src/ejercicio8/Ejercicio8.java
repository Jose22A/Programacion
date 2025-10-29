/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, numPos = 0, numNeg = 0;
		boolean hayNegativos = false;
		System.out.print("Introduce un número (0 para finalizar): ");
		num = teclado.nextInt();
		while (num != 0) {
			if (num < 0) {
				numNeg = numNeg + 1;
				hayNegativos = true;
			} else {
				numPos = numPos + 1;
			}
			System.out.print("Introduce otro número (0 para finalizar): ");
			num = teclado.nextInt();
		}
		
		if (hayNegativos) {
			System.out.println("Se ha introducido algún número negativo");
		} else {
			System.out.println("No se ha introducido ningún número negativo");
		}
		System.out.println("Cantidad de números positivos: " + numPos);
		System.out.println("Cantidad de números negativos: " + numNeg);
	}

}
