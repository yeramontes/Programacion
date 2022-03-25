package ut5_tarea18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorStock {
	private List<Producto> productos;
	
	public GestorStock() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void añadirProductos(Producto p) {
		for (Producto i : productos) {
			if(i.getId() == p.getId()) return;
		}
		productos.add(p);
	}
	
	public String escribirDetallesProductos() {
		StringBuilder sb = new StringBuilder();
		Iterator<Producto> it = productos.iterator();
		while(it.hasNext()) {
			sb.append(it.toString());
		}
		return sb.toString();
	}
	
	public String escribirDetallesProductos1() {
		StringBuilder sb = new StringBuilder();
		for(Producto p : productos) {
			sb.append(p.toString());
		}
		return sb.toString();
	}
	
	public String escribirDetallesProductos2() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < productos.size(); i++) {
			sb.append(productos.get(i).toString());
		}
		return sb.toString();
	}
	
	public Producto localizarProducto(int id) {
		for (Producto p : productos) {
			if(p.getId() == id) return p;
		}
		return null;
	}
	
	// Esto es un metodo sobrecargado, lo diferencia el parametro que se le pasa.
	
	public Producto localizarProducto(String nombre) {
		for (Producto p : productos) {
			if(p.getNombre().equals(nombre)) return p;
		}
		return null;
	}
	
	public int cantidadEnStock(int id) {
		for (Producto p : productos) {
			if(p.getId() == id) return p.getStock();
		}
		return -1;
	}
	
	public String recibirProducto(int id, int cantidad) {
		for (Producto p : productos) {
			if(p.getId() == id) {
				p.incrementarCantidad(cantidad);
				return null;
			}
		}
		return "No se ha encontrado ningun producto con ese id";
	}
	
	public String escribirMenorQue(int minimo) {
		StringBuilder sb = new StringBuilder();
		for (Producto p : productos) {
			if(p.getStock() < minimo) sb.append(p.toString());
		}
		return sb.toString();
	}
}
