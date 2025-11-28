/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 25/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1, num2;
		System.out.print("Introduce un número: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextDouble();
		
		double producto = multiplica(num1, num2);
		System.out.println("El producto de los dos números es " + producto);
	}
	
	// Devuelve la multiplicación de dos números
	public static double multiplica(double a, double b) {
		 double resultado = a * b;
		 return resultado;
	}
}
