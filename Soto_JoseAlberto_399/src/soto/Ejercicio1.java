/*
 * Descripción: Gestión de las notas de los estudiantes
 * Autor: Jose Alberto Soto Mas
 * Fecha: 26/11/25
 */
package soto;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		
		int numAlumnos = 0;
		String nombre, estado;
		double nota, sumaNotas, notaMedia;
		do {
			System.out.print("Introduce el nombre del alumno (o \"fin\" para finalizar): ");
			nombre = teclado.nextLine();
			
			if (!nombre.equals("fin")) {
				sumaNotas = 0;//Reinicia el sumatorio para cada alumno
				System.out.println("Introduce las notas de las 4 evaluaciones: ");
				for (int evaluacion = 1; evaluacion <= 4; evaluacion++) {
					do {
						System.out.print(evaluacion + "ª evaluación: ");
						nota = teclado.nextDouble();
						if ((nota < 0)||(nota > 10)) {
							System.out.println("Nota no válida: introdúcela de nuevo");
						}
					} while ((nota < 0)||(nota > 10));
					sumaNotas = sumaNotas + nota;
				}
				
				notaMedia = sumaNotas/4;
				if (notaMedia >= 5) {
					estado = "Aprobado";
				} else {
					estado = "Suspenso";
				}
				System.out.println("Nombre del alumno: " + nombre);
				System.out.println("Nota media del alumno: " + notaMedia);
				System.out.println(estado);
				
				numAlumnos++;
				teclado.nextLine();//Linea extra para evitar asignar un retorno de carro en la siguente petición de un nombre
			}
		} while (!nombre.equals("fin"));
		System.out.println("Número de estudiantes procesados: " + numAlumnos);
	}

}
