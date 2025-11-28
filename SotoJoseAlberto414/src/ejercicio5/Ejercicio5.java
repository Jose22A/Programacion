/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 28/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int millas;
		System.out.print("Introduce un número de millas: ");
		millas = teclado.nextInt();
		
		double kilometros = millas_a_kilometros(millas);
		System.out.println(millas + " millas son " + kilometros + " kilómetros");
	}
	
	// Devuelve la conversión de millas a kilómetros
	public static double millas_a_kilometros(int millas) {
		 double resultado = millas * 1.60934;
		 return resultado;
	}
}
