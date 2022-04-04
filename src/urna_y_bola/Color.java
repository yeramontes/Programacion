package urna_y_bola;

public enum Color {
	BLANCO(255, 255, 255), NEGRO(0, 0, 0);
	int red;
	int green;
	int blue;
	
	
	private Color(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
}
