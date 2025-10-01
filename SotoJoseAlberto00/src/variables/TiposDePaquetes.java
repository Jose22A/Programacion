/*
 * Descripción: ejemplos de variables
 * Autor: Jose Alberto Soto Mas
 * Fecha: 23/09/25
 */
package variables;

public class TiposDePaquetes {

	public static void main(String[] args) {
		byte edadAlumno; //Declaración
		edadAlumno = 0; //Inicialización
		
		byte edadProfe = 0; //Declaración e inicialización
		
		System.out.println("Valor de la variable: " + edadAlumno);
		
		double alturaAlumno, pesoAlumno;
		pesoAlumno = 92.5;
		alturaAlumno = 1.76;
		System.out.println("Peso: " + pesoAlumno + "\nAltura: " + alturaAlumno);
		
		float pesoAlumno2 = 8.3f;
		
		pesoAlumno = 94;
		System.out.println("Peso: " + pesoAlumno + "\nAltura: " + alturaAlumno);
		
		char letraDni;
		letraDni = 'B';
		
		String nombreAlumno;
		nombreAlumno = "Alberto";
		
		boolean mayorEdad = false;
	}

}
