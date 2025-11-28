/*
 * Descripción: Manejo de arrays bidimensionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 18/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int COLUMNAS = 2;
		
		int numEmpleados;
		System.out.print("Introduce el número de empleados: ");
		numEmpleados = teclado.nextInt();
		
		double[][] sueldos;//Declaración del array
		sueldos = new double[numEmpleados][COLUMNAS];//Instanciamos array
		
		System.out.println("Introduce los datos de los empleados:");
		for (int empleado = 0; empleado < numEmpleados; empleado++) {
			System.out.println("Empleado " + (empleado+1) + ":");
			do {
				System.out.print("Género (0->hombre, 1->mujer): ");
				sueldos[empleado][0] = teclado.nextInt();//La primera columna guarda el género
			} while ((sueldos[empleado][0] != 0)&&(sueldos[empleado][0] != 1));
			do {
				System.out.print("Sueldo: ");
				sueldos[empleado][1] = teclado.nextInt();//La segunda columna guarda el sueldo
			} while (sueldos[empleado][1] <= 0);
		}
		
		int cantidadHombres = 0, cantidadMujeres = 0;
		double sumaSueldoHombres = 0, sumaSueldoMujeres = 0;
		for (int empleado = 0; empleado < numEmpleados; empleado++) {
			if (sueldos[empleado][0] == 0) {
				cantidadHombres++;
				sumaSueldoHombres = sumaSueldoHombres + sueldos[empleado][1];
			} else if (sueldos[empleado][0] == 1) {
				cantidadMujeres++;
				sumaSueldoMujeres = sumaSueldoMujeres + sueldos[empleado][1];
			}
		}
		
		System.out.print("Sueldo medio de hombres: ");
		if (cantidadHombres == 0) {
			System.out.println(0);
		} else {
			System.out.println(sumaSueldoHombres/cantidadHombres);
		}
		System.out.print("Sueldo medio de mujeres: ");
		if (cantidadMujeres == 0) {
			System.out.println(0);
		} else {
			System.out.println(sumaSueldoMujeres/cantidadMujeres);
		}
	}

}
