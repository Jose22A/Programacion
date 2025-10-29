/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 28/10/25
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 100;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) (1 + Math.random()*10);
		}
		
		int numN;
		System.out.print("Introduce un número N: ");
		numN = teclado.nextInt();
		
		System.out.println("Posiciones del array que contienen el número N:");
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			if (numeros[posicion] == numN) {
				System.out.print(posicion + "\t");
			}
		}
		
	}

}
