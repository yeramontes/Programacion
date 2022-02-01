package figuras;

public class Circulo extends Figura {
	private double radio;
	public Circulo(int x, int y, int radio) {
		super(x, y);
		this.radio = radio;
	}
	
	@Override
	public double calcularPerimetro() {
		return Math.PI * 2 * this.radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
}
