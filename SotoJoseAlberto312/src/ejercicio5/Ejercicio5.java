/*
 * Descripción: Manejo de cadenas de caracteres
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.print("Introduce una cadena de texto: ");
		cadena = teclado.nextLine();
		
		String cadenaSinEspacios = "";
		for (int posicion = 0; posicion < cadena.length(); posicion++) {
			if (cadena.charAt(posicion) != ' ') {
				cadenaSinEspacios = cadenaSinEspacios + cadena.charAt(posicion);
			}
		}
		
		String cadenaInversa = "";
		for (int posicion = cadenaSinEspacios.length() - 1; posicion >= 0; posicion--) {
			cadenaInversa = cadenaInversa + cadenaSinEspacios.charAt(posicion);
		}
		
		if (cadenaSinEspacios.equalsIgnoreCase(cadenaInversa)) {
			System.out.println("La cadena es un palíndromo");
		} else {
			System.out.println("La cadena no es un palíndromo");
		}
	}

}
