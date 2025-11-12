/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 6/11/25
 */
package metodos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		long factorial = factorial(num);
		System.out.println("El factorial de " + num + " es " + factorial);
	}
	
	//Factorial calcula el factorial de un número. Devuelve un tipo entero
	public static long factorial(int numero) {
		long producto = 1;
		for (int contador = 1; contador <= numero; contador++) {
			producto = producto * contador;
		}
		return producto;
	}
}
