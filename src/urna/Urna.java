package urna;

public class Urna {
	private Bola uno;
	private Bola dos;
	
	public Urna() {
		uno = new Bola();
		dos = new Bola();
	}
	
	public Urna(int color) {
		uno = new Bola(color);
		dos = new Bola(color);
	}
	
	public Urna(Bola bola1, Bola bola2) {
		uno = bola1;
		dos = bola2;
	}
	
}
