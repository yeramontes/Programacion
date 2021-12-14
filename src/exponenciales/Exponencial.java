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
	
	private double potencia(int a, int b) {
		return Math.pow(a, b);
	}
	
	public double valorExponencial() {
		return potencia(this.base, this.exponente);
	}
	
	public Exponencial multiplicar(Exponencial otro) {
		if(this.base == otro.base) {
			Exponencial resultado = new Exponencial(this.base, (this.exponente + otro.exponente));
			return resultado;
		}else {
			Exponencial resultado = new Exponencial((this.base * otro.base), this.exponente);
			return resultado;
		}
	}
	
	public Exponencial dividir(Exponencial otro) {
		if(this.base == otro.base) {
			Exponencial resultado = new Exponencial(this.base, (this.exponente - otro.exponente));
			return resultado;
		} else {
			Exponencial resultado = new Exponencial((this.base / otro.base), this.exponente);
			return resultado;
		}
	}
	
	public Exponencial elevar(int n) {
		Exponencial resultado = new Exponencial(this.base, (this.exponente * n));
		return resultado;
	}
	
	public String toString() {
		String resultado = "";
		resultado += "Base: " + this.base;
		resultado += "\tExponente: " + this.exponente;
		resultado += "\tValor: " + valorExponencial();
		return resultado;
	}
	
}
