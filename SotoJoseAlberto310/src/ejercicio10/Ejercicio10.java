/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 31/10/25
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numN;
		System.out.print("Introduce un número N: ");
		numN = teclado.nextInt();
		
		double[] alturas;//Declaración del array
		alturas = new double[numN];//Instanciamos array
		
		System.out.println("Introduce " + numN + " alturas:");
		for (int contador = 0; contador < numN; contador++) {
			System.out.print("Altura " + contador + ": ");
			alturas[contador] = teclado.nextDouble();
		}
		
		double alturaMax, alturaMin, alturaSuma, alturaMedia;
		alturaMax = alturas[0];
		alturaMin = alturas[0];
		alturaSuma = 0;
		for (int posicion = 0; posicion < numN; posicion++) {
			if (alturas[posicion] < alturaMin) {
				alturaMin = alturas[posicion];
			}
			if (alturas[posicion] > alturaMax) {
				alturaMax = alturas[posicion];
			}
			alturaSuma = alturaSuma + alturas[posicion];
		}
		alturaMedia = alturaSuma/numN;
		System.out.println("Altura media: " + alturaMedia);
		System.out.println("Altura máxima: " + alturaMax);
		System.out.println("Altura mínima: " + alturaMin);
		
		int alturasSobreMedia = 0, alturasBajoMedia = 0;
		for (int posicion = 0; posicion < numN; posicion++) {
			if (alturas[posicion] < alturaMedia) {
				alturasBajoMedia++;
			} else if (alturas[posicion] > alturaMedia) {
				alturasSobreMedia++;
			}
			alturaSuma = alturaSuma + alturas[posicion];
		}
		System.out.println("Cantidad de personas que miden por encima de la media: " + alturasSobreMedia);
		System.out.println("Cantidad de personas que miden por debajo de la media: " + alturasBajoMedia);
	}

}
