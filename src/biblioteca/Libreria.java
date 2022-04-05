package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Libreria {
	private String nombre;
	private HashMap<String, HashSet<Libro>> libros;
	
	public Libreria(String nombre) {
		super();
		this.nombre = nombre;
		this.libros = new HashMap();
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
	
	public int cantidadLibros() {
		int cantidad = 0;
		for(String autor : libros.keySet()) {
			cantidad += libros.get(autor).size();
		}
		return cantidad;
	}
	
	public void añadirLibro(Libro l) {
		for(String autor : libros.keySet()) {
			if(autor.equals(l.getAutor())) {
				libros.get(autor).add(l);
				return;
			}
		}
	}
	
	public Libro buscarLibro(String titulo) {
		for(String autor : libros.keySet()) {
			HashSet<Libro> setLibros = libros.get(autor);
			for(Libro l : setLibros) {
				if(l.getTitulo().equals(titulo)) return l;
			}
		}
		return null;
	}
	
	public boolean tieneLibros(String autor) throws Exception {
		for(String aut : libros.keySet()) {
			if(aut.equals(autor)) return (libros.get(autor).size() > 0) ? true : false;
		}
		throw new Exception("No hay autores con ese nombre");
	}
	
	public String borrarLibros(String autor) {
		for(String aut : libros.keySet()) {
			if(aut.equals(autor)) {
				int size = libros.get(autor).size() - 1;
				libros.get(autor).clear();
				return "Se han borrado " + size + " libros";
			}
		}
		return "Este autor no tiene libros";
	}
	
	public String borrarLibrosConWhile(String autor) {
		Iterator<String> it = libros.keySet().iterator();
		while(it.hasNext()) {
			if(it.next().equals(autor)) {
				int size = libros.get(autor).size() - 1;
				libros.get(autor).clear();
				return "Se han borrado " + size + " libros";
			}
		}
		return "Este autor no tiene libros";
	}
	
	public int librosPrestados() {
		int librosPrestados = 0;
		for(String autor : libros.keySet()) {
			HashSet<Libro> setLibros = libros.get(autor);
			for(Libro libro : setLibros) {
				if(libro.getEstado() == Estado.PRESTADO) librosPrestados++;
			}
		}
		return librosPrestados;
	}
	
	public String prestarLibro(String titulo) {
		for(String autor : libros.keySet()) {
			HashSet<Libro> setLibros = libros.get(autor);
			for(Libro libro : setLibros) {
				if(libro.getTitulo().equals(titulo)) {
					if(libro.getEstado() == Estado.PRESTADO) {
						return "El libro ya esta prestado";
					}
					else {
						libro.setEstado(Estado.PRESTADO);
						libro.setFechaPrestado(obtenerFechaPrestamo());
						return null;
					}
				}
			}
		}
		return "El libro no se encuentra en la biblioteca";
	}
	
	public String devolverLibro(String titulo) {
		for(String autor : libros.keySet()) {
			HashSet<Libro> setLibros = libros.get(autor);
			for(Libro libro : setLibros) {
				if(libro.getTitulo().equals(titulo)) {
					if(libro.getEstado() == Estado.PRESTADO) {
						libro.setEstado(Estado.DISPONIBLE);
						libro.setFechaPrestado(null);
						return "Libro devuelto";
					}
					else {
						return "Eh weon de donde has sacado eso?";
					}
				}
			}
		}
		return "El libro no se encuentra en la biblioteca";
	}
	
	private String obtenerFechaPrestamo() {
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter hoy =  DateTimeFormatter.ofPattern("dd MMM yyyy");
		return fecha.format(hoy);
	}
	
}
