package urna_y_bola;

import java.util.Random;

public class Bola {
	private Color color;
	
	public Bola() {
		Random rd = new Random();
		if(rd.nextInt(2) == 0) color = Color.BLANCO;
		else color = Color.NEGRO;
	}
	
	public Bola(Color c) {
		this.color = c;
	}
	
	public int getColor() {
		return color.ordinal();
	}
	
	public String getColorString() {
		return color.name();
	}
	
	public String toString() {
		return "Bola de color " + color.name();
	}
	
	public boolean esBlanca() {
		return color == Color.BLANCO;
	}
	
	public boolean esNegra() {
		return color == Color.NEGRO;
	}
}
