package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
	public final static int CODIGO_MAX = 99999999;
	public final static int CODIGO_RESET = 00000001;
	
	private static int anyo = LocalDate.now().getYear();
	private static int codigo = 00000001;
	
	private String id;
	private LocalDate fechaUso;
	private LocalTime horaUso;
	
	public Ticket(LocalDate fechaUso) throws IllegalArgumentException, IllegalStateException {
		if (LocalDate.now().getYear() == anyo+1) {
			anyo++;
			codigo = CODIGO_RESET;
		}
		
		if (fechaUso.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("la fecha de uso no puede ser anterior a la fecha actual");
		}
		if (fechaUso.getYear() != anyo) {
			throw new IllegalArgumentException("la fecha de uso debe estar dentro del año actual");
		}
		if (codigo > CODIGO_MAX) {
			throw new IllegalStateException("máximo de tickets alcanzado para este año");
		}
		
		this.id = anyo + "-" + codigoToString();
		this.fechaUso = fechaUso;
		this.horaUso = null;
		codigo++;
	}
	
	public Ticket() {
		this(LocalDate.now());
	}
	
	public String getId() {
		return this.id;
	}
	
	public LocalDate getFecha() {
		return this.fechaUso;
	}
	
	public boolean isUsado() {
		boolean resultado;
		if (this.horaUso == null) {
			resultado = false;
		} else {
			resultado = true;
		}
		return resultado;
	}
	
	public boolean isFinDeSemana() {
		boolean resultado;
		if ((this.fechaUso.getDayOfWeek().getValue() == 6)||this.fechaUso.getDayOfWeek().getValue() == 7) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public void usar() throws IllegalArgumentException {
		if (fechaUso.isEqual(LocalDate.now())) {
			throw new IllegalArgumentException("la fecha de uso debe ser la fecha actual");
		}
		if (isUsado()) {
			throw new IllegalArgumentException("el ticket ya ha sido usado");
		}
		
		this.horaUso = LocalTime.now();
	}
	
	public String toString() {
		String resultado = "{ID: " + this.id + ", ";
		resultado = resultado + "Fecha: " + this.fechaUso.getDayOfMonth() + "/" + this.fechaUso.getMonth() + "/" + this.fechaUso.getYear() + ", ";
		resultado = resultado + "Usado: ";
		if (isUsado()) {
			resultado = resultado + this.horaUso.toString() + "}";
		} else {
			resultado = resultado + " no}";
		}
		return resultado;
	}
	
	private String codigoToString() {
		int tamanoCodigo = String.valueOf(codigo).length();
		int cerosNecesarios = 8-tamanoCodigo;
		String resultado = "";
		for (int contador = 1; contador <= cerosNecesarios; contador++) {
			resultado = resultado + "0";
		}
		resultado = resultado + codigo;
		return resultado;
	}
}
