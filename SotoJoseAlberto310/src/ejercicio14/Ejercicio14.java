/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 5/11/25
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		final int TOTAL_NUM = 55;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		int posicion = 0;
		for (int numero = 1; numero <= 10; numero++) {
			for (int contador = 1; contador <= numero; contador++) {
				numeros[posicion] = numero;
				posicion++;
			}
		}
		
		for (posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print(numeros[posicion] + " ");
		}
	}

}
