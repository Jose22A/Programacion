package soto1;

import java.time.LocalDate;

public class Libro extends Publicacion{
	
	public Libro(String titulo, String autor, LocalDate fechaPublicacion, float precioCompra, boolean prestado) {
		super(titulo, autor, fechaPublicacion, precioCompra, prestado);
		
		setID("L-" + getID());
	}
	
	public Libro(String autor) {
		this(TITULO_DEFAULT, autor, FECHA_PUBLICACION_DEFAULT, PRECIO_COMPRA_DEFAULT, PRESTADO_DEFAULT);
	}
	
	public String toString() {
		String resultado = super.toString();
		return resultado;
	}

	public float calcularPrecioPrestamo(int dias) throws IllegalStateException{
		if (prestado) {
			throw new IllegalStateException("libro no disponible");
		}
		float resultado = (this.precioCompra*0.01f)*dias;
		if (dias > 10) {
			resultado = resultado * 0.95f;
		}
		return resultado;
	}

}
