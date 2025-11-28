package soto;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		final int NUM_PROVINCIAS = 8;
		final int DIAS = 16;
		
		String[] provincias;//Declaración del array
		provincias = new String[NUM_PROVINCIAS];//Instanciamos array
		
		int[][] ciberataques;
		ciberataques = new int[NUM_PROVINCIAS][DIAS];
		
		provincias = ("Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla");
		ciberataques[0] = {0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22};
		ciberataques[1] = {24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29};
		ciberataques[2] = {17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32};
		ciberataques[3] = {2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32};
		ciberataques[4] = {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3};
		ciberataques[5] = {18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36};
		ciberataques[6] = {1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64};
		ciberataques[7] = {7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0};
		
		int diaMasCiberataquesProvincial, diaMasCiberataquesTotal;
		String provinciaMasCiberataques;
		for (int numProvincia = 0; numProvincia < NUM_PROVINCIAS; numProvincia++) {
			diaMasCiberataquesProvincial = diaMasCiberataquesProvincial(numProvincia, ciberataques);
			System.out.println("Día con más ciberataques en " + provincias[numProvincia] + ": " + (diaMasCiberataquesProvincial+1));
		}
		
		for (int dia = 0; dia < DIAS; dia++) {
			provinciaMasCiberataques = provinciaMasCiberataques(dia, ciberataques, provincias);
			System.out.println("Provincia con más ciberataques el día " + (dia+1) + ": " + provinciaMasCiberataques);
		}
		
		diaMasCiberataquesTotal = diaMasCiberataquesTotal(ciberataques);
		System.out.println("Día con más ciberataques en toda Andalucía: " + (diaMasCiberataquesTotal+1));
		
		int dia, numProvincia;
		String provincia;
		boolean comprobarProvincia;
		do {
			System.out.print("Introduce un día (entre 1 y 16): ");
			dia = teclado.nextInt();
		} while ((dia < 1)||(dia > 16));
		teclado.nextLine();//Linea extra para evitar asignar un retorno de carro a la siguente variable
		do {
			System.out.print("Introduce una provincia (Almería, Cádiz, Córdoba, Granada, Huelva, Jaén, Málaga, Sevilla): ");
			provincia = teclado.nextLine();
			comprobarProvincia = false;
			numProvincia = 0;
			do {
				if (provincia.equals(provincias[numProvincia])) {
					comprobarProvincia = true;
				} else {
					numProvincia++;
				}
			} while ((numProvincia < NUM_PROVINCIAS)&&(!comprobarProvincia));
		} while (!comprobarProvincia);
		
		boolean huboAtaque = ataqueRegistrado(ciberataques, dia, numProvincia);
		if (huboAtaque) {
			System.out.println("Se han registrado ataques en la provincia y día indicados");
		} else {
			System.out.println("No se han registrado ataques en la provincia y día indicados");
		}
	}

	/*diaMasCiberataquesProvincial calcula el día en el que hubo más ciberataques en la provincia indicada por numProvincia.
	 *Devuelve un tipo int
	 */
	public static int diaMasCiberataquesProvincial(int numProvincia, int[][] ciberataques) {
		int diaMaxCiber = 0;
		int maximoCiberataques = ciberataques[numProvincia][0];
		for (int dia = 0; dia < ciberataques[numProvincia].length; dia++) {
			if (ciberataques[numProvincia][dia] > maximoCiberataques) {
				diaMaxCiber = dia;
				maximoCiberataques = ciberataques[numProvincia][dia];
			}
		}
		return diaMaxCiber;
	}
	
	/*provinciaMasCiberataques calcula la provincia en la que hubo más ciberataques en el día indicado.
	 *Devuelve un tipo String
	 */
	public static String provinciaMasCiberataques(int dia, int[][] ciberataques, String[] provincias) {
		int codigoProvinciaMaxCiber = 0;
		int maximoCiberataques = ciberataques[0][dia];
		for (int numProvincia = 0; numProvincia < ciberataques.length; numProvincia++) {
			if (ciberataques[numProvincia][dia] > maximoCiberataques) {
				codigoProvinciaMaxCiber = numProvincia;
				maximoCiberataques = ciberataques[numProvincia][dia];
			}
		}
		String provincia = provincias[codigoProvinciaMaxCiber];
		return provincia;
	}
	
	/*diaMasCiberataquesTotal calcula el día en el que hubo más ciberataques en toda Andalucía.
	 *Devuelve un tipo int
	 */
	public static int diaMasCiberataquesTotal(int[][] ciberataques) {
		int diaMaxCiber = 0;
		int maximoCiberataques = totalCiberataques(0, ciberataques);
		for (int dia = 0; dia < ciberataques[0].length; dia++) {
			if (totalCiberataques(dia, ciberataques) > maximoCiberataques) {
				diaMaxCiber = dia;
				maximoCiberataques = totalCiberataques(dia, ciberataques);
			}
		}
		return diaMaxCiber;
	}
	
	/*totalCiberataques calcula cuantos ciberataques hubo en toda Andalucía el día indicado.
	 *Devuelve un tipo int
	 */
	public static int totalCiberataques(int dia, int[][] ciberataques) {
		int numCiberataques = 0;
		for (int numProvincia = 0; numProvincia < ciberataques.length; numProvincia++) {
			numCiberataques = numCiberataques + ciberataques[numProvincia][dia];
		}
		return numCiberataques;
	}
	
	/*ataqueRegistrado averigua si hubo algún ciberataque hubo en la provincia y día indicados.
	 *Devuelve un tipo boolean
	 */
	public static boolean ataqueRegistrado(int[][] ciberataques, int dia, int numProvincia) {
		boolean huboAtaque;
		if (ciberataques[numProvincia][dia] > 0) {
			huboAtaque = true;
		} else {
			huboAtaque = false;
		}
		return huboAtaque;
	}
}
