package operadoresBasicos;

import java.util.Scanner;

public class OperacionesConEntrada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int dato1, dato3;
		double dato2;
		System.out.print("Dame el primer dato: ");
		dato1 = teclado.nextInt();
		
		/*System.out.print("Dame el segundo dato: ");
		dato2 = teclado.nextDouble();
		System.out.print("Dame el tercer dato: ");
		dato3 = teclado.nextInt();
		*/
		
		/*double suma = dato1 + dato2;
		System.out.println("La suma es: " + suma);
		double resta = dato1 - dato2;
		System.out.println("La resta es: " + resta);
		double multi = dato1 * dato2;
		System.out.println("La multiplicación es: " + multi);
		double div = dato1 / dato2;
		System.out.println("La división es: " + div);
		int resto = dato1 % dato3;
		System.out.println("El resto es: " + resto);
		*/
		
		/*boolean dato1Mayor10, dato2Mayor10, resultado;
		dato1Mayor10 = (dato1 > 10);
		dato2Mayor10 = (dato2 > 10);
		resultado = dato1Mayor10 && dato2Mayor10;
		System.out.println(resultado);
		*/
		
		String resultado;
		resultado = (dato1 < 18) ? "Menor" : "Mayor";
		System.out.println(resultado);
	}

}
