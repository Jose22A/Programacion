package soto1;

import java.time.LocalDate;

public class Revista extends Publicacion{
	public enum Periodicidad {SEMANAL, MENSUAL, SEMESTRAL};
	
	public final static Periodicidad PERIODICIDAD_DEFAULT = Periodicidad.SEMANAL;
	public final static String PAIS_PUBLICACION_DEFAULT = "España";
	
	private Periodicidad periodicidad;
	private String paisPublicacion;
	
	public Revista(String titulo, String autor, LocalDate fechaPublicacion, float precioCompra, boolean prestado, Periodicidad periodicidad, String paisPublicacion) {
		super(titulo, autor, fechaPublicacion, precioCompra, prestado);
		
		setID("R-" + getID());
		this.periodicidad = periodicidad;
		this.paisPublicacion = paisPublicacion;
	}
	
	public Revista() {
		this(TITULO_DEFAULT, AUTOR_DEFAULT, FECHA_PUBLICACION_DEFAULT, PRECIO_COMPRA_DEFAULT, PRESTADO_DEFAULT, PERIODICIDAD_DEFAULT, PAIS_PUBLICACION_DEFAULT);
	}
	
	public String toString() {
		String resultado = super.toString();
		resultado = resultado + "Periodicidad: " + getPeriodicidad() + "\n";
		resultado = resultado + "Pais de publicación: " + getPaisPublicacion();
		return resultado;
	}
	
	public Periodicidad getPeriodicidad() {
		return this.periodicidad;
	}
	
	public String getPaisPublicacion() {
		return this.paisPublicacion;
	}

	public float calcularPrecioPrestamo(int dias) throws IllegalStateException{
		if (prestado) {
			throw new IllegalStateException("revista no disponible");
		}
		float resultado = 0.5f * dias;
		if (!getPaisPublicacion().equals("España")) {
			resultado = resultado + 2;
		}
		return resultado;
	}
}
