package casa;

import java.time.LocalDate;

public class Casa {
	private int superficie;
	private int precio;
	private int habitaciones;
	private int baños;
	private LocalDate fecha;
	
	public Casa(int superficie, int precio, int habitaciones, int baños) {
		this.superficie = superficie;
		this.precio = precio;
		this.habitaciones = habitaciones;
		this.baños = baños;
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

	public int getBaños() {
		return baños;
	}

	public void setBaños(int baños) {
		this.baños = baños;
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
		resultado += "\nBaños : " + this.baños;
		resultado += "\nFecha publicacion : " + fecha.toString();
		return resultado;
	}
	
}
