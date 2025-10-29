/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 24/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numP, numQ;
		System.out.print("Introduce un número P: ");
		numP = teclado.nextInt();
		System.out.print("Introduce otro número Q: ");
		numQ = teclado.nextInt();
		
		int tamano;
		if (numP < numQ) {
			tamano = numQ - numP + 1;
		} else {
			tamano = numP - numQ + 1;
		}
		
		int[] numeros;//Declaración del array
		numeros = new int[tamano];//Instanciamos array
		
		int valor = numP;
		if (numP < numQ) {
			for (int contador = 0; contador < tamano; contador++) {
				numeros[contador] = valor;
				valor = valor + 1;
			}
		} else {
			for (int contador = 0; contador < tamano; contador++) {
				numeros[contador] = valor;
				valor = valor - 1;
			}
		}
		
		for (int posicion = 0; posicion < tamano; posicion++) {
			System.out.print(numeros[posicion] + "\t");
		}
	}

}
