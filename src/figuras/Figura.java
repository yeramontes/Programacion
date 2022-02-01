package figuras;

import java.awt.Point;
import java.awt.Color;

public abstract class Figura {
	protected Color color;
	private Point punto;
	
	public Figura(int x, int y) {
		punto = new Point(x, y);
		this.color = Color.white;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
		
	public String toString() {
		String resultado = "\nEl centro de la figura es en las coordenadas : " + punto.getX() + " " + punto.getY();
		resultado += "\nEl area es de : " + calcularArea();
		resultado += "\nEl perimetro es de : " + calcularPerimetro();
		resultado += "\nEl color es : " + this.color;
		return resultado;
	}
}
