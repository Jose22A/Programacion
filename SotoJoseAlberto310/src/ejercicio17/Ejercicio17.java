package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TOTAL_NUM = 10;
		
		int[] numeros1, numeros2;//Declaración del array
		numeros1 = new int[TOTAL_NUM];//Instanciamos array
		numeros2 = new int[TOTAL_NUM];
		
		System.out.println("Introduce 20 números enteros:");
		System.out.println("Primer array:");
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print("Numero " + posicion + ": ");
			numeros1[posicion] = teclado.nextInt();
		}
		System.out.println("Segundo array:");
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.print("Numero " + posicion + ": ");
			numeros2[posicion] = teclado.nextInt();
		}
		
		boolean comparacion = Arrays.equals(numeros1, numeros2);
		if (comparacion) {
			System.out.println("Los dos arrays son iguales");
		} else {
			System.out.println("Los dos arrays son diferentes");
		}
	}

}
