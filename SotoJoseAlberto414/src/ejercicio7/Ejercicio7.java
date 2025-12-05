/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 2/12/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double ancho, alto;
		System.out.print("Introduce el ancho del rectángulo: ");
		ancho = teclado.nextDouble();
		System.out.print("Introduce el alto del rectángulo: ");
		alto = teclado.nextDouble();
		
		double perimetro = perimetroRectangulo(ancho, alto);
		double area = areaRectangulo(ancho, alto);
		System.out.println("El perímetro del rectángulo es " + perimetro);
		System.out.println("El área del rectángulo es " + area);
	}
	
	// Devuelve el perímetro
	public static double perimetroRectangulo(double ancho, double alto) {
		 double resultado = 2*ancho + 2*alto;
		 return resultado;
	}
	
	// Devuelve el área
	public static double areaRectangulo(double ancho, double alto) {
		 double resultado = ancho * alto;
		 return resultado;
	}
}
