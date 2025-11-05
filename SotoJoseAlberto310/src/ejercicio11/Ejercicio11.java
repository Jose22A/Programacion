/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 31/10/25
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		final int TOTAL_NUM = 100;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		int[] numerosInverso;
		numerosInverso = new int[TOTAL_NUM];
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = posicion + 1;
		}
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numerosInverso[posicion] = numeros[(TOTAL_NUM - posicion) - 1];
		}
		
		System.out.println("Primer array:");
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.println(numeros[posicion]);
		}
		System.out.println("Segundo array:");
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.println(numerosInverso[posicion]);
		}
	}

}
