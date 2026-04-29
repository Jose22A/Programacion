/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 28/1/26
 */
package soto;

public class Ejercicio1 {

	public static void main(String[] args) {
		final int DIAS_TRABAJO = 5;
		final int NUM_OPERARIOS = 4;
		
		//Declaración e instanciación de arrays
		int[][] produccion = new int[NUM_OPERARIOS][DIAS_TRABAJO];
		String dias[] = new String[DIAS_TRABAJO];
		String operarios[] = new String[NUM_OPERARIOS];
		
		//Dando valores a los arrays
		dias[0] = "lunes";
		dias[1] = "martes";
		dias[2] = "miércoles";
		dias[3] = "jueves";
		dias[4] = "viernes";
		
		operarios[0] = "Juan";
		operarios[1] = "José";
		operarios[2] = "Pedro";
		operarios[3] = "Luis";
		
		for (int idOperario = 0; idOperario < NUM_OPERARIOS; idOperario++) {
			for (int numDia = 0; numDia < DIAS_TRABAJO; numDia++) {
				produccion[idOperario][numDia] = produccionAleatoria();
			}
		}
		
		System.out.print("\t");
		for (int numDia = 0; numDia < DIAS_TRABAJO; numDia++) {
			System.out.print(dias[numDia] + "\t");
		}
		System.out.println();
		for (int idOperario = 0; idOperario < NUM_OPERARIOS; idOperario++) {
			System.out.print(operarios[idOperario] + "\t");
			for (int numDia = 0; numDia < DIAS_TRABAJO; numDia++) {
				System.out.print(produccion[idOperario][numDia] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int idOperario = 0; idOperario < NUM_OPERARIOS; idOperario++) {
			System.out.println("Producción semanal de " + operarios[idOperario] + ": " + produccionSemanal(produccion, idOperario));
		}
		
		System.out.println();
		for (int numDia = 0; numDia < DIAS_TRABAJO; numDia++) {
			System.out.println("Producción media por trabajador el " + dias[numDia] + ": " + produccionMediaDiaria(produccion, numDia));
		}
		
		System.out.println();
		System.out.println("Día con la producción media por trabajador más baja: " + diaMenorProduccionMedia(produccion, dias));
	}

	// produccionAleatoria devuelve un tipo int entre 100 y 300
	public static int produccionAleatoria() {
		int produccion = 10 + (int)(Math.random()*21);
		produccion = produccion*10;
		return produccion;
	}
	
	/* produccionSemanal calcula las unidades producidas por cierto operario durante toda la semana
	 * Devuelve un tipo int
	 */
	public static int produccionSemanal(int produccion[][], int idOperario) {
		int resultado = 0;
		for (int numDia = 0; numDia < produccion[idOperario].length; numDia++) {
			resultado = resultado + produccion[idOperario][numDia];
		}
		return resultado;
	}
	
	/* produccionMediaDiaria calcula la media de las unidades producidas en cierto día por cada operario
	 * Devuelve un tipo double
	 */
	public static double produccionMediaDiaria(int[][] produccion, int numDia) {
		double resultado = 0;
		for (int idOperario = 0; idOperario < produccion.length; idOperario++) {
			resultado = resultado + produccion[idOperario][numDia];
		}
		resultado = resultado/produccion.length;
		return resultado;
	}
	
	/* diaMenorProduccionMedia calcula qué día tuvo la menor media de unidades producidas por operario
	 * Devuelve un tipo String
	 */
	public static String diaMenorProduccionMedia(int[][] produccion, String dias[]) {
		double menorProduccionMedia = produccionMediaDiaria(produccion, 0);
		int diaMenorProduccionMedia = 0;
		for (int numDia = 0; numDia < produccion[0].length; numDia++) {
			if (produccionMediaDiaria(produccion, numDia) <=  menorProduccionMedia) {
				menorProduccionMedia = produccionMediaDiaria(produccion, numDia);
				diaMenorProduccionMedia = numDia;
			}
		}
		return dias[diaMenorProduccionMedia];
	}
}
