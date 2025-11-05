/*
 * Descripción: Manejo de arrays usando la clase Arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 5/11/25
 */
package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		final int TOTAL_NUM = 55;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		int posicion = 0;
		for (int numero = 1; numero <= 10; numero++) {
			Arrays.fill(numeros, posicion, posicion+numero, numero);
			posicion = posicion + numero;
		}
		
		for (posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print(numeros[posicion] + " ");
		}
	}

}
