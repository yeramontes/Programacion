package urna;

public class Bola {
	private int color;
	private static final int BLANCO = 0;
	private static final int NEGRO = 1;
	
	public Bola() {
		color = 1;
	}
	
	public Bola(int color) {
		this.color = color;
	}
	
	public String getColor() {
		if(color == 0) return "BLANCO";else if(color == 1) return "NEGRO";
		return "transparente";
	}
	
	public boolean esNegra() {
		if(color == 1) return true; else return false;
	}
	
	public String toString() {
		return "Es de Color " + color;
	}
}
