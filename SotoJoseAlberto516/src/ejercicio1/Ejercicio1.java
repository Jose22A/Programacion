/*
 * Descripción: Manejo de objetos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/12/25
 */
package ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		//Apartado 1: Declaración de variables
		CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
		
		//Apartado 2: Creación de cuentas
		//2.1: Cuenta con fecha no válida (01/09/2027)
		LocalDate fecha;
		try {
			fecha = LocalDate.of(2027, 9, 1);
			cuentaPrivada = new CuentaBancaria(200, fecha);
			System.out.printf("Cuenta privada: %s\n",cuentaPrivada.toString());
		} catch(DateTimeException e1) {
			System.out.printf("Error al crear la fecha: fecha no válida\n");
			cuentaPrivada = new CuentaBancaria();
		} catch(IllegalArgumentException e2) {
			System.out.printf("Error al crear la cuenta: parámetros no válidos\n");
			cuentaPrivada = new CuentaBancaria();
		}
		//2.2: Cuenta con saldo no válido (-200)
		try {
			cuentaPrivada = new CuentaBancaria(-200);
			System.out.printf("Cuenta privada: %s\n",cuentaPrivada.toString());
		} catch(IllegalArgumentException e) {
			System.out.printf("Error al crear la cuenta: saldo no válido\n");
			cuentaPrivada = new CuentaBancaria();
		}
		//2.3: Cuenta privada con 1000 euros, creada el 1 de julio de 2021 y -200 de límite de descubierto
		try {
			fecha = LocalDate.of(2021, 7, 1);
			cuentaPrivada = new CuentaBancaria(1000, fecha, -200);
			System.out.printf("Cuenta privada: %s\n",cuentaPrivada.toString());
		} catch(DateTimeException e1) {
			System.out.printf("Error al crear la fecha: fecha no válida\n");
			cuentaPrivada = new CuentaBancaria();
		} catch(IllegalArgumentException e2) {
			System.out.printf("Error al crear la cuenta: parámetros no válidos\n");
			cuentaPrivada = new CuentaBancaria();
		}
		//2.4: Cuenta conjunta con 200 euros y creada el 1 de julio de 2021
		try {
			fecha = LocalDate.of(2021, 7, 1);
			cuentaConjunta = new CuentaBancaria(200, fecha);
			System.out.printf("Cuenta conjunta: %s\n",cuentaConjunta.toString());
		} catch(DateTimeException e1) {
			System.out.printf("Error al crear la fecha: fecha no válida\n");
			cuentaConjunta = new CuentaBancaria();
		} catch(IllegalArgumentException e2) {
			System.out.printf("Error al crear la cuenta: parámetros no válidos\n");
			cuentaConjunta = new CuentaBancaria();
		}
		//2.5: Cuenta familiar con valores por omisión
		cuentaFamiliar = new CuentaBancaria();
		System.out.printf("Cuenta familiar: %s\n",cuentaFamiliar.toString());
		
		//Apartado 3: Información de la cuenta privada
		System.out.printf("Cuenta privada:\n");
		System.out.printf("Id: %d\n",cuentaPrivada.getId());
		System.out.printf("Fecha de creación: %s\n",cuentaPrivada.getFechaCreacion());
		System.out.printf("Límite de descubierto: %.2f\n",cuentaPrivada.getLimiteDescubierto());
		System.out.printf("Está embargada: %s\n",cuentaPrivada.isEmbargada());
		System.out.printf("Está en descubierto: %s\n",cuentaPrivada.isDescubierta());
		System.out.printf("Número de días que lleva la cuenta abierta: %s\n",cuentaPrivada.getDiasCuenta());
		
		//Apartado 4: Operaciones sobre cuentas
		//4.1: Ingresar 100 euros en la cuenta familiar
		try {
			cuentaFamiliar.ingresar(100);
		} catch(IllegalArgumentException e1) {
			System.out.printf("Error al ingresar dinero: cantidad no válida\n");
		} catch(IllegalStateException e2) {
			System.out.printf("Error al ingresar dinero: la cantidad a ingresar excede el saldo máximo\n");
		}
		//4.2: Extraer 100 euros de la cuenta conjunta
		try {
			cuentaConjunta.extraer(100);
		} catch(IllegalArgumentException e1) {
			System.out.printf("Error al extraer dinero: cantidad no válida\n");
		} catch(IllegalStateException e2) {
			System.out.printf("Error al extraer dinero: la cantidad a extraer excede el límite de descubierto\n");
		}
		//4.3: Transferir 1100.00 euros de la cuenta privada a la familiar
		try {
			cuentaPrivada.transferir(1100, cuentaFamiliar);
		} catch(IllegalArgumentException e1) {
			System.out.printf("Error al transferir dinero: cuenta y/o cantidad no válidas\n");
		} catch(IllegalStateException e2) {
			System.out.printf("Error al transferir dinero: la cantidad a transferir excede el límite de descubierto de la cuenta origen,\n"
					+ "o excede el saldo máximo de la cuenta destino");
		}
		
		//Apartado 5: Estado final de las cuentas
		System.out.printf("Cuenta privada: %s\n",cuentaPrivada.toString());
		System.out.printf("Cuenta conjunta: %s\n",cuentaConjunta.toString());
		System.out.printf("Cuenta familiar: %s\n",cuentaFamiliar.toString());
	}
}
