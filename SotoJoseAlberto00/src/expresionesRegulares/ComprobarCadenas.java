package expresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComprobarCadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");//Creamos el patron
		
		String posibleDNI;
		System.out.print("Introduce tu DNI: ");
		posibleDNI = teclado.nextLine();
		//Preparamos la cadena de caracteres para comparar
		Matcher texto=patron.matcher(posibleDNI);
		//Hacemos la comparacion obteniendo el resultado
		if (texto.matches()) {
		    System.out.println("El formato del DNI es correcto.");
		} else {
		    System.out.println("El formato del DNI no es correcto.");
		}
	}

}
