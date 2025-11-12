/*
 * Descripción: Manejo de métodos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 6/11/25
 */
package metodos;

public class Metodos {

	public static void main(String[] args) {
		int numero;
		boolean par;
		
		numero = 30;
		par = esPar(numero);
		System.out.println(par);
	}
	
	//EsPar calcula si un valor es par. Devuelve un tipo booleano
	public static boolean esPar(int numero) {
		boolean par;
		if (numero % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;
	}
	
	//EsImpar calcula si un valor es impar. Devuelve un tipo booleano
	public static boolean esImpar(int numero) {
		return !esPar(numero);
	}
}
