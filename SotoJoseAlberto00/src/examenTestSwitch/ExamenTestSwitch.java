/*
 * Descripción: Manejo del condicional switch para calcular la nota de un examen
 * Autor: Jose Alberto Soto Mas
 * Fecha: 07/10/25
 */
package examenTestSwitch;

import java.util.Scanner;

public class ExamenTestSwitch {

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
			int nota = (int)Math.floor((((float)numAciertos - (float)numErrores/2)/20) * 10);
			if (nota < 0) { //La nota no puede ser negativa
				nota = 0;
			}
			System.out.println("Nota: " + nota);
			switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("INSUFICIENTE");
				break;
			case 5:
				System.out.println("SUFICIENTE");
				break;
			case 6:
				System.out.println("BIEN");
				break;
			case 7:
			case 8:
				System.out.println("NOTABLE");
				break;
			default:
				System.out.println("SOBRESALIENTE");
			}
		}
	}

}
