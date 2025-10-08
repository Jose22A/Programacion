/*
 * Descripción: Manejo básico de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 07/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		byte edad;//Declaración de variable
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextByte();//Petición y asignación de un dato introducido en el teclado
		
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		} else {
			teclado.nextLine();//Linea adicional para evitar que la siguiente petición asigne el retorno de carro a la variable
			String nombre, apellidos;
			System.out.print("Introduce tu nombre: ");
			nombre = teclado.nextLine();
			System.out.print("Introduce tus apellidos: ");
			apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println("");
			System.out.println("Usted ha sido admitido");
		}
	}

}
