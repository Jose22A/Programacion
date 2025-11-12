/*
 * Descripción: Manejo de arrays usando la clase Arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 11/11/25
 */
package ejercicio19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 8;
		
		int[] puntuaciones;//Declaración del array
		puntuaciones = new int[TOTAL_NUM];//Instanciamos array
		
		int posicion = 0, puntuacion;
		System.out.println("Introduce la puntuación de los 8 jugadores:");
		do {
			System.out.print("Jugador " + (posicion+1) + ": ");
			puntuacion = teclado.nextInt();
			if ((puntuacion >= 1000)&&(puntuacion <= 2800)) {
				puntuaciones[posicion] = puntuacion;
				posicion++;
			}
		} while (posicion < TOTAL_NUM);
		Arrays.sort(puntuaciones);//Arrays.sort ordena de menor a mayor
		
		int[] puntuacionesMayorAMenor;
		puntuacionesMayorAMenor = new int[TOTAL_NUM];
		//Guardamos en otro array los valores ordenados de mayor a menor
		for (posicion = 0; posicion < TOTAL_NUM; posicion++) {
			puntuacionesMayorAMenor[posicion] = puntuaciones[(TOTAL_NUM-1)-posicion];
		}
		
		System.out.println("Puntuaciones de los jugadores (de mayor a menor):");
		for (posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.println(puntuacionesMayorAMenor[posicion]);
		}
	}

}
