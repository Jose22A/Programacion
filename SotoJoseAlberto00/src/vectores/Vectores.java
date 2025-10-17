/*
 * Descripción: Manejo de arrays
 * Autor: Jose Alberto Soto Mas
 * Fecha: 17/10/25
 */
package vectores;

public class Vectores {

	public static void main(String[] args) {
		final int TOTAL_NUM = 20;
		
		int[] numeros;//Declaración del array
		numeros = new int[TOTAL_NUM];//Instanciamos array
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			numeros[posicion] = (int) Math.round(Math.random()*50);//Inicializamos los elementos del array a un valor entre 0 y 50
		}
		numeros[3] = 5;
		//Mostramos los valores almacenados en el array
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.println("El valor que hay en la posición " + posicion + " es: " + numeros[posicion]);
		}
	}

}
