package cuadrado;

public class Cuadrado {
	private Punto centro;
	private double lado;
	
	public Cuadrado() {
		centro = new Punto();
		lado = 0;
	}
	
	public Cuadrado (int x, int y, double lado) {
		centro = new Punto(x, y);
		this.lado = lado;
	}
	
	public Cuadrado(Punto quePunto, double lado) {
		centro = quePunto;
		this.lado = lado;
	}

	public Punto getCentro() {
		return centro;
	}

	public double getLado() {
		return lado;
	}
	
	
	
}
