/*
 * Descripción: Manejo de objetos
 * Autor: Jose Alberto Soto Mas
 * Fecha: 20/11/25
 */
package objetos;

import java.awt.Rectangle;

public class ManipularObjetos {

	public static void main(String[] args) {
		Rectangle r1;//Declaración
		r1 = new Rectangle();
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		System.out.println(r1);
		
		Rectangle r2;
		r2 = r1;
		System.out.println(r2.toString());
		
		r2.y = 5;
		System.out.println(r1.toString());
		
		r1.setLocation(5, 5);
		System.out.println(r1.toString());
	}

}
