/*
 * Descripción: Manejo básico de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 03/10/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		int num1, num2;//Declaración de variables
		System.out.print("Introduce un número (num1): ");
		num1 = teclado.nextInt();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce otro número (num2): ");
		num2 = teclado.nextInt();
		
		if (num1 < num2) {
			System.out.println("num1 es menor que num2");
		} else if (num1 > num2) {
			System.out.println("num1 es mayor que num2");
		} else {
			System.out.println("num1 y num2 son iguales");
		}
	}

}
