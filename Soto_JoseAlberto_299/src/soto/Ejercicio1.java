/*
 * Descripción: Manejo de bucles y condicionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 12/11/25
 */
package soto;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		
		int numero;
		System.out.print("Introduce un número entre 1 y 100 (0 para finalizar): ");
		numero = teclado.nextInt();
		
		//Inicializamos los contadores de cada decena
		int CantidadNumerosEntre1Y9 = 0;
		int CantidadNumerosEntre10Y19 = 0;
		int CantidadNumerosEntre20Y29 = 0;
		int CantidadNumerosEntre30Y39 = 0;
		int CantidadNumerosEntre40Y49 = 0;
		int CantidadNumerosEntre50Y59 = 0;
		int CantidadNumerosEntre60Y69 = 0;
		int CantidadNumerosEntre70Y79 = 0;
		int CantidadNumerosEntre80Y89 = 0;
		int CantidadNumerosEntre90Y99 = 0;
		int CantidadNumeros100 = 0;
		
		//Inicializamos los sumedores de cada decena
		double SumaNumerosEntre1Y9 = 0;
		double SumaNumerosEntre10Y19 = 0;
		double SumaNumerosEntre20Y29 = 0;
		double SumaNumerosEntre30Y39 = 0;
		double SumaNumerosEntre40Y49 = 0;
		double SumaNumerosEntre50Y59 = 0;
		double SumaNumerosEntre60Y69 = 0;
		double SumaNumerosEntre70Y79 = 0;
		double SumaNumerosEntre80Y89 = 0;
		double SumaNumerosEntre90Y99 = 0;
		double SumaNumeros100 = 0;
		
		while (numero != 0) {
			if ((numero >= 1)&&(numero <= 9)) {//Entre 1 y 9
				CantidadNumerosEntre1Y9++;
				SumaNumerosEntre1Y9 = SumaNumerosEntre1Y9 + numero;
			} else if ((numero >= 10)&&(numero <= 19)) {//Entre 10 y 19
				CantidadNumerosEntre10Y19++;
				SumaNumerosEntre10Y19 = SumaNumerosEntre10Y19 + numero;
			} else if ((numero >= 20)&&(numero <= 29)) {//Entre 20 y 29
				CantidadNumerosEntre20Y29++;
				SumaNumerosEntre20Y29 = SumaNumerosEntre20Y29 + numero;
			} else if ((numero >= 30)&&(numero <= 39)) {//Entre 30 y 39
				CantidadNumerosEntre30Y39++;
				SumaNumerosEntre30Y39 = SumaNumerosEntre30Y39 + numero;
			} else if ((numero >= 40)&&(numero <= 49)) {//Entre 40 y 49
				CantidadNumerosEntre40Y49++;
				SumaNumerosEntre40Y49 = SumaNumerosEntre40Y49 + numero;
			} else if ((numero >= 50)&&(numero <= 59)) {//Entre 50 y 59
				CantidadNumerosEntre50Y59++;
				SumaNumerosEntre50Y59 = SumaNumerosEntre50Y59 + numero;
			} else if ((numero >= 60)&&(numero <= 69)) {//Entre 60 y 69
				CantidadNumerosEntre60Y69++;
				SumaNumerosEntre60Y69 = SumaNumerosEntre60Y69 + numero;
			} else if ((numero >= 70)&&(numero <= 79)) {//Entre 70 y 79
				CantidadNumerosEntre70Y79++;
				SumaNumerosEntre70Y79 = SumaNumerosEntre70Y79 + numero;
			} else if ((numero >= 80)&&(numero <= 89)) {//Entre 80 y 89
				CantidadNumerosEntre80Y89++;
				SumaNumerosEntre80Y89 = SumaNumerosEntre80Y89 + numero;
			} else if ((numero >= 90)&&(numero <= 99)) {//Entre 90 y 99
				CantidadNumerosEntre90Y99++;
				SumaNumerosEntre90Y99 = SumaNumerosEntre90Y99 + numero;
			} else if (numero == 100) {//El número es 100
				CantidadNumeros100++;
				SumaNumeros100 = SumaNumeros100 + numero;
			}
			
			System.out.print("Introduce otro número entre 1 y 100 (0 para finalizar): ");
			numero = teclado.nextInt();
		}
		
		System.out.println("Cantidad de números entre 1 y 9 introducidos: " + CantidadNumerosEntre1Y9);
		System.out.print("Media de los números entre 1 y 9 introducidos: ");
		if (CantidadNumerosEntre1Y9 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre1Y9/CantidadNumerosEntre1Y9);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 10 y 19 introducidos: " + CantidadNumerosEntre10Y19);
		System.out.print("Media de los números entre 10 y 19 introducidos: ");
		if (CantidadNumerosEntre10Y19 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre10Y19/CantidadNumerosEntre10Y19);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 20 y 29 introducidos: " + CantidadNumerosEntre20Y29);
		System.out.print("Media de los números entre 20 y 29 introducidos: ");
		if (CantidadNumerosEntre20Y29 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre20Y29/CantidadNumerosEntre20Y29);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 30 y 39 introducidos: " + CantidadNumerosEntre30Y39);
		System.out.print("Media de los números entre 30 y 39 introducidos: ");
		if (CantidadNumerosEntre30Y39 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre30Y39/CantidadNumerosEntre30Y39);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 40 y 49 introducidos: " + CantidadNumerosEntre40Y49);
		System.out.print("Media de los números entre 40 y 49 introducidos: ");
		if (CantidadNumerosEntre40Y49 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre40Y49/CantidadNumerosEntre40Y49);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 50 y 59 introducidos: " + CantidadNumerosEntre50Y59);
		System.out.print("Media de los números entre 50 y 59 introducidos: ");
		if (CantidadNumerosEntre50Y59 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre50Y59/CantidadNumerosEntre50Y59);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 60 y 69 introducidos: " + CantidadNumerosEntre60Y69);
		System.out.print("Media de los números entre 60 y 69 introducidos: ");
		if (CantidadNumerosEntre60Y69 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre60Y69/CantidadNumerosEntre60Y69);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 70 y 79 introducidos: " + CantidadNumerosEntre70Y79);
		System.out.print("Media de los números entre 70 y 79 introducidos: ");
		if (CantidadNumerosEntre70Y79 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre70Y79/CantidadNumerosEntre70Y79);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 80 y 89 introducidos: " + CantidadNumerosEntre80Y89);
		System.out.print("Media de los números entre 80 y 89 introducidos: ");
		if (CantidadNumerosEntre80Y89 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre80Y89/CantidadNumerosEntre80Y89);
		}
		System.out.println();
		System.out.println("Cantidad de números entre 90 y 99 introducidos: " + CantidadNumerosEntre90Y99);
		System.out.print("Media de los números entre 90 y 99 introducidos: ");
		if (CantidadNumerosEntre90Y99 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumerosEntre90Y99/CantidadNumerosEntre90Y99);
		}
		System.out.println();
		System.out.println("Cantidad de números 100 introducidos: " + CantidadNumeros100);
		System.out.print("Media de los números 100 introducidos: ");
		if (CantidadNumeros100 == 0) {
			System.out.println(0);
		} else {
			System.out.println(SumaNumeros100/CantidadNumeros100);
		}
	}

}
