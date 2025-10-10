/*
 * Descripción: Manejo del bucle do while
 * Autor: Jose Alberto Soto Mas
 * Fecha: 10/10/25
 */
package repetir;

import java.util.Scanner;

public class Repetir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, suma = 0;
		int contador = 0;
		
		do {
			System.out.print("Introduce un número (0 para terminar): ");
			numero = teclado.nextInt();
			suma = suma + numero;
			contador = contador + 1;
		} while ((numero != 0) && (contador < 8));
		System.out.println("La suma es: " + suma);
	}

}
