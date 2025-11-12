/*
 * Descripción: Manejo de arrays usando la clase Arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 6/11/25
 */
package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		final int TOTAL_NUM = 30;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) (Math.random()*10);
		}
		
		Arrays.sort(numeros);
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print(numeros[posicion] + " ");
		}
	}

}
