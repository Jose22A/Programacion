package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);//Inicialización de la entrada de datos
		
		float nota;//Declaración de variables
		System.out.print("Introduce la nota: ");
		nota = teclado.nextFloat();//Petición y asignación de un dato introducido en el teclado
		
		if (nota < 5) {
			System.out.println("INSUFICIENTE");
		} else {
			if (nota < 6) {
				System.out.println("SUFICIENTE");
			} else {
				if (nota < 7) {
					System.out.println("BIEN");
				} else {
					if (nota < 9) {
						System.out.println("NOTABLE");
					} else {
						System.out.println("SOBRESALIENTE");
					}
				}
			}
		}
	}

}
