package casa;

import java.time.LocalDate;

public class Casa {
	private int superficie;
	private int precio;
	private int habitaciones;
	private int ba�os;
	private LocalDate fecha;
	
	public Casa(int superficie, int precio, int habitaciones, int ba�os) {
		this.superficie = superficie;
		this.precio = precio;
		this.habitaciones = habitaciones;
		this.ba�os = ba�os;
		this.fecha = LocalDate.now();
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getBa�os() {
		return ba�os;
	}

	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		String resultado = "";
		resultado += "\nSuperficie : " + this.superficie;
		resultado += "\nPrecio : " + this.precio;
		resultado += "\nHabitaciones : " + this.habitaciones;
		resultado += "\nBa�os : " + this.ba�os;
		resultado += "\nFecha publicacion : " + fecha.toString();
		return resultado;
	}
	
}
