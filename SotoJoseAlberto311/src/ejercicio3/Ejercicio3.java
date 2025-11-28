/*
 * Descripción: Manejo de arrays bidimensionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 13/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numFilas, numColumnas;
		System.out.println("Introduce el tamaño de la tabla:");
		System.out.print("Filas: ");
		numFilas = teclado.nextInt();
		System.out.print("Columnas: ");
		numColumnas = teclado.nextInt();
		
		int[][] numeros;//Declaración del array
		numeros = new int[numFilas][numColumnas];//Instanciamos array
		
		System.out.println("Introduce " + (numFilas*numColumnas) + " valores:");
		for (int fila = 0; fila < numFilas; fila++) {
			for (int columna = 0; columna < numColumnas; columna++) {
				numeros[fila][columna] = teclado.nextInt();
			}
		}
		
		int numMayoresQue0 = 0, numMenoresQue0 = 0, numIgualA0 = 0;
		for (int fila = 0; fila < numFilas; fila++) {
			for (int columna = 0; columna < numColumnas; columna++) {
				if (numeros[fila][columna] < 0) {
					numMenoresQue0++;
				} else if (numeros[fila][columna] > 0) {
					numMayoresQue0++;
				} else {
					numIgualA0++;
				}
			}
		}
		System.out.println("Cantidad de números mayores que 0: " + numMayoresQue0);
		System.out.println("Cantidad de números menores que 0: " + numMenoresQue0);
		System.out.println("Cantidad de números iguales a 0: " + numIgualA0);
	}

}
