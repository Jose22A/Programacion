package tratarExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamientoExcepciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int entero;
		boolean error;
		do {
			System.out.print("Introduce un entero: ");
			try {
				entero = teclado.nextInt();
				error = false;
			} catch (InputMismatchException ex1) {
				System.out.println("No es un entero.");
				error = true;
				entero = 0;
				teclado.nextLine();
			}
		} while (error);
		System.out.println("El entero es: " + entero);
	}

}
