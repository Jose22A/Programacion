/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/12/25
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int kilometros;
		System.out.print("Introduce un número de kilómetros: ");
		kilometros = teclado.nextInt();
		
		double millas = kilometros_a_millas(kilometros);
		System.out.println(kilometros + " kilómetros son " + millas + " millas");
	}
	
	// Devuelve la conversión de kilómetros a millas
	public static double kilometros_a_millas(int kilometros) {
		 double resultado = kilometros / 1.60934;
		 return resultado;
	}
}
