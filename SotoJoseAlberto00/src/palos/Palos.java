package palos;

public class Palos {
	public enum Palo {OROS, COPAS, BASTOS, ESPADAS};

	public static void main(String[] args) {
		Palo palo1 = Palo.OROS, palo2 = Palo.COPAS, palo3 = Palo.BASTOS, palo4 = Palo.ESPADAS;
		System.out.println("PALOS DE LA BARAJA ESPAÑOLA");
		System.out.println("Palo 1: " + palo1);
		System.out.println("Palo 2: " + palo2);
		System.out.println("Palo 3: " + palo3);
		System.out.println("Palo 4: " + palo4);
	}

}
