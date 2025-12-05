/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 2/12/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		int suma = suma1aN(num);
		int producto = producto1aN(num);
		double media = intermedio1aN(num);
		
		System.out.println("La suma de 1 a " + num + " es " + suma);
		System.out.println("El producto de 1 a " + num + " es " + producto);
		System.out.println("El valor intermedio entre 1 y " + num + " es " + media);
	}
	
	// Devuelve la suma de enteros de 1 a n
	public static int suma1aN(int n) {
		 int suma = 0;
		 for (int contador = 1; contador <= n; contador++) {
			 suma = suma + contador;
		 }
		 return suma;
	}
	
	// Devuelve el producto de enteros de 1 a n
	public static int producto1aN(int n) {
		 int producto = 1;
		 for (int contador = 1; contador <= n; contador++) {
			 producto = producto * contador;
		 }
		 return producto;
	}
	
	// Devuelve el valor intermedio entre 1 y n
	public static double intermedio1aN(int n) {
		 double media = (double) (1+n)/2;
		 return media;
	}
}
