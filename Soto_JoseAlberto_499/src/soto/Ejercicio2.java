/*
 * Descripción: Manejo de objetos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/12/25
 */
package soto;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Apartado 2: Declaración de variables
		CuentaBancaria soto_1, soto_2, soto_3;
		
		//Apartado 3: Creación de cuentas
		System.out.printf("Creando cuenta nº1:\n");
		try {
			soto_1 = new CuentaBancaria(saldoAleatorio());
		} catch(IllegalArgumentException e) {
			System.out.printf("Error al crear la cuenta: saldo inicial no válido\n");
			System.out.printf("Creando cuenta con valores por defecto\n");
			soto_1 = new CuentaBancaria();
		}
		System.out.printf("Cuenta nº1: %s\n",soto_1.toString());
		System.out.printf("Creando cuenta nº2:\n");
		try {
			soto_2 = new CuentaBancaria(saldoAleatorio());
		} catch(IllegalArgumentException e) {
			System.out.printf("Error al crear la cuenta: saldo inicial no válido\n");
			System.out.printf("Creando cuenta con valores por defecto\n");
			soto_2 = new CuentaBancaria();
		}
		System.out.printf("Cuenta nº2: %s\n",soto_2.toString());
		System.out.printf("Creando cuenta nº3:\n");
		try {
			soto_3 = new CuentaBancaria(saldoAleatorio());
		} catch(IllegalArgumentException e) {
			System.out.printf("Error al crear la cuenta: saldo inicial no válido\n");
			System.out.printf("Creando cuenta con valores por defecto\n");
			soto_3 = new CuentaBancaria();
		}
		System.out.printf("Cuenta nº3: %s\n",soto_3.toString());
		
		//Apartado 5: Ingreso de saldo
		System.out.printf("Ingresando 1000 euros en la cuenta nº1\n");
		try {
			soto_1.ingresar(1000);
		} catch(IllegalArgumentException e1) {
			System.out.printf("Error al ingresar dinero: cantidad no válida\n");
		} catch(IllegalStateException e2) {
			System.out.printf("Error al ingresar dinero: la cantidad a ingresar excede el saldo máximo\n");
		}
		System.out.printf("Cuenta nº1 tras el ingreso: %s\n",soto_1.toString());
	}
	
	//saldoAleatorio devuelve un tipo int entre -3000 y 3000
	public static int saldoAleatorio() {
		int saldo = -30 + (int)(Math.random()*61);
		saldo = saldo*100;
		return saldo;
	}
}
