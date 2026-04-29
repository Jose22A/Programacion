package conjuntos;

import java.util.HashSet;

public class Conjuntos {

	public static void main(String[] args) {
		HashSet<Integer> conjunto=new HashSet<>();
		
		int entero;
		for (int contador = 1; contador <= 100; contador++) {
			entero = Integer.valueOf((int) (Math.random()*101));
			conjunto.add(entero);
		}
		System.out.println("Tamaño del conjunto: " + conjunto.size());
		System.out.println(conjunto);
	}

}
