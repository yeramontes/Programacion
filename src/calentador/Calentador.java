package calentador;

public class Calentador {
	
	private int temperatura;
	private int minimo;
	private int maximo;
	private int incremento;

	public Calentador(int minimo, int maximo) {
		this.temperatura = 15;
		this.minimo = minimo;
		this.maximo = maximo;
		this.incremento = 5;
	}
	
	public void calentar(int incremento) {
		if((temperatura + incremento) <= maximo) {
			temperatura += incremento;
		}
	}
	
	public void enfriar(int incremento) {
		if((temperatura - incremento) >= minimo) {
			temperatura -= incremento;
		}
	}
	
	public void setIncremento(int incremento) {
		if(incremento >= 0) {
			this.incremento = incremento;
		}
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	
	
}
