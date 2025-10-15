/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 15/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, contador = 0;
		double suma;
		System.out.print("Introduce un número positivo (0 para finalizar): ");
		num = teclado.nextInt();
		
		suma = num;
		while (num != 0) {
			contador = contador + 1;
			System.out.print("Introduce otro número positivo (0 para finalizar): ");
			num = teclado.nextInt();
			suma = suma + num;
		}
		System.out.println("Números mayores que 0 introducidos: " + contador);
		if (contador != 0) {
			System.out.println("Media de los números introducidos: " + suma/(double)contador);
		} else {//El primer número introducido es 0
			System.out.println("Media de los números introducidos: 0");
		}
	}

}
