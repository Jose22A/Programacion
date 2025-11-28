/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 28/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		switch (dimeSigno(num)) {
			case -1:
				System.out.println("El número es negativo");
				break;
			case 0:
				System.out.println("El número es cero");
				break;
			case 1:
				System.out.println("El número es positivo");
				break;
		}
	}
	
	// Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
	public static int dimeSigno(int a) {
		 int resultado;
		 if (a < 0) {
			 resultado = -1;
		 } else if (a > 0) {
			 resultado = 1;
		 } else {
			 resultado = 0;
		 }
		 return resultado;
	}
}
