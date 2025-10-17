/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 17/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		int producto = 1;
		for (int contador = 1; contador <= num; contador++) {
			producto = producto * contador;
		}
		System.out.println("El factorial de " + num + " es " + producto);
	}

}
