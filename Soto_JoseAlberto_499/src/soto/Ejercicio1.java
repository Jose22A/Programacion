/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 17/12/25
 */
package soto;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);//Abrimos la entrada de datos
		final int DIAS_SEMANA = 7;
		final int HORAS = 24;
		
		//Declaramos e instanciamos array
		
		int[][] consumo = {{21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36},
				{5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2},
				{39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30},
				{1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38},
				{8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4},
				{28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29},
				{2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33}};
		
		int horaMinConsumoDiario;
		String dia = "";
		for (int numDia = 0; numDia < DIAS_SEMANA; numDia++) {
			horaMinConsumoDiario = horaMinConsumoDiario(numDia, consumo);
			dia = diaNumAString(numDia);
			System.out.println("Hora con menor consumo el " + dia + ": " + horaMinConsumoDiario);
		}
		System.out.println();
		
		int diaMinConsumoHorario = diaMinConsumoHorario(consumo);
		dia = diaNumAString(diaMinConsumoHorario);
		int horaMinConsumo = horaMinConsumoDiario(diaMinConsumoHorario, consumo);
		System.out.println("Día y hora con menor consumo: " + dia + " a las " + horaMinConsumo);
		
		int diaMaxConsumo = diaMaxConsumo(consumo);
		dia = diaNumAString(diaMaxConsumo);
		System.out.println("Día con mayor consumo: " + dia);
		System.out.println();
		
		int horaSupera20Diario;
		for (int numDia = 0; numDia < DIAS_SEMANA; numDia++) {
			horaSupera20Diario = horaSupera20Diario(numDia, consumo);
			dia = diaNumAString(numDia);
			System.out.println("Primera hora con consumo mayor a 20 el " + dia + ": " + horaSupera20Diario);
		}
	}
	
	/*horaSupera20Diario calcula la primera hora en el que el consumo eléctrico supera 20 en el día indicado por numDia.
	 *Devuelve un tipo int
	 */
	public static int horaSupera20Diario(int numDia, int[][] consumo) {
		int hora = 0;
		while((hora < consumo[numDia].length)&&(consumo[numDia][hora] <= 20)) {//Deja de entrar al bucle cuando llega al final del array o el consumo en el dia y hora indicados sea mayor a 20
			hora++;
		}
		return hora;
	}
	
	/*horaMinConsumoDiario calcula la última hora en el que hubo menor consumo eléctrico en el día indicado por numDia.
	 *Devuelve un tipo int
	 */
	public static int horaMinConsumoDiario(int numDia, int[][] consumo) {
		int horaMinConsumo = 0;
		int minimoConsumo = consumo[numDia][0];
		for (int hora = 0; hora < consumo[numDia].length; hora++) {
			if (consumo[numDia][hora] <= minimoConsumo) {//Si se encuentra otra hora con igual consumo, se devolverá la última de ellas 
				horaMinConsumo = hora;
				minimoConsumo = consumo[numDia][hora];
			}
		}
		return horaMinConsumo;
	}
	
	/*diaMinConsumoHorario calcula el día en el que hubo menor consumo eléctrico en una hora.
	 *Devuelve un tipo int
	 */
	public static int diaMinConsumoHorario(int[][] consumo) {
		int numDiaMinConsumo = 0;
		int horaMinConsumo = horaMinConsumoDiario(0, consumo);
		int minimoConsumo = consumo[0][horaMinConsumo];
		for (int numDia = 0; numDia < consumo.length; numDia++) {
			horaMinConsumo = horaMinConsumoDiario(numDia, consumo);
			if (consumo[numDia][horaMinConsumo] < minimoConsumo) {
				numDiaMinConsumo = numDia;
				minimoConsumo = consumo[numDia][horaMinConsumo];
			}
		}
		return numDiaMinConsumo;
	}
	
	/*diaMaxConsumo calcula el día en el que hubo mayor consumo eléctrico en todo el día.
	 *Devuelve un tipo int
	 */
	public static int diaMaxConsumo(int[][] consumo) {
		int numDiaMaxConsumo = 0;
		int maximoConsumo = sumaConsumoDiario(0, consumo);
		for (int numDia = 0; numDia < consumo.length; numDia++) {
			if (sumaConsumoDiario(numDia, consumo) > maximoConsumo) {
				numDiaMaxConsumo = numDia;
				maximoConsumo = sumaConsumoDiario(numDia, consumo);
			}
		}
		return numDiaMaxConsumo;
	}
	
	/*sumaConsumoDiario calcula el consumo eléctrico en el día indicado por numDia.
	 *Devuelve un tipo int
	 */
	public static int sumaConsumoDiario(int numDia, int[][] consumo) {
		int suma = 0;
		for (int hora = 0; hora < consumo[numDia].length; hora++) {
			suma = suma + consumo[numDia][hora];
		}
		return suma;
	}
	
	//diaNumAString devuelve un tipo String con el día de la semana
	public static String diaNumAString(int numDia) {
		String dia = "";
		switch (numDia) {
			case 0:
				dia = "lunes";
				break;
			case 1:
				dia = "martes";
				break;
			case 2:
				dia = "miércoles";
				break;
			case 3:
				dia = "jueves";
				break;
			case 4:
				dia = "viernes";
				break;
			case 5:
				dia = "sábado";
				break;
			case 6:
				dia = "domingo";
				break;
			}
		return dia;
	}
}
