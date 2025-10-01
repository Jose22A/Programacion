/*
 * Descripción: Intercambio de los valores de dos variables
 * Autor: Jose Alberto Soto Mas
 * Fecha: 01/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		int num1, num2;//Declaración de variables
		System.out.print("Introduce un número (num1): ");
		num1 = teclado.nextInt();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce otro número (num2): ");
		num2 = teclado.nextInt();
		
		int numInter = num1;//Guardamos num1 en otra variable para conservar su valor
		num1 = num2;//Asignamos num2 en num1
		num2 = numInter;//Asignamos num1 (guardada en la variable extra) en num2
		System.out.println("num1 vale " + num1 + " y num2 vale " + num2);
	}

}
