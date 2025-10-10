/*
 * Descripción: Manejo del bucle while
 * Autor: Jose Alberto Soto Mas
 * Fecha: 09/10/25
 */
package contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numInicio, numFin;
		System.out.print("Introduce el inicio: ");
		numInicio = teclado.nextInt();
		System.out.print("Introduce el fin: ");
		numFin = teclado.nextInt();
		
		int contador = numInicio;
		System.out.println("Secuencia de números desde " + numInicio + " hasta " + numFin);
		if (numInicio <= numFin) {
			while (contador <= numFin) {
				System.out.print(contador + " ");
				contador = contador + 1;
			}
		} else {
			while (contador >= numFin) {
				System.out.print(contador + " ");
				contador = contador - 1;
			}
		}
		
	}

}
