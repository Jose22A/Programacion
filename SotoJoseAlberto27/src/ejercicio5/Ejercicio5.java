/*
 * Descripción: Manejo de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 14/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1, num2;//Declaración de variable
		System.out.print("Introduzca el valor1: ");
		num1 = teclado.nextDouble();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduzca el valor2: ");
		num2 = teclado.nextDouble();
		
		int operacion;
		System.out.println("Indique la operación que quiere realizar (Inserte un número):");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		operacion = teclado.nextInt();
		
		double resultado = 0;//Da error en el println si no lo inicializo aquí
		switch (operacion) {
			case 1:
				resultado = num1 + num2;
				break;
			case 2:
				resultado = num1 - num2;
				break;
			case 3:
				resultado = num1 * num2;
				break;
			case 4:
				resultado = num1 / num2;
				break;
		}
		System.out.println("Resultado: " + resultado);
	}

}
