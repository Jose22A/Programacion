/*
 * Descripción: Asignar datos a distintos tipos de variables mediante el teclado
 * Autor: Jose Alberto Soto Mas
 * Fecha: 26/09/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		String nombreEquipo;//Declaración de variable
		System.out.print("Introduce el nombre del equipo: ");
		nombreEquipo = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado 
		
		short annoFundacion;
		System.out.print("Introduce el año de fundación: ");
		annoFundacion = teclado.nextShort();
		
		teclado.nextLine();//Linea adicional para evitar que la siguiente petición asigne el retorno de carro a la variable
		String nombreEstadio;
		System.out.print("Introduce el nombre del estadio: ");
		nombreEstadio = teclado.nextLine();
		
		String nombreCapitan;
		System.out.print("Introduce el nombre del capitán: ");
		nombreCapitan = teclado.nextLine();
		
		System.out.println("Nombre del Equipo: " + nombreEquipo);
		System.out.println("Fundado en: " + annoFundacion);
		System.out.println("Estadio: " + nombreEstadio);
		System.out.println("Capitán: " + nombreCapitan);
	}

}
