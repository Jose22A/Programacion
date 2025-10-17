/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 17/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		for (int contador = 1; contador <= num; contador++) {
			System.out.println(contador);
		}
	}

}
