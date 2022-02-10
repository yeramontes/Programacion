package pkgaeropuerto.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aerolinea implements Comparable<Aerolinea>{
	private String nombre;
	private List<Vuelo> vuelos;
	
	public Aerolinea(String nombre, Vuelo vuelo) {
		this.nombre = nombre;
		this.vuelos = new ArrayList<Vuelo>();
		vuelos.add(vuelo);
	}
	
	public Aerolinea(String nombre) {
		this.nombre = nombre;
		this.vuelos = new ArrayList<Vuelo>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public List<Vuelo> getArrayList() {
		return vuelos;
	}
	
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}
	
	public void addVuelo(Vuelo vuelo) {
		vuelos.add(vuelo);
	}

	@Override
	public int compareTo(Aerolinea o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n" + this.nombre + "\n====================");
		Collections.sort(vuelos);
		Collections.reverse(vuelos);
		for(Vuelo x : vuelos) {
			sb.append(x.toString());
		}
		
		return sb.toString();
	}
}
