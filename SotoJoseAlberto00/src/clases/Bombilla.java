package clases;

public class Bombilla {
	public final static boolean ESTADO_INICIAL_DEFAULT = false;
	
	private static short bombillasTotales = 0;
	private static short bombillasEncendidas = 0;
	
	private boolean estado;
	private short vecesEncendida;
	
	public Bombilla(boolean estado) {
		this.estado = estado;
		
		if (this.estado) {
			vecesEncendida = 1;
			bombillasEncendidas++;
		} else {
			vecesEncendida = 0;
		}
		
		bombillasTotales++;
	}
	
	//Inicializa por defecto una bombilla apagada
	public Bombilla() {
		this(ESTADO_INICIAL_DEFAULT);
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public short getVecesEncendida() {
		return this.vecesEncendida;
	}
	
	public static short getBombillasTotales() {
		return bombillasTotales;
	}
	
	public static short getBombillasEncendidas() {
		return bombillasEncendidas;
	}
	
	public String toString() {
		String resultado = "Bombilla ";
		if (this.estado) {
			resultado = resultado + "encendida. ";
		} else {
			resultado = resultado + "apagada. ";
		}
		resultado = resultado + "Se ha encendido " + this.vecesEncendida;
		if (this.vecesEncendida == 1) {
			resultado = resultado + " vez";
		} else {
			resultado = resultado + " veces";
		}
		return resultado;
	}
	
	public void encender() throws IllegalArgumentException{
		if (this.estado) {
			throw new IllegalArgumentException ("la bombilla ya estaba encendida");
		}
		
		this.estado = true;
		this.vecesEncendida++;
		bombillasEncendidas++;
	}
	
	public void apagar() throws IllegalArgumentException{
		if (!this.estado) {
			throw new IllegalArgumentException ("la bombilla ya estaba apagada");
		}
		
		this.estado = false;
		bombillasEncendidas--;
	}
	
	public void conmutar() {
		if (this.estado) {
			apagar();
		} else {
			encender();
		}
	}
}
