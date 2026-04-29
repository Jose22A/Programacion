/*
 * Objetivo: clase que modela al objeto de tipo Socio
 * Autor: Profe
 * Fecha: 29/04/26
 */

package soto;

import java.util.Objects;

public class Socio {
    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

    //Dos objetos Socio son iguales si tienen el mismo id
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return id == other.id;
	}

	private int id;
    private String nombre;
    private byte antiguedad; // en años

    public Socio(int id, String nombre, byte antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public String toString() {
		String resultado = "ID: " + getID() + " ";
		resultado = resultado + "Nombre: " + getNombre() + " ";
		resultado = resultado + "Antiguedad: " + getAntiguedad() + " años";
		return resultado;
	}
    
    public int getID() {
		return this.id;
	}
    
    public String getNombre() {
		return this.nombre;
	}
    
    public byte getAntiguedad() {
		return this.antiguedad;
	}
   
}
