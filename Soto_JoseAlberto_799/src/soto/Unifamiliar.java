package soto;

import java.time.LocalDate;

public class Unifamiliar extends Vivienda{
	public final static int AREA_DEFAULT = 100;
	public final static boolean PATIO_DEFAULT = false;
	
	private int area;//En m^2
	private boolean patio;
	
	public Unifamiliar(LocalDate fechaConstruccion, String direccion, boolean disponible, int area, boolean patio) throws IllegalArgumentException{
		super(fechaConstruccion, direccion, disponible);
		
		if (area < 0) {
			throw new IllegalArgumentException("área no válida");
		}
		
		this.area = area;
		this.patio = patio;
	}
	
	public Unifamiliar(int area) {
		this(FECHA_CONSTRUCCION_DEFAULT, DIRECCION_DEFAULT, DISPONIBLE_DEFAULT, area, PATIO_DEFAULT);
	}
	
	public Unifamiliar() {
		this(FECHA_CONSTRUCCION_DEFAULT, DIRECCION_DEFAULT, DISPONIBLE_DEFAULT, AREA_DEFAULT, PATIO_DEFAULT);
	}
	
	public String toString() {
		String resultado = super.toString();
		resultado = resultado + "Area: " + getArea() + "m2\n";
		resultado = resultado + "Tiene patio: ";
		if (getPatio()) {
			resultado = resultado + "si ";
		} else {
			resultado = resultado + "no ";
		}
		return resultado;
	}
	
	public int getArea() {
		return this.area;
	}
	
	public boolean getPatio() {
		return this.patio;
	}
	
	public boolean esGrande() {
		boolean resultado;
		if ((area > 100)&&(patio)) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public float calcularPrecio(int precioPorM2) {
		if (!disponible) {
			throw new IllegalStateException("Vivienda no disponible");
		}
		
		float resultado = precioPorM2 * area * area * 1.5f;
		if (patio) {
			resultado = resultado * 1.25f;
		}
		return resultado;
	}

}
