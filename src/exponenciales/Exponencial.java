package exponenciales;

public class Exponencial {
	private int base;
	private int exponente;
	
	public Exponencial(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}
	
	public Exponencial(Exponencial numero) {
		this.base = numero.base;
		this.exponente = numero.exponente;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}
	
	private int potencia(int a, int b) {
		int potencia = a;
		if(b >= 0) {
			if(b == 0) {
				potencia = 1;
			}else {
				for(int i = 1; i < b; i++) {
					potencia *= a;
				}
			}
		}
		return potencia;
	}
	
	public double valorExponencial() {
		
	}
	
}
