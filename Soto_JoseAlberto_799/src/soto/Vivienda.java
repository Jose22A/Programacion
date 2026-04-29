package soto;

import java.time.LocalDate;

public abstract class Vivienda {
	public final static int NUM_CODIGO_MAX = 999;
	
	public final static LocalDate FECHA_CONSTRUCCION_DEFAULT = LocalDate.of(2000, 1, 1);
	public final static String DIRECCION_DEFAULT = "Calle Rio Mesa";
	public final static boolean DISPONIBLE_DEFAULT = true;
	
	private static int codigoSiguiente = 000;
	private static int totalViviendas = 0;
	
	protected final String id;
	
	protected LocalDate fechaConstruccion;
	protected String direccion;
	protected boolean disponible;
	
	public Vivienda(LocalDate fechaConstruccion, String direccion, boolean disponible) throws IllegalStateException{
		if (codigoSiguiente > NUM_CODIGO_MAX) {
			throw new IllegalStateException("máximo de viviendas alcanzado");
		}
		
		this.id = idToString(fechaConstruccion.getYear());
		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
		this.disponible = disponible;
		
		totalViviendas++;
		codigoSiguiente++;
	}
	
	public Vivienda() {
		this(FECHA_CONSTRUCCION_DEFAULT, DIRECCION_DEFAULT, DISPONIBLE_DEFAULT);
	}
	
	public String toString() {
		String resultado = "ID: " + getID() + " ";
		resultado = resultado + "Fecha de construcción: " + getFechaConstruccion().toString() + "\n";
		resultado = resultado + "Dirección: " + getDireccion() + "\n";
		resultado = resultado + "Disponible: ";
		if (getDisponible()) {
			resultado = resultado + "si ";
		} else {
			resultado = resultado + "no ";
		}
		return resultado;
	}
	
	public String getID() {
		return this.id;
	}
	
	public LocalDate getFechaConstruccion() {
		return this.fechaConstruccion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public boolean getDisponible() {
		return this.disponible;
	}
	
	public static int getTotalViviendas() {
		return totalViviendas;
	}
	
	public abstract float calcularPrecio(int precioPorM2);
	
	private String idToString(int annoConstruccion) {
		//Primera parte del id: los dos últimos dígitos del año
		int codigoAnno = annoConstruccion % 100;
		String resultado = rellenaCeros(codigoAnno, 2) + "-";
		//Segunda parte del id: un número de 3 dígitos
		resultado = resultado + rellenaCeros(codigoSiguiente, 3);
		return resultado;
	}
	
	//rellenaCeros añade ceros a la izquierda hasta que el número tenga la longitud indicada por "tamano"
	private String rellenaCeros(int num, int tamano) {
		String resultado = "";
		int tamanoNum = String.valueOf(num).length();
		int cerosNecesarios = tamano-tamanoNum;
		for (int contador = 1; contador <= cerosNecesarios; contador++) {
			resultado = resultado + "0";
		}
		resultado = resultado + num;
		return resultado;
	}
}
