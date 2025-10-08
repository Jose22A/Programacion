/*
 * Descripción: Manejo básico de condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 07/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		String nombre, apellidos;//Declaración de variables
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce tus apellidos: ");
		apellidos = teclado.nextLine();
		
		int importe1, importe2, importe3, importe4;
		System.out.println("Introduce el dinero gastado en tus compras (4 en total): ");
		System.out.print("Primera compra: ");
		importe1 = teclado.nextInt();
		System.out.print("Segunda compra: ");
		importe2 = teclado.nextInt();
		System.out.print("Tercera compra: ");
		importe3 = teclado.nextInt();
		System.out.print("Cuarta compra: ");
		importe4 = teclado.nextInt();
		
		int importeSuma = importe1 + importe2 + importe3 + importe4;
		float importeMedio = (float)importeSuma/4;
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe gastado 1: " + importe1 + " euros");
		System.out.println("Importe gastado 2: " + importe2 + " euros");
		System.out.println("Importe gastado 3: " + importe3 + " euros");
		System.out.println("Importe gastado 4: " + importe4 + " euros");
		System.out.println("");
		System.out.println("Importe medio: " + importeMedio + " euros");
		System.out.println("");
		if (importeSuma >= 300) {
			System.out.println("Felicidades, sus compras han alcanzado los 300 euros este mes,\n"
					+ "dispone de un vale descuento de 50 euros.");
		} else {
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes,\n"
					+ "no dispone de descuento.");
		}
	}

}
