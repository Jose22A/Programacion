/*
 * Descripción: Manejo de clases
 * Autor: Jose Alberto Soto Mas
 * Fecha: 16/1/26
 */
package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		Articulo articulo = new Articulo();
		articulo.nombre = "Pijama";
		articulo.precio = 10;
		articulo.cuantosQuedan = 1000;
		
		System.out.println(articulo.nombre + " - Precio:" + articulo.precio + "€ - IVA:" + articulo.iva + "% - PVP:" + (articulo.precio+(articulo.precio*articulo.iva/100)) + "€");
	}

}
