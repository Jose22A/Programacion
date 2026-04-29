package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alumno {
	public enum NivelIngles {A1, A2, B1, B2, C1, C2};
	
	public final static short MAX_ALUMNOS = 100;
	public final static short MAX_ALUMNOS_GRUPO = 30;
	public final static short MIN_ALUMNOS_GRUPO = 10;
	public final static LocalTime HORA_MAXIMA = LocalTime.of(22, 00);
	
	public final static LocalDate FECHA_NACIMIENTO_DEFAULT = LocalDate.EPOCH;
	public final static float PESO_DEFAULT = 150;
	public final static float ALTURA_DEFAULT = 1.70f;
	public final static byte NUM_HERMANOS_DEFAULT = 0;
	public final static LocalTime HORA_MAXIMA_DEFAULT = HORA_MAXIMA;
	public final static NivelIngles NIVEL_INGLES_DEFAULT = NivelIngles.A1;
	
	private static short numAlumnos = 0;
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private float peso;
	private float altura;
	private boolean mayorEdad;
	private byte numHermanos;
	private LocalTime horaMaxima;
	private NivelIngles nivelIngles;
	
	public Alumno (String dni, String nombre, String apellidos, LocalDate fechaNacimiento, float peso, float altura, byte numHermanos,
			LocalTime horaMaxima, NivelIngles nivelIngles) throws IllegalArgumentException {
		if ((dni == null)||(dni.isEmpty())) {
			throw new IllegalArgumentException ("dni null o vacio");
		}
		if (!dni.matches("[0-9]{8}[A-Z]")) {
			throw new IllegalArgumentException ("dni no válido, error en el formato");
		}
		if ((nombre == null)||(nombre.isEmpty())) {
			throw new IllegalArgumentException ("nombre null o vacio");
		}
		if ((apellidos == null)||(apellidos.isEmpty())) {
			throw new IllegalArgumentException ("apellidos null o vacio");
		}
		if (fechaNacimiento == null) {
			throw new IllegalArgumentException ("fecha de nacimiento null");
		}
		if (fechaNacimiento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException ("fecha de nacimiento no válida");
		}
		if (peso < 0) {
			throw new IllegalArgumentException ("peso no válido");
		}
		if (altura < 0) {
			throw new IllegalArgumentException ("altura no válida");
		}
		if (numHermanos < 0) {
			throw new IllegalArgumentException ("número de hermanos no válido");
		}
		if (horaMaxima == null) {
			throw new IllegalArgumentException ("hora máxima null");
		}
		if (horaMaxima.isAfter(HORA_MAXIMA)) {
			throw new IllegalArgumentException ("hora máxima no válida");
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.altura = altura;
		this.numHermanos = numHermanos;
		this.horaMaxima = horaMaxima;
		this.nivelIngles = nivelIngles;
		
		if (LocalDate.now().getYear() - fechaNacimiento.getYear() >= 18) {
			this.mayorEdad = true;
		} else {
			this.mayorEdad = false;
		}
		
		numAlumnos++;
	}
	
	public Alumno (String dni, String nombre, String apellidos) throws IllegalArgumentException {
		this(dni, nombre, apellidos, FECHA_NACIMIENTO_DEFAULT, PESO_DEFAULT, ALTURA_DEFAULT, NUM_HERMANOS_DEFAULT,
				HORA_MAXIMA_DEFAULT, NIVEL_INGLES_DEFAULT);
	}
}
