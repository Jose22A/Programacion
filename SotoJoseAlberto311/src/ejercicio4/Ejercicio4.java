/*
 * Descripción: Manejo de arrays bidimensionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 14/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int ALUMNOS = 4;
		final int ASIGNATURAS = 5;
		
		double[][] notas;//Declaración del array
		notas = new double[ALUMNOS][ASIGNATURAS];//Instanciamos array
		
		System.out.println("Introduce las notas de los alumnos:");
		for (int alumno = 0; alumno < ALUMNOS; alumno++) {
			System.out.println("Alumno " + (alumno+1) + ":");
			for (int asignatura = 0; asignatura < ASIGNATURAS; asignatura++) {
				do {
					System.out.print("Asignatura " + (asignatura+1) + ": ");
					notas[alumno][asignatura] = teclado.nextInt();
				} while ((notas[alumno][asignatura] < 0)||(notas[alumno][asignatura] > 10));
			}
		}
		
		double notaMax, notaMin, sumaNotas;
		for (int alumno = 0; alumno < ALUMNOS; alumno++) {
			notaMax = notas[alumno][0];
			notaMin = notas[alumno][0];
			sumaNotas = 0;
			for (int asignatura = 0; asignatura < ASIGNATURAS; asignatura++) {
				if (notas[alumno][asignatura] > notaMax) {
					notaMax = notas[alumno][asignatura];
				}
				if (notas[alumno][asignatura] < notaMin) {
					notaMin = notas[alumno][asignatura];
				}
				sumaNotas = sumaNotas + notas[alumno][asignatura];
			}
			System.out.println("Nota máxima del alumno " + (alumno+1) + ": " + notaMax);
			System.out.println("Nota mínima del alumno " + (alumno+1) + ": " + notaMin);
			System.out.println("Nota media del alumno " + (alumno+1) + ": " + (sumaNotas/ASIGNATURAS));
			System.out.println();
		}
	}

}
