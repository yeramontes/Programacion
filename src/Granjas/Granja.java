package Granjas;

public class Granja {
	private Granjero granjero;
	private String nombre;
	private String ubicacion;
	
	public Granja(Granjero granjero, String nombre, String ubicacion) {
		this.granjero = granjero;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public String toString() {
		/*
		 * String resultado = " "; resultado += "\nDatos de la granja"; resultado +=
		 * "\n====================="; resultado += "\nNombre: " + nombre; resultado +=
		 * "\nUbicacion:" + ubicacion; resultado += "\nGranjero:" + granjero; resultado
		 * += "\nGranjero: " + granjero.getNombre();
		 */
		return granjero.toString(); 
	}
	
}
