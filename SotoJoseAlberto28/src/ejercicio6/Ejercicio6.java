/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 15/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número (negativo para finalizar): ");
		num = teclado.nextInt();
		
		while (num >= 0){
			System.out.println("El cuadrado de " + num + " es " + num*num);
			System.out.print("Introduce otro número (negativo para finalizar): ");
			num = teclado.nextInt();
		}
		
	}

}
