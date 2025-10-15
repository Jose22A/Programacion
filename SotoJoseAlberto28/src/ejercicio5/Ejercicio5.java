/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 15/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, num0 = 0, numPos = 0, numNeg = 0;
		double sumaPos = 0, sumaNeg = 0;
		System.out.println("Introduce diez números:");
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("Número " + contador + ": ");
			num = teclado.nextInt();
			if (num < 0) {
				numNeg = numNeg + 1;
				sumaNeg = sumaNeg + num;
			} else if (num > 0) {
				numPos = numPos + 1;
				sumaPos = sumaPos + num;
			} else {
				num0 = num0 + 1;
			}
		}
		
		if (numPos != 0) {
			System.out.println("Media de los números positivos: " + sumaPos/(double)numPos);
		} else {//No se han introducido números positivos
			System.out.println("Media de los números positivos: 0");
		}
		if (numNeg != 0) {
			System.out.println("Media de los números negativos: " + sumaNeg/(double)numNeg);
		} else {//No se han introducido números negativos
			System.out.println("Media de los números negativos: 0");
		}
		System.out.println("Número de ceros: " + num0);
	}

}
