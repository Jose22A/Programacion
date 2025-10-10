/*
 * Descripción: Manejo del bucle do while
 * Autor: Jose Alberto Soto Mas
 * Fecha: 10/10/25
 */
package contador;

import java.util.Scanner;

public class ContadorRepetir {

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
			do {
				System.out.print(contador + " ");
				contador = contador + 1;
			} while (contador <= numFin);
		} else {
			do {
				System.out.print(contador + " ");
				contador = contador - 1;
			} while (contador >= numFin);
		}
	}

}
