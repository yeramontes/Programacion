package histograma;

import java.util.Arrays;

public class Histograma {
	private static final int MAX = 5;
	private static final char ASTERISCO = '*';
	private int[] valores;
	
	public Histograma() {
		valores = new int[MAX];
		inicializar();
	}
	
	private void inicializar() {
		for(int i = 0; i < valores.length; i++) {
			valores[i] = generarAleatorio();
		}
	}
	
	public static int generarAleatorio() {
		return (int)(Math.random() * 45 + 5);
	}
	
	public int[] getValores() {
		int[] valores = new int[this.valores.length];
		System.arraycopy(this.valores, 0, valores, 0, this.valores.length);
		return valores;
	}
	
	public int[] getValores2() {
		return Arrays.copyOf(this.valores, this.valores.length);
	}
}
