/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 24/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tamano, valor;
		System.out.print("Introduce el tamaño N del array: ");
		tamano = teclado.nextInt();
		System.out.print("Introduce el valor M a introducir en el array: ");
		valor = teclado.nextInt();
		
		int[] numeros;//Declaración del array
		numeros = new int[tamano];//Instanciamos array
		
		for (int contador = 0; contador < tamano; contador++) {
			numeros[contador] = valor;
		}
		
		for (int posicion = 0; posicion < tamano; posicion++) {
			System.out.print(numeros[posicion] + "\t");
		}
	}

}
