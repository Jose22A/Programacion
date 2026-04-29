package soto;

import java.time.LocalDate;

public class Vehiculo {
	public final static LocalDate FECHA_MATRICULACION_MIN = LocalDate.of(2000, 1, 1);
	public final static int NUM_CODIGO_MAX = 999;
	public final static int NUM_CODIGO_RESET = 001;
	
	public final static String MATRICULA_DEFAULT = "7624 BBY";
	public final static LocalDate FECHA_MATRICULACION_DEFAULT = LocalDate.now();
	public final static boolean ITV_EN_VIGOR_DEFAULT = false;
	public final static float TARIFA_BASE_DEFAULT = 1.5f;
	
	private static int codigoSiguiente = 001;
	private static int totalVehiculos = 0;
	
	protected final String id;
	
	protected String matricula;
	protected LocalDate fechaMatriculacion;
	protected boolean itvEnVigor;
	protected float tarifaBase;
	
	public Vehiculo(String matricula, LocalDate fechaMatriculacion, boolean itvEnVigor, float tarifaBase) throws IllegalArgumentException{
		if (fechaMatriculacion.isBefore(FECHA_MATRICULACION_MIN)) {
			throw new IllegalArgumentException("fecha de matriculación no válida");
		}
		
		this.id = idToString(fechaMatriculacion.getYear());
		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.itvEnVigor = itvEnVigor;
		this.tarifaBase = tarifaBase;
		
		totalVehiculos++;
		codigoSiguiente++;
	}
	
	public Vehiculo(){
		this(MATRICULA_DEFAULT, FECHA_MATRICULACION_DEFAULT, ITV_EN_VIGOR_DEFAULT, TARIFA_BASE_DEFAULT);
	}
	
	public String toString() {
		String resultado = "ID: " + getID() + " ";
		resultado = resultado + "Matrícula: " + getMatricula() + "\n";
		resultado = resultado + "Fecha de matriculación: " + getFechaMatriculacion().toString() + "\n";
		resultado = resultado + "ITV en vigor: ";
		if (getItvEnVigor()) {
			resultado = resultado + "si ";
		} else {
			resultado = resultado + "no ";
		}
		resultado = resultado + "Tarifa base: " + getTarifaBase() + "€/km";
		return resultado;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public LocalDate getFechaMatriculacion() {
		return this.fechaMatriculacion;
	}
	
	public boolean getItvEnVigor() {
		return this.itvEnVigor;
	}
	
	public float getTarifaBase() {
		return this.tarifaBase;
	}
	
	public static int getTotalVehiculos() {
		return totalVehiculos;
	}
	
	private String idToString(int annoMatriculacion) {
		String resultado = "" + (annoMatriculacion-2000) + "-"; //Primera parte del id: los dos últimos dígitos del año
		//Segunda parte del id: un número de 3 dígitos
		int tamanoCodigo = String.valueOf(codigoSiguiente).length();
		int cerosNecesarios = 3-tamanoCodigo;
		for (int contador = 1; contador <= cerosNecesarios; contador++) {
			resultado = resultado + "0";
		}
		resultado = resultado + codigoSiguiente;
		return resultado;
	}
}
