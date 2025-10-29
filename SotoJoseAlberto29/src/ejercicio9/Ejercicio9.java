/*
 * Descripción: Manejo de bucles
 * Autor: Jose Alberto Soto Mas
 * Fecha: 21/10/25
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		int suma = 0, producto = 1;
		for (int num = 1; num <= 10; num++) {
			suma = suma + num;
			producto = producto * num;
		}
		
		System.out.println("Suma de los 10 primeros números naturales: " + suma);
		System.out.println("Producto de los 10 primeros números naturales: " + producto);
	}

}
