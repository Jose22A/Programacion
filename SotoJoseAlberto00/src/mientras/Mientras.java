/*
 * Descripción: Manejo del bucle while
 * Autor: Jose Alberto Soto Mas
 * Fecha: 09/10/25
 */
package mientras;

import java.util.Scanner;

public class Mientras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		System.out.print("Introduce un número (0 para terminar): ");
		numero = teclado.nextInt();
		
		int suma = numero;
		int contador = 1;
		while ((numero != 0) && (contador < 8)) {
			System.out.print("Introduce otro número: ");
			numero = teclado.nextInt();
			suma = suma + numero;
			contador = contador + 1;
		}
		System.out.println("La suma es: " + suma);
	}

}
