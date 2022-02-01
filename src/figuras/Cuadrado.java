package figuras;

public class Cuadrado extends Figura {
	private double lado;
	public Cuadrado(int x, int y, int lado) {
		super(x, y);
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	
	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}
}
