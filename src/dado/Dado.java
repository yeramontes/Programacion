package dado;

public class Dado {
	public int valor;
	
	public int lanzar() {
		valor = (int)((Math.random() * (6 - 1)) + 1);
		return valor;
	}
	
	public int getValor() {
		return valor;
	}
}
