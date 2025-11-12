package metodos;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double numA, numB;
		System.out.print("Introduce un número: ");
		numA = teclado.nextInt();
		System.out.print("Introduce otro número: ");
		numB = teclado.nextInt();
		
		String operador;
		System.out.print("Introduce la operación a realizar (+, -, *, /, %): ");
		do {
			operador = teclado.nextLine();
		} while (!(operador.equals("+")||operador.equals("-")||operador.equals("*")||operador.equals("/")||operador.equals("%")));
		
		double resultado = operacion(numA, numB, operador);
		System.out.println(resultado);
	}

	//Operacion calcula el resultado de la operación indicada por la variable operación entre dos números. Devuelve un tipo decimal
	public static double operacion(double numA, double numB, String operador) {
		double resultado = 0;
		switch (operador) {
			case "+":
				resultado = numA + numB;
				break;
			case "-":
				resultado = numA - numB;
				break;
			case "*":
				resultado = numA * numB;
				break;
			case "/":
				resultado = numA / numB;
				break;
			case "%":
				resultado = numA % numB;
				break;
		}
		return resultado;
	}

}
