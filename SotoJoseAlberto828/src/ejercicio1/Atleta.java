package ejercicio1;

public class Atleta {
	private String nombre;
	private int edad;
	private float altura;
	
	public Atleta (String nombre, int edad, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public String toString() {
		String resultado = "Nombre: " + getNombre() + " ";
		resultado = resultado + "Edad: " + getEdad() + " ";
		resultado = resultado + "Altura: " + getAltura();
		return resultado;
	}
}
