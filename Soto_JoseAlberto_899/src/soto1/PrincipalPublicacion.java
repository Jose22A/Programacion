package soto1;

import java.time.LocalDate;

public class PrincipalPublicacion {
	
	public static void main(String[] args) {
	       
        // 1. Crear libro con autor
		System.out.println (" 1 ============");
        Libro libro1;
        try {
        	libro1 = new Libro("Soto");
        	System.out.println(libro1.toString());
        } catch (IllegalStateException e) {
        	System.out.println ("Error al crear el libro: máximo de publicaciones alcanzado");
        	libro1 = null;
        }
		
        // 2. Precio 10 dias
        System.out.println (" 2 ============");
        try {
        	System.out.printf ("Precio de un préstamo de un libro por 10 dias: %.2f€\n", libro1.calcularPrecioPrestamo(10));
        } catch (IllegalStateException e) {
        	System.out.println ("El libro ya está prestado");
        }
        
        // 3. Revista por defecto
        System.out.println (" 3 ============");		
        Revista revista1;
        try {
        	revista1 = new Revista();
        	System.out.println(revista1.toString());
        } catch (IllegalStateException e) {
        	System.out.println ("Error al crear la revista: máximo de publicaciones alcanzado");
        	revista1 = null;
        }

        // 4. Precio 5 dias
        System.out.println (" 4 ============");
        try {
        	System.out.printf ("Precio de un préstamo de una revista por 5 dias: %.2f€\n", revista1.calcularPrecioPrestamo(5));
        } catch (IllegalStateException e) {
        	System.out.println ("El libro ya está prestado");
        }
		
        // 5. Modificar fecha de publicación
        System.out.println (" 5 ============");
        boolean error = true;
        int anno;
        do {
        	anno = annoAleatorio();
        	System.out.println ("Intentando cambiar el año de publicación a " + anno);
        	try {
        		libro1.setFechaPublicacion(LocalDate.of(anno, 1, 1));
        		System.out.println(libro1.toString());
        		error = false;
            } catch (IllegalArgumentException e) {
            	System.out.println ("Año no válido: reintentando con otro año...");
            }
        } while(error);
	}
	
	//annoAleatorio devuelve un tipo int entre 1940 y 1960
	public static int annoAleatorio() {
		int anno = (int)(Math.random()*21);//Numero entre 0 y 20
		anno = anno + 1940;//Numero entre 1940 y 1960
		return anno;
	}
}
