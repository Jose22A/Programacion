/*
 * Descripción: Manejo de estructuras de selección y repetición
 * Autor: Jose Alberto Soto Mas
 * Fecha: 29/10/25
 */
package soto;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		
		double precioFitness = 10.0, precioYoga = 15.0, precioMusculacion = 20.0;
		System.out.println("GESTIÓN DE UN GIMNASIO");
		System.out.println("----------------------");
		System.out.println("TIPOS DE MATRÍCULAS: 1. FITNESS - 2. YOGA - 3. MUSCULACIÓN");
		System.out.println("Precio de la matrícula tipo 1 (FITNESS): " + precioFitness + "€");
		System.out.println("Precio de la matrícula tipo 2 (YOGA): " + precioYoga + "€");
		System.out.println("Precio de la matrícula tipo 3 (MUSCULACIÓN): " + precioMusculacion + "€");
		System.out.println();
		
		int opcion;
		do {
			System.out.println("---MENÚ DE OPERACIONES---");
			System.out.println("1. Calcular PVP de cada matrícula");
			System.out.println("2. Aplicar oferta a un tipo de matrícula (sin IVA)");
			System.out.println("3. Calcular el importe total de las matrículas realizadas (sin IVA)");
			System.out.println("4. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opción no válida. Inténtelo de nuevo");
			}
		} while (opcion != 4);
	}

}
