/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 18/2/2026
 * Autor: Jose Alberto Soto Mas
 */
package soto;

import java.time.LocalDate;

public class PrincipalTransportes {

	public static void main(String[] args) {
		
		
		// 1. Crea un camión con 20 tn de carga máxima.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 1 ============");
		Camion camion1;
		try {
			camion1 = new Camion(20);
			System.out.println (camion1.toString());
		} catch (IllegalArgumentException e) {
			System.out.println ("Error al crear el camión");
			camion1 = null;
		}
		
		
		//2. Calcula el precio para un transporte de 200 kms.
		// Evidencia: el precio del transporte.
		System.out.println (" 2 ============");	
		System.out.printf ("Precio de un transporte de 200km: %.2f€\n", camion1.precioTransporte(200));
		
		//3. Crea una furgoneta con el volumen máximo permitido (valor solicitado al usuario) y refrigerado (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 3 ============");	
		
		
		//4. Calcula el precio del transporte para 50 kms.
		// Evidencia: el precio del transporte.
		System.out.println (" 4 ============");	
		
		
		//5. Crea una motocicleta con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 5 ============");	
		
		
		//6. Calcula el precio de un transporte para 20 kms.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 6 ============");	
		
		
		// 7. Modifica el valor de ITV de la motocicleta a sí.
		// Evidencia: El valor de cada uno de los atributos.
		System.out.println (" 7 ============");
		
		
		// 8. Indica si la motocicleta tiene cajón de transporte.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 8 ============");	
				

		// 9. Modifica el valor de la tarifa base a la motocicleta.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 9 ============");	
		
		
		// 10. Crea un camión con todos los valores solicitados al usuario (el objeto debe ser creado por un método).
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 10 ============");
		System.out.print ("Introduce la matrícula del camión: ");
		String matricula = Entrada.cadena();
		System.out.println ("Introduce la fecha de matriculación del camión:");
		System.out.print ("Año de matriculación: ");
		int anno = Entrada.entero();
		System.out.print ("Mes de matriculación: ");
		int mes = Entrada.entero();
		System.out.print ("Dia de matriculación: ");
		int dia = Entrada.entero();
		LocalDate fechaMatriculacion = LocalDate.of(anno, mes, dia);
		boolean itvEnVigor = true;
		char caracter;
		do {
			System.out.print ("Introduce si el camión tiene la ITV en vigor (s para si, n para no): ");
			caracter = Entrada.caracter();
			if (caracter == 's') {
				itvEnVigor = true;
			}
			if (caracter == 'n') {
				itvEnVigor = false;
			}
		} while ((caracter != 's') && (caracter != 'n'));
		System.out.print ("Introduce la tarifa base del camión (en €/km): ");
		float tarifaBase = (float)Entrada.real();
		System.out.print ("Introduce la capacidad de carga del camión (en tn): ");
		float capacidadCarga = (float)Entrada.real();
		Camion camion2;
		try {
			camion2 = new Camion(matricula, fechaMatriculacion, itvEnVigor, tarifaBase, capacidadCarga);
			System.out.println (camion2.toString());
		} catch (IllegalArgumentException e) {
			System.out.println ("Error al crear el camión");
			camion2 = null;
		}
		
		// 11. Calcula el número de vehículos creados.
		// Evidencia. El número de vehículos creados.
		System.out.println (" 11 ============");
		System.out.println ("Vehículos creados: " + Vehiculo.getTotalVehiculos());
		
	}

}
