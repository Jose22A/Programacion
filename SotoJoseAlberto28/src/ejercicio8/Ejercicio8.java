/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos;//Declaración de variables
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce tus apellidos: ");
		apellidos = teclado.nextLine();
		
		int edad;
		do {
			System.out.print("Introduce tu edad: ");
			edad = teclado.nextInt();
			if (edad <= 17 || edad >= 45) {
				System.out.println("Esa edad no es correcta");
			}
		} while (edad <= 17 || edad >= 45);
		
		int numRutas, distUltRuta;
		System.out.print("Introduce el número de rutas realizadas: ");
		numRutas = teclado.nextInt();
		System.out.print("Introduce la distancia de la última ruta realizada: ");
		distUltRuta = teclado.nextInt();
		
		int distancia, distMax = 0, numParticipantes;
		double sumaDist = 0;
		String ciudad, ciudadDistMax = "";
		System.out.println("Introduce los datos de 5 caminatas:");
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Caminata " + contador + ":");
			System.out.print("Distancia: ");
			distancia = teclado.nextInt();
			System.out.print("Número de participantes: ");
			numParticipantes = teclado.nextInt();
			teclado.nextLine();//Petición extra para evitar que se asigne un retorno de carro a la variable
			System.out.print("Ciudad: ");
			ciudad = teclado.nextLine();
			if (distancia > distMax) {
				distMax = distancia;
				ciudadDistMax = ciudad;
			}
			sumaDist = sumaDist + distancia;
		}
		
		System.out.println("Nombre: " + nombre + " " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas " + numRutas);
		System.out.println("");
		System.out.println("Distancia media (5 últimas rutas): " + sumaDist/5);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distMax);
		System.out.println("Ciudad de la ruta más larga: " + ciudadDistMax);
	}

}
