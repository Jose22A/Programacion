/*
 * Descripción: Manejo de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 09/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos;//Declaración de variables
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce tus apellidos: ");
		apellidos = teclado.nextLine();
		
		int edad;
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		int salarioDeseado;
		System.out.print("Introduce tu salario deseado: ");
		salarioDeseado = teclado.nextInt();
		
		if (salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			int annosExp, proyectosTrabajados;
			System.out.print("Introduce tus años de experiencia: ");
			annosExp = teclado.nextInt();
			System.out.print("Introduce el número de proyectos en los que has trabajado: ");
			proyectosTrabajados = teclado.nextInt();
			
			if (annosExp > 2 && proyectosTrabajados > 3) {
				System.out.println("Enhorabuena. Ha sido contratado");
				if (annosExp > 5 || proyectosTrabajados > 5) {
					System.out.println("Salario a percibir: 30000");
				} else {
					System.out.println("Salario a percibir: 25000");
				}
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
			}
		}
	}

}
