package soto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class PrincipalSocio {

	public static void main(String[] args) {
		// 1. Importar socios
		System.out.println (" 1 ============");
		HashSet <Socio> listaSocios=new HashSet<Socio>();
		File f = new File ("src\\soto\\socios.txt");
		int id;
		String nombre;
		byte antiguedad;
		try {
			Scanner lectorArchivo = new Scanner(f);			
			/*lectorArchivo.useDelimiter(";");
			while (lectorArchivo.hasNext()) {
				id = lectorArchivo.nextInt();
				nombre = lectorArchivo.next();
				antiguedad = lectorArchivo.nextByte();
			}*/
			lectorArchivo.close();
		} catch (FileNotFoundException e) {
			System.out.println ("Error: archivo no encontrado");
		}
		
		//Por si no funciona/no consigo hacerlo: insertando de forma manual
		
		Socio nuevoSocio;
		nuevoSocio = new Socio(1,"Ana Garcia",(byte) 5);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(2,"Pedro Lopez",(byte) 12);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(3,"Maria Ruiz",(byte) 2);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(4,"Juan Perez",(byte) 8);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(1,"Ana Garcia",(byte) 5);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(5,"Lucia Sanz",(byte) 15);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(6,"Carlos Diaz",(byte) 1);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(7,"Elena Meza",(byte) 10);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(2,"Pedro Lopez",(byte) 12);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(8,"Raul Gil",(byte) 3);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(9,"Sofia Cano",(byte) 20);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(10,"Hugo Vera",(byte) 4);
        listaSocios.add(nuevoSocio);
        nuevoSocio = new Socio(11,"Irene Orta",(byte) 7);
        listaSocios.add(nuevoSocio);
		for (Socio socio: listaSocios) {
        	System.out.println(socio.toString());
        }
		System.out.println("Número de socios en la colección: " + listaSocios.size());
		
        // 2. Añadir socio (10; Hugo Vera; 4)
        System.out.println (" 2 ============");
        Socio socio1 = new Socio(10, "Hugo Vera", (byte) 4);
        listaSocios.add(socio1);
        for (Socio socio: listaSocios) {
        	System.out.println(socio.toString());
        }
        System.out.println("Número de socios en la colección: " + listaSocios.size());
        
        // 3. Añadir socio (15; Hugo Vera; 4)
        System.out.println (" 3 ============");
        Socio socio2 = new Socio(15, "Hugo Vera", (byte) 4);
        listaSocios.add(socio2);
        for (Socio socio: listaSocios) {
        	System.out.println(socio.toString());
        }
        System.out.println("Número de socios en la colección: " + listaSocios.size());

        // 4. ¿Existe id 5?
        System.out.println (" 4 ============");
        
		
        // 5. Número de socios con nombre Ana
        System.out.println (" 5 ============");
        int numAnas = 0;
        System.out.println("Socios con nombre Ana:");
        for (Socio socio: listaSocios) {
        	if (socio.getNombre().contains("Ana")) {
        		System.out.println(socio.toString());
        		numAnas++;
        	}
        }
        System.out.println("Número de socios con nombre Ana: " + numAnas);
	}

}
