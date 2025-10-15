/*
 * Descripción: Manejo del bucle for
 * Autor: Jose Alberto Soto Mas
 * Fecha: 14/10/25
 */
package para;

public class BucleFor {

	public static void main(String[] args) {
		int numero = 5;//Numero para calcular su tabla de multiplicar
		
		for (int contador = 10; contador >= 1; contador--) {
			System.out.println(numero + " por " + contador + " es igual a " + numero*contador);
		}
	}

}
