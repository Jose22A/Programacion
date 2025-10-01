/*
 * Descripción: Manejo básico de operadores para realizar un cambio de unidades
 * Autor: Jose Alberto Soto Mas
 * Fecha: 01/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		float euroIn;//Declaración de variable
		System.out.print("Introduce una cantidad en euros: ");
		euroIn = teclado.nextFloat();//Petición y asignación de un dato introducido en el teclado
		
		float pesetaOut = euroIn * 166.386f;
		System.out.println(euroIn + " euro(s) equivale a " + pesetaOut + " pesetas");
		
		float pesetaIn;
		System.out.print("Introduce una cantidad en pesetas: ");
		pesetaIn = teclado.nextFloat();
		
		float euroOut = pesetaIn / 166.386f;
		System.out.println(pesetaIn + " peseta(s) equivale a " + euroOut + " euros");
	}

}
