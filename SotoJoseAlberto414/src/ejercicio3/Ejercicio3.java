/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 25/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("Introduce un número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextInt();
		
		int numMenor = minimo(num1, num2);
		System.out.println("El número menor es " + numMenor);
	}
	
	// Devuelve el menor entre a y b
	public static int minimo(int a, int b) {
		 int resultado;
		 if (a < b) {
			 resultado = a;
		 } else {
			 resultado = b;
		 }
		 return resultado;
	}
}
