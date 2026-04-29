package soto;

import java.time.LocalDate;

public class Camion extends Vehiculo {
	public final static float CAPACIDAD_CARGA_MIN = 0.5f;
	public final static float CAPACIDAD_CARGA_MAX = 20f;
	
	private float capacidadCarga;
	
	public Camion(String matricula, LocalDate fechaMatriculacion, boolean itvEnVigor, float tarifaBase, float capacidadCarga) throws IllegalArgumentException {
		super(matricula, fechaMatriculacion, itvEnVigor, tarifaBase);
		
		if ((capacidadCarga < CAPACIDAD_CARGA_MIN) || (capacidadCarga > CAPACIDAD_CARGA_MAX)) {
			throw new IllegalArgumentException("capacidad de carga no válida");
		}
		
		this.capacidadCarga = capacidadCarga;
	}
	
	public Camion(float capacidadCarga) throws IllegalArgumentException {
		this(MATRICULA_DEFAULT, FECHA_MATRICULACION_DEFAULT, ITV_EN_VIGOR_DEFAULT, TARIFA_BASE_DEFAULT, capacidadCarga);
	}
	
	public String toString() {
		String resultado = super.toString() + "\n";
		resultado = resultado + "Capacidad de carga: " + getCapacidadCarga() + "tn";
		return resultado;
	}

	public float getCapacidadCarga() {
		return this.capacidadCarga;
	}
	
	public float precioTransporte(float km) {
		return this.tarifaBase * km * 5;
	}
}
