package figuras;

public class Triangulo extends Figura{
	private double base, altura;
	public Triangulo(int x, int y, int base, int altura) {
		super(x, y);
		this.base =  base; 
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return base * altura / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return altura * 2 + base;
	}
}
