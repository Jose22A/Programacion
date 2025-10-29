/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 24/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 10;
		
		double[] numeros;//Declaración del array
		numeros = new double[TOTAL_NUM];//Instanciamos array
		
		System.out.println("Introduce diez números reales: ");
		for (int contador = 0; contador < TOTAL_NUM; contador++) {
			System.out.print("Número " + contador + ": ");
			numeros[contador] = teclado.nextDouble();
		}
		
		double numMax, numMin;
		numMax = numeros[0];
		numMin = numeros[0];
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			if (numeros[posicion] > numMax) {
				numMax = numeros[posicion];
			}
			if (numeros[posicion] < numMin) {
				numMin = numeros[posicion];
			}
		}
		System.out.println("Máximo de los números introducidos: " + numMax);
		System.out.println("Mínimo de los números introducidos: " + numMin);
	}

}
