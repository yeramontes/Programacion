package fraccion;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	public Fraccion() {
		numerador = 0;
		denominador = 0;
	}
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public Fraccion sumar(Fraccion otra) {
		if(this.denominador == otra.denominador) {
			Fraccion resultado = new Fraccion((this.denominador + otra.denominador), this.denominador);
			return resultado;
		}else {
		    int mcd = mcd(this.denominador, otra.denominador);
		    
		    int a = Math.max(this.denominador, otra.denominador);
		    int b = Math.min(this.denominador, otra.denominador);
		    
		    int denominador = (a / mcd * b);
		    
		    int numerador = (this.numerador * (denominador / this.denominador)) + (otra.numerador * (denominador / otra.denominador));
		    Fraccion resultadoSuma = new Fraccion(numerador, denominador);
		    return resultadoSuma;
			
		}
	}
	
	public Fraccion restar(Fraccion otra) {
		if(this.denominador == otra.denominador) {
			Fraccion resultado = new Fraccion((this.denominador + otra.denominador), this.denominador);
			return resultado;
		}else {
			int mcd = mcd(this.denominador, otra.denominador);
			
		    int a = Math.max(this.denominador, otra.denominador);
		    int b = Math.min(this.denominador, otra.denominador);
		    
		    int denominador = (a / mcd * b);
		    
		    int numerador = (this.numerador * (denominador / this.denominador)) - (otra.numerador * (denominador / otra.denominador));
		    Fraccion resultadoResta = new Fraccion(numerador, denominador);
		    return resultadoResta;
			
		}
	}
	
	public Fraccion multiplicar(Fraccion otra) {
		int numerador = this.numerador * otra.numerador;
		int denominador = this.denominador * otra.denominador;
		Fraccion resultado = new Fraccion(numerador, denominador);
		return resultado;
	}
	
	public Fraccion dividir(Fraccion otra) {
		int numerador = this.numerador * otra.denominador;
		int denominador = this.denominador * otra.numerador;
		Fraccion resultado = new Fraccion(numerador, denominador);
		return resultado;
	}
	
	public boolean igualQue(Fraccion otra) {
		return (this.numerador / this.denominador) == (otra.numerador / otra.denominador);
	}
	
	public boolean menorQue(Fraccion otra) {
		return (this.numerador / this.denominador) < (otra.numerador / otra.denominador);
	}
	
	public int mcd(int num1, int num2) {
		int dividendo = Math.max(num1, num2);
		int divisor = Math.min(num2, num2);
		int resto = 0;
		do {
			resto = dividendo % divisor;
			dividendo = divisor;
			divisor = resto;
		}while(divisor != 0);
		return dividendo;
	}
	
	public Fraccion clonar() {
		Fraccion clon = new Fraccion(this.numerador, this.denominador);
		return clon;
	}
	
	public String toString() {
		return this.numerador + " / " + this.denominador;
	}
}
