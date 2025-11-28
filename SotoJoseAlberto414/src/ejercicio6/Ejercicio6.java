/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 28/11/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		final int TAMANO = 5;
		
		Scanner teclado = new Scanner(System.in);
		
		double[] precios;//Declaración del array
		precios = new double[TAMANO];//Instanciamos array
		
		System.out.println("Introduce el precio de 5 productos:");
		for (int posicion = 0; posicion < TAMANO; posicion++) {
			System.out.print("Producto " + (posicion+1) + ": ");
			precios[posicion] = teclado.nextDouble();
		}
		
		double precioConIVA;
		for (int posicion = 0; posicion < TAMANO; posicion++) {
			precioConIVA = precioConIVA(precios[posicion]);
			System.out.println("Precio con IVA del producto " + (posicion+1) + ": " + precioConIVA);
		}
	}
	
	// Devuelve el precio tras sumarle un 21% de IVA
	public static double precioConIVA(double precio) {
		 double resultado = precio * 1.21;
		 resultado = (double)Math.round(resultado*100)/100; //Nos aseguramos de que el precio devuelto tenga solo 2 decimales
		 return resultado;
	}
}
