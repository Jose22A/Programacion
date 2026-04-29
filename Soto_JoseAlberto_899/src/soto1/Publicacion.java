package soto1;

import java.time.LocalDate;

public abstract class Publicacion {
	public final static int NUM_CODIGO_MAX = 999;
	
	public final static String TITULO_DEFAULT = "sin título";
	public final static String AUTOR_DEFAULT = "sin autor";
	public final static LocalDate FECHA_PUBLICACION_DEFAULT = LocalDate.of(2000, 1, 1);
	public final static float PRECIO_COMPRA_DEFAULT = 0;
	public final static boolean PRESTADO_DEFAULT = false;
	
	private static int codigoSiguiente = 000;
	
	protected String id;
	protected String titulo;
	protected String autor;
	protected LocalDate fechaPublicacion;
	protected float precioCompra;
	protected boolean prestado;
	
	public Publicacion(String titulo, String autor, LocalDate fechaPublicacion, float precioCompra, boolean prestado) throws IllegalArgumentException, IllegalStateException{
		if ((fechaPublicacion.isBefore(LocalDate.of(1950, 1, 1)))||(fechaPublicacion.isAfter(LocalDate.now())) ) {
			throw new IllegalArgumentException("fecha de publicación no válida");
		}
		if (precioCompra < 0) {
			throw new IllegalArgumentException("precio de compra no válido");
		}
		if (codigoSiguiente > NUM_CODIGO_MAX) {
			throw new IllegalStateException("máximo de publicaciones alcanzado");
		}
		
		this.id = idToString(fechaPublicacion.getYear());
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.precioCompra = precioCompra;
		this.prestado = prestado;
		
		codigoSiguiente++;
	}
	
	public Publicacion(String autor) {
		this(TITULO_DEFAULT, autor, FECHA_PUBLICACION_DEFAULT, PRECIO_COMPRA_DEFAULT, PRESTADO_DEFAULT);
	}
	
	public Publicacion() {
		this(TITULO_DEFAULT, AUTOR_DEFAULT, FECHA_PUBLICACION_DEFAULT, PRECIO_COMPRA_DEFAULT, PRESTADO_DEFAULT);
	}
	
	public String toString() {
		String resultado = "ID: " + getID() + " ";
		resultado = resultado + "Titulo: " + getTitulo() + " ";
		resultado = resultado + "Autor: " + getAutor() + "\n";
		resultado = resultado + "Fecha de publicación: " + getFechaPublicacion().toString() + "\n";
		resultado = resultado + "Precio de compra: " + getPrecioCompra() + "\n";
		resultado = resultado + "Prestado: ";
		if (getPrestado()) {
			resultado = resultado + "si ";
		} else {
			resultado = resultado + "no ";
		}
		return resultado;
	}
	
	public String getID() {
		return this.id;
	}
	
	protected void setID(String id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public LocalDate getFechaPublicacion() {
		return this.fechaPublicacion;
	}
	
	public void setFechaPublicacion(LocalDate fechaPublicacion) throws IllegalArgumentException{
		if ((fechaPublicacion.isBefore(LocalDate.of(1950, 1, 1)))||(fechaPublicacion.isAfter(LocalDate.now())) ) {
			throw new IllegalArgumentException("fecha de publicación no válida");
		}
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public float getPrecioCompra() {
		return this.precioCompra;
	}
	
	public boolean getPrestado() {
		return this.prestado;
	}
	
	public abstract float calcularPrecioPrestamo(int dias);
	
	protected String idToString(int annoPublicacion) {
		//Primera parte del id: los dos últimos dígitos del año
		int codigoAnno = annoPublicacion % 100;
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
