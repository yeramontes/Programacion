package vehiculo;
import java.awt.Color;

public abstract class Vehiculo {
	private int velocidad;
	private Color color;
	
	public Vehiculo() {
		this.velocidad = 0;
		this.color = Color.white;
	}
	
	public Vehiculo(int velocidad, Color color) {
		this.velocidad = velocidad;
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void acelerar(int incremento) {
		this.velocidad += incremento;
	}
	
	public void decelerar(int decremento) {
		this.velocidad -= decremento;
	}
	
	public void parar() {
		this.velocidad = 0;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nVehiculo [velocidad=");
		builder.append(velocidad);
		builder.append("\nColor=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
}
