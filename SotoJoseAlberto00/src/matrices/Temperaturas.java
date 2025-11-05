/*
 * Descripción: Manejo de arrays bidimensionales
 * Autor: Jose Alberto Soto Mas
 * Fecha: 22/10/25
 */
package matrices;

public class Temperaturas {

	public static void main(String[] args) {
		final int MESES = 12;
		final int DIAS = 30;
		
		int[][] temperaturas;//Declaración del array
		temperaturas = new int[DIAS][MESES];//Instanciamos array
		String[] meses;
		meses = new String[MESES];
		
		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Julio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "Noviembre";
		meses[11] = "Diciembre";
		
		for (int dia = 0; dia < DIAS; dia++) {
			for (int mes = 0; mes < MESES; mes++) {
				temperaturas[dia][mes] = (int) Math.round(Math.random()*40);//Inicializamos los elementos del array a un valor entre 0 y 40
			}
		}
		
		for (int dia = 0; dia < DIAS; dia++) {
			for (int mes = 0; mes < MESES; mes++) {
				System.out.print(temperaturas[dia][mes] + " ");
			}
			System.out.println("");
		}
		
		int tempMax, tempMin, diaTempMax, mesTempMax = 0;
		for (int mes = 0; mes < MESES; mes++) {
			tempMax = temperaturas[0][mes];//Iniciamos tempMax a la temperatura del primer día del mes
			tempMin = temperaturas[0][mes];//Iniciamos tempMin a la temperatura del primer día del mes
			diaTempMax = 0;
			for (int dia = 0; dia < DIAS; dia++) {
				if (temperaturas[dia][mes] > tempMax) {
					tempMax = temperaturas[dia][mes];
					diaTempMax = dia;
				}
				if (temperaturas[dia][mes] < tempMin) {
					tempMin = temperaturas[dia][mes];
				}
			}
			System.out.println("Temperatura máxima del mes " + mes + ": " + tempMax);
			System.out.println("Temperatura mínima del mes " + mes + ": " + tempMin);
			System.out.println("Dia de temperatura máxima del mes " + mes + ": " + diaTempMax);
			System.out.println("Amplitud térmica del mes " + mes + ": " + (tempMax-tempMin));
		}
		System.out.println("Mes de temperatura máxima: " + mesTempMax);
		
		int dia;
		for (int mes = 0; mes < MESES; mes++) {
			dia = 0;
			while ((temperaturas[dia][mes] >= 10) && (dia < DIAS)) {//Sale cuando la temperatura sea menor de 10 o se acabe el mes
				dia = dia + 1;
			}
			System.out.println("Primer día del mes " + mes + " con temperatura inferior a 10: " + dia);
		}
	}

}
