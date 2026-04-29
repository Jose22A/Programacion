package soto;

import java.time.LocalDate;

public class PrincipalVivienda {
    
	public static void main(String[] args) {
       
        // 1. Apartamento por defecto
		System.out.println (" 1 ============");
        Apartamento apartamento1;
        try {
        	apartamento1 = new Apartamento();
        	System.out.println(apartamento1.toString());
        } catch (IllegalStateException e1) {
        	System.out.println ("Error al crear el apartamento: máximo de viviendas alcanzado");
        	apartamento1 = null;
        } catch (IllegalArgumentException e2) {
        	System.out.println ("Error al crear el apartamento: fecha de la última reforma no válida");
        	apartamento1 = null;
        }
		
        // 2. Precio 1500€/m2
        System.out.println (" 2 ============");
        try {
        	System.out.printf ("Precio de un apartamento a 1500€/m2: %.2f€\n", apartamento1.calcularPrecio(1500));
        } catch (IllegalStateException e) {
        	System.out.println ("El apartamento no está a la venta");
        }
        
        // 3. Apartamento con datos usuario
		System.out.println (" 3 ============");
		System.out.print ("Introduce la distancia al centro (en km): ");
		float distanciaCentro = (float) Entrada.real();
		System.out.println ("Introduce la fecha de la última reforma:");
		System.out.print ("Año: ");
		int anno = Entrada.entero();
		System.out.print ("Mes: ");
		int mes = Entrada.entero();
		System.out.print ("Dia: ");
		int dia = Entrada.entero();
		LocalDate fechaUltimaReforma = LocalDate.of(anno, mes, dia);
		
        Apartamento apartamento2;
        try {
        	apartamento2 = new Apartamento(distanciaCentro, fechaUltimaReforma);
        	System.out.println(apartamento2.toString());
        } catch (IllegalStateException e1) {
        	System.out.println ("Error al crear el apartamento: máximo de viviendas alcanzado");
        	apartamento2 = null;
        } catch (IllegalArgumentException e2) {
        	System.out.println ("Error al crear el apartamento: fecha de la última reforma no válida");
        	apartamento2 = null;
        }

        // 4. Precio 800€/m2
        System.out.println (" 4 ============");
        try {
        	System.out.printf ("Precio de un apartamento a 800€/m2: %.2f€\n", apartamento2.calcularPrecio(800));
        } catch (IllegalStateException e) {
        	System.out.println ("El apartamento no está a la venta");
        }
		
        // 5. Unifamiliar por defecto
        System.out.println (" 5 ============");
        Unifamiliar unifamiliar1;
        try {
        	unifamiliar1 = new Unifamiliar();
        	System.out.println(unifamiliar1.toString());
        } catch (IllegalStateException e1) {
        	System.out.println ("Error al crear el apartamento: máximo de viviendas alcanzado");
        	unifamiliar1 = null;
        } catch (IllegalArgumentException e2) {
        	System.out.println ("Error al crear el apartamento: área no válida");
        	unifamiliar1 = null;
        }
		
        // 6. Unifamiliar con m2 usuario
        System.out.println (" 6 ============");
        System.out.print ("Introduce el area (en m2): ");
		int area = Entrada.entero();
        Unifamiliar unifamiliar2;
        try {
        	unifamiliar2 = new Unifamiliar(area);
        	System.out.println(unifamiliar2.toString());
        } catch (IllegalStateException e1) {
        	System.out.println ("Error al crear el apartamento: máximo de viviendas alcanzado");
        	unifamiliar2 = null;
        } catch (IllegalArgumentException e2) {
        	System.out.println ("Error al crear el apartamento: área no válida");
        	unifamiliar2 = null;
        }

        // 7. Es grande?
        System.out.println (" 7 ============");
        if (unifamiliar2.esGrande()) {
        	System.out.println ("La vivienda es grande");
        } else {
        	System.out.println ("La vivienda no es grande");
        }
        
        // 8. Modificar disponible
        
        // 9. Precio 1100€/m2
		
        // 10. Modificar patio
        
		
        // 11. Total viviendas
        System.out.println (" 11 ============");
		System.out.println ("Viviendas creadas: " + Vivienda.getTotalViviendas());
		
    }
}