package figuras;

public class Rectangulo extends Figura {
	private double base,altura;
	public Rectangulo(int x, int y, int base, int altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return this.base * 2 + this.altura * 2;
	}
}
