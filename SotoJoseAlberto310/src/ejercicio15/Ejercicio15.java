/*
 * Descripción: Manejo de arrays usando la clase Arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 5/11/25
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tamano, valor;
		System.out.print("Introduce el tamaño N del array: ");
		tamano = teclado.nextInt();
		System.out.print("Introduce el valor M a introducir en el array: ");
		valor = teclado.nextInt();
		
		int[] numeros;//Declaración del array
		numeros = new int[tamano];//Instanciamos array
		
		Arrays.fill(numeros, valor);
		
		for (int posicion = 0; posicion < tamano; posicion++) {
			System.out.print(numeros[posicion] + "\t");
		}
	}

}
