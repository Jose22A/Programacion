/*
 * Descripción: Manejo de distintos tipos de variables: operaciones, casting, entrada y salida de datos...
 * Autor: Jose Alberto Soto Mas
 * Fecha: 29/10/25
 */
package soto;

import java.util.Scanner;

public class Ejercicio1 {
	public enum Algoritmos {OPERACION, FUERZA_PESO, NUMERO_VUELTAS, AREA_CIRCULO};//Creación del tipo enumerado

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		
		int numX, masa, tiempo;
		double gravedad = 9.8, frecuencia, radio;
		
		System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");
		System.out.println("---------------------------------------");
		
		System.out.print("Introduce el valor de X: ");
		numX = teclado.nextInt();
		System.out.print("Introduce la masa (kg): ");
		masa = teclado.nextInt();
		System.out.print("Introduce el tiempo (s): ");
		tiempo = teclado.nextInt();
		System.out.print("Introduce la frecuencia (hz): ");
		frecuencia = teclado.nextDouble();
		System.out.print("Introduce el radio del círculo (m): ");
		radio = teclado.nextDouble();
		System.out.println();
		
		double operacion, fuerzaPeso, areaCirculo;
		int numVueltas;
		
		operacion = (numX + (numX/4.0))/(6.0 - (numX/2.0));//numX: casting implícito de int a double
		fuerzaPeso = masa * gravedad;//masa: casting implícito de int a double debido a que gravedad es de tipo double
		numVueltas = (int) (frecuencia * tiempo);
		/*
		 * tiempo: casting implícito de int a double debido a que frecuencia es de tipo double
		 * frecuencia * tiempo: casting explícito de double a int
		 */
		areaCirculo = Math.PI * Math.pow(radio, 2.0);//Todos los valores son double: no hay casting
		
		System.out.println("RESULTADOS");
		System.out.println("----------");
		System.out.println(Algoritmos.OPERACION + ": " + operacion);
		System.out.println(Algoritmos.FUERZA_PESO + ": " + fuerzaPeso);
		System.out.println(Algoritmos.NUMERO_VUELTAS + ": " + numVueltas);
		System.out.println(Algoritmos.AREA_CIRCULO + ": " + areaCirculo);
	}

}
