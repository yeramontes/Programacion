package cafeteria;

public class Cafeteria {
	
	private int capacidadMaxima;
	private int capacidadActual;
	public Cafeteria() {
		capacidadMaxima = 1000;
		capacidadActual = 0;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCapacidadActual() {
		return capacidadActual;
	}
	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	public void llenarCafetera() {
		capacidadActual = capacidadMaxima;
	}
	
	public void servirTaza(int cantidad) {
		
		if(cantidad <= capacidadActual) {
			capacidadActual -= cantidad;
		}else {
			capacidadActual = 0;
		}
	}
	
	public void vaciarCafetera() {
		capacidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		if((capacidadActual + cantidad) <= capacidadMaxima & (cantidad > 0)) {
			capacidadActual += cantidad;
		}
	}
	
}
