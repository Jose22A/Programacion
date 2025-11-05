/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 31/10/25
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 10;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		String opcion;
		int numV, numP;
		do {
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor.");
			System.out.println("c. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = teclado.nextLine();
			switch (opcion) {
				case "a":
					for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
						System.out.print(numeros[posicion] + "\t");
					}
					System.out.println();
					break;
				case "b":
					System.out.print("Introduce el valor V a introducir: ");
					numV = teclado.nextInt();
					System.out.print("Introduce la posición P en la que introducir el valor V: ");
					numP = teclado.nextInt();
					teclado.nextLine();//Peticion extra para evitar que se asigne el retorno de carro a la variable opcion (tras salir del switch y volver al principio del bucle)
					if ((numP >= 0)&&(numP < TOTAL_NUM)) {
						numeros[numP] = numV;
					} else {
						System.out.println("Posición no válida. Inténtelo de nuevo");
					}
					break;
				case "c":
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opción no válida. Inténtelo de nuevo");
			}
		} while (!opcion.equals("c"));
	}

}
