/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 24/10/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

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
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print(numeros[posicion] + "\t");
		}
	}

}
