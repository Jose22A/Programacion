/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 28/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 100;
		
		double[] numeros;//Declaración del array
		numeros = new double[TOTAL_NUM];//Instanciamos array
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = Math.random();
		}
		
		double numR;
		System.out.print("Introduce un número R: ");
		numR = teclado.nextDouble();
		
		int contMayorR = 0;
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			if (numeros[posicion] >= numR) {
				contMayorR = contMayorR + 1;
			}
		}
		System.out.println("Cantidad de números mayores o iguales a R: " + contMayorR);
	}

}
