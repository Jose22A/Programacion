/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 11/12/25
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		tablaMultiplicar(num);
	}
	
	// Muestra por pantalla la tabla de multiplicar de num
	public static void tablaMultiplicar(int num) {
		 for (int contador = 1; contador <= 10; contador++) {
			 System.out.print(num*contador + " ");
		 }
	}
}
