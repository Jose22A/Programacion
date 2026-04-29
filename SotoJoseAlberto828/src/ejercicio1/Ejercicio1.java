package ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList <Atleta> lista = new ArrayList <Atleta>();
		String nombre;
		for (int contador = 0; contador < 20; contador++) {
			nombre = "" + contador;
			lista.add(new Atleta(nombre, edadAleatoria(), alturaAleatoria()));
			System.out.println(lista.get(contador).toString());
		}
		
		int sumaEdad = 0;
		float sumaAltura = 0;
		for (Atleta atleta: lista) {
			sumaEdad = sumaEdad + atleta.getEdad();
			sumaAltura = sumaAltura + atleta.getAltura();
		}
		float mediaAltura = sumaAltura/20;
		System.out.println("Media de las edades: " + (sumaEdad/20));
		System.out.println("Media de las alturas: " + mediaAltura);
		
		int numMenorEdad = 0;
		int numMayorEdad = 0;
		for (Atleta atleta: lista) {
			if (atleta.getEdad() < 18) {
				numMenorEdad++;
			} else if (atleta.getEdad() >= 18) {
				numMayorEdad++;
			}
		}
		System.out.println("Atletas menores de edad: " + numMenorEdad);
		System.out.println("Atletas menores de edad: " + numMayorEdad);
		
		System.out.println("Atletas más altos que la media:");
		for (Atleta atleta: lista) {
			if (atleta.getAltura() > mediaAltura) {
				System.out.print(atleta.getNombre() + " ");
			}
		}
	}
	
	//edadAleatoria devuelve un tipo int entre 10 y 60
	public static int edadAleatoria() {
		int edad = (int)(10+Math.random()*51);
		return edad;
	}
	
	//alturaAleatoria devuelve un tipo int entre 1.50 y 1.80
	public static float alturaAleatoria() {
		float altura = (int) (150+Math.random()*31);
		altura = altura / 100;
		return altura;
	}
}
