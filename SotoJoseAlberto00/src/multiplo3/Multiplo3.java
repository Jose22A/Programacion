/*
 * Descripción: Manejo del bucle for
 * Autor: Jose Alberto Soto Mas
 * Fecha: 14/10/25
 */
package multiplo3;

import java.util.Scanner;

public class Multiplo3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numInicio, numFin;
		System.out.print("Introduce el inicio: ");
		numInicio = teclado.nextInt();
		System.out.print("Introduce el fin: ");
		numFin = teclado.nextInt();
		
		System.out.println("Secuencia de números múltiplos de 3 entre " + numInicio + " y " + numFin);
		if (numInicio <= numFin) {
			for (int contador = numInicio; contador <= numFin; contador++) {
				if (contador %  3 == 0) {
					System.out.print(contador + " ");
				}
			}
		} else {
			for (int contador = numInicio; contador >= numFin; contador--) {
				if (contador %  3 == 0) {
					System.out.print(contador + " ");
				}
			}
		}
	}

}
