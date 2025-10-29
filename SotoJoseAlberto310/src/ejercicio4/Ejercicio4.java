/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 24/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 20;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		System.out.println("Introduce 20 números enteros: ");
		for (int contador = 0; contador < TOTAL_NUM; contador++) {
			System.out.print("Número " + contador + ": ");
			numeros[contador] = teclado.nextInt();
		}
		
		int sumaPos = 0, sumaNeg = 0;
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			if (numeros[posicion] < 0) {
				sumaNeg = sumaNeg + numeros[posicion];
			} else if (numeros[posicion] > 0) {
				sumaPos = sumaPos + numeros[posicion];
			}
		}
		System.out.println("Suma de los números positivos: " + sumaPos);
		System.out.println("Suma de los números negativos: " + sumaNeg);
	}

}
