/*
 * Descripción: Manejo de arrays usando la clase Arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 12/11/25
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 1000;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) (Math.random()*100);
		}
		
		int num;
		System.out.print("Introduce un número entero: ");
		num = teclado.nextInt();
		
		int contador = 0;
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			if (numeros[posicion] == num) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("El número " + num + " no aparece en el array");
		} else {
			System.out.println("El número " + num + " aparece " + contador + " vez/veces en el array");
		}
	}

}
