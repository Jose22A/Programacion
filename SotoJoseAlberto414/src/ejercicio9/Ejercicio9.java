/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 2/12/25
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.print("Introduce un número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce otro número: ");
		num2 = teclado.nextInt();
		System.out.print("Introduce un tercer número: ");
		num3 = teclado.nextInt();
		
		int numMenorNum1YNum2 = minimo(num1, num2);//Comparamos los dos primeros números
		int numMenor = minimo(numMenorNum1YNum2, num3);//El número que salga se compara con el tercero
		System.out.println("El número menor es " + numMenor);
	}
	
	// Devuelve el menor entre a y b
	public static int minimo(int a, int b) {
		 int resultado;
		 if (a < b) {
			 resultado = a;
		 } else {
			 resultado = b;
		 }
		 return resultado;
	}
}
