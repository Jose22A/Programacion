/*
 * Descripción: Manejo de clases
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/1/26
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		Punto punto1, punto2, punto3;
		
		punto1 = new Punto();
		punto1.x = 5;
		punto1.y = 0;
		
		punto2 = new Punto();
		punto2.x = 10;
		punto2.y = 10;
		
		punto3 = new Punto();
		punto3.x = -3;
		punto3.y = 7;
		
		System.out.println("Punto 1: x=" + punto1.x + " y=" + punto1.y);
		System.out.println("Punto 2: x=" + punto2.x + " y=" + punto2.y);
		System.out.println("Punto 3: x=" + punto3.x + " y=" + punto3.y);
	}

}
