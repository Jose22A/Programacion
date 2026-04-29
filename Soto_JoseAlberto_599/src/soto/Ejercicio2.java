package soto;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Apartado 2: Declaración de variables
		CuentaBancaria soto_1, soto_2, soto_3;
		
		//Apartado 3: Creación de cuentas
		boolean huboError;
		do {
			huboError = false;
			System.out.printf("Creando cuenta nº1:\n");
			try {
				soto_1 = new CuentaBancaria(1000, LocalDate.now(), limiteAleatorio());
				System.out.printf("Cuenta nº1: %s\n",soto_1.toString());
			} catch(IllegalArgumentException e) {
				huboError = true;
				System.out.printf("Error al crear la cuenta: límite de descubierto no válido\n");
				soto_1 = null;
			}
		} while (huboError);
		do {
			huboError = false;
			System.out.printf("Creando cuenta nº2:\n");
			try {
				soto_2 = new CuentaBancaria(2000, LocalDate.now(), limiteAleatorio());
				System.out.printf("Cuenta nº2: %s\n",soto_2.toString());
			} catch(IllegalArgumentException e) {
				huboError = true;
				System.out.printf("Error al crear la cuenta: límite de descubierto no válido\n");
				soto_2 = null;
			}
		} while (huboError);
		do {
			huboError = false;
			System.out.printf("Creando cuenta nº3:\n");
			try {
				soto_3 = new CuentaBancaria(3000, LocalDate.now(), limiteAleatorio());
				System.out.printf("Cuenta nº3: %s\n",soto_3.toString());
			} catch(IllegalArgumentException e) {
				huboError = true;
				System.out.printf("Error al crear la cuenta: límite de descubierto no válido\n");
				soto_3 = null;
			}
		} while (huboError);
		
		//Apartado 9: Transferencias de 300 de la cuenta 1 a la cuenta 2
		System.out.println();
		for (int contador = 1; contador <= 5; contador++) {
			try {
				soto_1.transferir(300, soto_2);
			} catch(IllegalArgumentException e1) {
				System.out.printf("Error en la transferencia: cantidad o cuenta de destino no válidas\n");
			} catch(IllegalStateException e2) {
				System.out.printf("Error en la transferencia: se superaría el límite de descubierto de la cuenta origen, "
						+ "o se superaría el saldo máximo de la cuenta destino\n");
			}
			System.out.printf("Cuentas tras la transferencia nº%d:\n",contador);
			System.out.printf("Cuenta nº1: %s\n",soto_1.toString());
			System.out.printf("Cuenta nº2: %s\n",soto_2.toString());
		}
	}
	
	//limiteAleatorio devuelve un tipo int entre -4000 y 0
	public static int limiteAleatorio() {
		int limite = (int)(Math.random()*401);// Genera un número aleatorio entre 0 y 400
		limite = limite*(-10);// Al multiplicar por -10, el resultado estará entre 0 y -4000
		return limite;
	}
	
		
}
