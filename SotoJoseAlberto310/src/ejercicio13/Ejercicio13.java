/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 31/10/25
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numV, numI, numN;
		System.out.print("Introduce el valor inicial V: ");
		numV = teclado.nextInt();
		System.out.print("Introduce el incremento I: ");
		numI = teclado.nextInt();
		System.out.print("Introduce el número N de valores a crear: ");
		numN = teclado.nextInt();
		
		int[] numeros;//Declaración del array
		numeros = new int[numN];//Instanciamos array
		
		int num = numV;
		for (int posicion = 0; posicion < numN; posicion++) {
			numeros[posicion] = num;
			num = num + numI;
		}
		
		for (int posicion = 0; posicion < numN; posicion++) {
			System.out.print(numeros[posicion] + "\t");
		}
	}

}
