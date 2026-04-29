package soto;

import java.time.LocalDate;

public class Apartamento extends Vivienda{
	public final static int AREA_DEFAULT = 100;
	public final static float DISTANCIA_CENTRO_DEFAULT = 1;
	public final static LocalDate FECHA_ULTIMA_REFORMA_DEFAULT = LocalDate.now();
	
	private int area;//En m^2
	private float distanciaCentro;//En km
	private LocalDate fechaUltimaReforma;
	
	public Apartamento(LocalDate fechaConstruccion, String direccion, boolean disponible, int area, float distanciaCentro, LocalDate fechaUltimaReforma) throws IllegalArgumentException{
		super(fechaConstruccion, direccion, disponible);
		
		if (fechaUltimaReforma.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("fecha de la última reforma no válida");
		}
		
		this.area = area;
		this.distanciaCentro = distanciaCentro;
		this.fechaUltimaReforma = fechaUltimaReforma;
	}
	
	public Apartamento(float distanciaCentro, LocalDate fechaUltimaReforma) {
		this(FECHA_CONSTRUCCION_DEFAULT, DIRECCION_DEFAULT, DISPONIBLE_DEFAULT, AREA_DEFAULT, distanciaCentro, fechaUltimaReforma);
	}
	
	public Apartamento() {
		this(FECHA_CONSTRUCCION_DEFAULT, DIRECCION_DEFAULT, DISPONIBLE_DEFAULT, AREA_DEFAULT, DISTANCIA_CENTRO_DEFAULT, FECHA_ULTIMA_REFORMA_DEFAULT);
	}
	
	public String toString() {
		String resultado = super.toString();
		resultado = resultado + "Area: " + getArea() + "m2\n";
		resultado = resultado + "Distancia al centro: " + getDistanciaCentro() + "km\n";
		resultado = resultado + "Fecha de la última reforma: " + getFechaUltimaReforma().toString();
		return resultado;
	}
	
	public int getArea() {
		return this.area;
	}
	
	public float getDistanciaCentro() {
		return this.distanciaCentro;
	}
	
	public LocalDate getFechaUltimaReforma() {
		return this.fechaUltimaReforma;
	}
	
	public float calcularPrecio(int precioPorM2) throws IllegalStateException{
		if (!disponible) {
			throw new IllegalStateException("Vivienda no disponible");
		}
		
		float resultado = precioPorM2 * area * area;
		if (distanciaCentro < 2) {
			resultado = resultado * 1.15f;
		}
		return resultado;
	}
}
