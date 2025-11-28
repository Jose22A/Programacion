/*
 * Descripción: Manejo de cadenas de caracteres
 * Autor: Jose Alberto Soto Mas
 * Fecha: 20/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.print("Introduce una cadena de texto: ");
		cadena = teclado.nextLine();
		
		int inicioPalabra = 0;
		boolean nuevaPalabra = false;
		for (int posicion = 0; posicion < cadena.length(); posicion++) {
			if ((cadena.charAt(posicion) != ' ')&&(!nuevaPalabra)) {//Solo empieza a registrar la palabra cuando se encuentra un caracter distinto al espacio
				nuevaPalabra = true;
				inicioPalabra = posicion;
			} else if ((cadena.charAt(posicion) == ' ')&&(nuevaPalabra)) {//No entra a esta rama en caso de haber varios espacios seguidos, o la cadena empieze por uno
				System.out.println(cadena.substring(inicioPalabra, posicion+1));
				nuevaPalabra = false;
			}
		}
		if (nuevaPalabra) {//Imprime la ultima palabra (siempre que la cadena no hubiera acabado en espacio, el else if del bucle la escribiría en ese caso)
			System.out.println(cadena.substring(inicioPalabra));
		}
	}

}
