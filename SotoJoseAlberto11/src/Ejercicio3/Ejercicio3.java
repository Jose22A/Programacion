/*
 * Descripción: Declarar, inicializar y mostrar distintos tipos de variables por pantalla
 * Autor: Jose Alberto Soto Mas
 * Fecha: 23/09/25
 */
package Ejercicio3;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int num1 = 0, num2 = 0; //Declaración e inicialización de variables tipo int
		double val1, val2; //Declaración de variables tipo double
		String nombre = "Jose Alberto", apellidos = "Soto Mas"; //Declaración e inicialización de variables tipo String
		System.out.println ("Valor de las variables tipo int: " + num1 + " y " + num2);
		val1 = 5.5; //Inicialización de las variables tipo double
		val2 = 6.36;
		System.out.println ("Valor de las variables tipo double: " + val1 + " y " + val2);
		System.out.println ("Mi nombre es " + nombre + " y mis apellidos " + apellidos);
	}

}
