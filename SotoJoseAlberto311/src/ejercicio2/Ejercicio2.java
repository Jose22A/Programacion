/*
 * Descripción: Manejo de arrays bidimensionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 13/11/25
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int TAMANO = 10;
		
		int[][] tablaMultiplicar;//Declaración del array
		tablaMultiplicar = new int[TAMANO][TAMANO];//Instanciamos array
		
		for (int fila = 0; fila < TAMANO; fila++) {
			for (int columna = 0; columna < TAMANO; columna++) {
				tablaMultiplicar[fila][columna] = (fila+1)*(columna+1);
			}
		}
		
		for (int fila = 0; fila < TAMANO; fila++) {
			for (int columna = 0; columna < TAMANO; columna++) {
				System.out.print(tablaMultiplicar[fila][columna] + "\t");
			}
			System.out.println();
		}
	}

}
