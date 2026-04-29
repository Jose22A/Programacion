/*
 * Descripción: Manejo de clases
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/1/26
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		Rectangulo rectangulo1, rectangulo2;
		
		rectangulo1 = new Rectangulo();
		rectangulo1.x1 = 0;
		rectangulo1.y1 = 0;
		rectangulo1.x2 = 5;
		rectangulo1.y2 = 5;
		
		rectangulo2 = new Rectangulo();
		rectangulo2.x1 = 7;
		rectangulo2.y1 = 9;
		rectangulo2.x2 = 2;
		rectangulo2.y2 = 3;
		
		System.out.println("Rectangulo 1:");
		System.out.println("Coordenadas: (" + rectangulo1.x1 + "," + rectangulo1.y1 + ")(" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
		System.out.println("Perímetro: " + (2*Math.abs(rectangulo1.x1 - rectangulo1.x2) + 2*Math.abs(rectangulo1.y1 - rectangulo1.y2)));
		System.out.println("Área: " + (Math.abs(rectangulo1.x1 - rectangulo1.x2) * Math.abs(rectangulo1.y1 - rectangulo1.y2)));
		
		System.out.println("Rectangulo 2:");
		System.out.println("Coordenadas: (" + rectangulo2.x1 + "," + rectangulo2.y1 + ")(" + rectangulo2.x2 + "," + rectangulo2.y2 + ")");
		System.out.println("Perímetro: " + (2*Math.abs(rectangulo2.x1 - rectangulo2.x2) + 2*Math.abs(rectangulo2.y1 - rectangulo2.y2)));
		System.out.println("Área: " + (Math.abs(rectangulo2.x1 - rectangulo2.x2) * Math.abs(rectangulo2.y1 - rectangulo2.y2)));
	}

}
