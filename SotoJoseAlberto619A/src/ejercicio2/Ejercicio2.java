/*
 * Descripción: Manejo de clases
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/1/26
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Persona persona1, persona2;
		
		System.out.println("Persona 1:");
		persona1 = new Persona();
		System.out.print("Introduce el DNI:");
		persona1.dni = teclado.nextLine();
		System.out.print("Introduce el nombre:");
		persona1.nombre = teclado.nextLine();
		System.out.print("Introduce los apellidos:");
		persona1.apellidos = teclado.nextLine();
		System.out.print("Introduce la edad:");
		persona1.edad = teclado.nextByte();
		
		teclado.nextLine();//Linea extra para evitar que se asigne un retorno de carro a la siguiente variable de tipo String
		
		System.out.println("Persona 2:");
		persona2 = new Persona();
		System.out.print("Introduce el DNI:");
		persona2.dni = teclado.nextLine();
		System.out.print("Introduce el nombre:");
		persona2.nombre = teclado.nextLine();
		System.out.print("Introduce los apellidos:");
		persona2.apellidos = teclado.nextLine();
		System.out.print("Introduce la edad:");
		persona2.edad = teclado.nextByte();
		
		System.out.print(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni);
		if (persona1.edad >= 18) {
			System.out.println(" es mayor de edad");
		} else {
			System.out.println(" no es mayor de edad");
		}
		
		System.out.print(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni);
		if (persona2.edad >= 18) {
			System.out.println(" es mayor de edad");
		} else {
			System.out.println(" no es mayor de edad");
		}
	}

}
