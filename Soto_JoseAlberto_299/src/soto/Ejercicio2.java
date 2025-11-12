/*
 * Descripción: Manejo de vectores: asignación y búsqueda de valores
 * Autor: Jose Alberto Soto Mas
 * Fecha: 12/11/25
 */
package soto;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		final int TOTAL_NUM = 30;//Tamaño del vector de datos
		
		int[] numeros;//Declaración del vector
		numeros = new int[TOTAL_NUM];//Instanciamos vector
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) (Math.random()*301);//Valor aleatorio entre 0 y 300
		}
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print(numeros[posicion] + "\t");
			if ((posicion+1)%10 == 0) {//Cada 10 numeros cambiamos de linea
				System.out.println();
			}
		}
		
		int numero;
		do {
			System.out.print("Introduce un número entre 0 y 300: ");
			numero = teclado.nextInt();
		} while ((numero < 0)||(numero > 300));
		
		System.out.println("Números menores que " + numero + ": ");
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			if (numeros[posicion] < numero) {
				System.out.print(numeros[posicion] + "\t");
				System.out.println("Posición " + posicion);
			}
		}
		
		int posicion1, posicion2;
		System.out.println("Introduce dos posiciones (entre 0 y 29): ");
		do {
			System.out.print("Posición 1: ");
			posicion1 = teclado.nextInt();
		} while ((posicion1 < 0)||(posicion1 > 29));
		do {
			System.out.print("Posición 2: ");
			posicion2 = teclado.nextInt();
		} while ((posicion2 < 0)||(posicion2 > 29));
		
		boolean hayImpares = false;
		if (posicion1 < posicion2) {
			System.out.println("Números impares entre las posiciones " + posicion1 + " y " + posicion2 + ":");
			for (int posicion = posicion1; posicion <= posicion2; posicion++) {
				if (numeros[posicion] % 2 != 0) {//El número es impar
					System.out.print(numeros[posicion] + "\t");
					hayImpares = true;
				}
			}
		} else {
			System.out.println("Números impares entre las posiciones " + posicion2 + " y " + posicion1 + ":");
			for (int posicion = posicion2; posicion <= posicion1; posicion++) {
				if (numeros[posicion] % 2 != 0) {//El número es impar
					System.out.print(numeros[posicion] + "\t");
					hayImpares = true;
				}
			}
		}
		if (!hayImpares) {
			System.out.println("No se ha encontrado ningun número impar");
		}
	}

}
