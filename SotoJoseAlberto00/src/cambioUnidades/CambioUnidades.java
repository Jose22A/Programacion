package cambioUnidades;

import java.util.Scanner;

public class CambioUnidades {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		double metros, dm, cm, mm, pulgadas, yardas, pies;
		
		System.out.print("Introduzca la longitud en metros que desea transformar: ");
		metros = teclado.nextDouble();

		dm = metros * 10;
		cm = metros * 100;
		mm = metros * 1000;
		pulgadas = cm / 2.54;
		pies = pulgadas / 12;
		yardas = pies / 3;
		
		System.out.println("RESULTADO");
		System.out.println("---------");
		System.out.println("");
		System.out.println("SISTEMA INTERNACIONAL");
		System.out.println("---------------------");
		System.out.println("La medida " + metros + " en metros son:");
		System.out.println(dm + " decímetros");
		System.out.println(cm + " centímetros");
		System.out.println(mm + " milímetros");
		System.out.println("SISTEMA ANGLOSAJÓN");
		System.out.println("------------------");
		System.out.println("La medida " + metros + " en metros son:");
		System.out.println(pulgadas + " pulgadas");
		System.out.println(pies + " pies");
		System.out.println(yardas + " yardas");
		}
	
}
