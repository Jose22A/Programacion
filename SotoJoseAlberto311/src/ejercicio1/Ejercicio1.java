/*
 * Descripción: Manejo de arrays bidimensionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 13/11/25
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		final int TAMANO = 5;
		
		int[][] numeros;//Declaración del array
		numeros = new int[TAMANO][TAMANO];//Instanciamos array
		
		int numero = 1;
		for (int fila = 0; fila < TAMANO; fila++) {
			for (int columna = 0; columna < TAMANO; columna++) {
				numeros[fila][columna] = numero;
				numero++;
			}
		}
		
		for (int fila = 0; fila < TAMANO; fila++) {
			for (int columna = 0; columna < TAMANO; columna++) {
				System.out.print(numeros[fila][columna] + "\t");
			}
			System.out.println();
		}
	}

}
