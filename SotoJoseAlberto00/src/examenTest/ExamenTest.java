/*
 * Descripción: Manejo básico de condicionales para calcular la nota de un examen
 * Autor: Jose Alberto Soto Mas
 * Fecha: 07/10/25
 */
package examenTest;

import java.util.Scanner;

public class ExamenTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		int numAciertos, numErrores;//Declaración de variables
		System.out.print("Introduce el número de aciertos: ");
		numAciertos = teclado.nextInt();//Petición y asignación de un dato introducido en el teclado
		System.out.print("Introduce el número de errores: ");
		numErrores = teclado.nextInt();
		
		int numRespuestas = numAciertos + numErrores;
		if (numRespuestas > 20) {
			System.out.println("Datos erróneos");
		} else { //Datos correctos
			float nota = (((float)numAciertos - (float)numErrores/2)/20) * 10;
			if (nota < 0) { //La nota no puede ser negativa
				nota = 0;
			}
			System.out.println("Nota: " + nota);
			if (nota < 5) {
				System.out.println("INSUFICIENTE");
			} else {
				if (nota < 6) {
					System.out.println("SUFICIENTE");
				} else {
					if (nota < 7) {
						System.out.println("BIEN");
					} else {
						if (nota < 9) {
							System.out.println("NOTABLE");
						} else {
							System.out.println("SOBRESALIENTE");
						}
					}
				}
			}
		}
	}

}
