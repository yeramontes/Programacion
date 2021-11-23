package calculadora;

public class Calculadora {
	private int cantidad;
	private int suma;
	private int maximo;
	private int minimo;
	public Calculadora() {
		cantidad = 0;
		suma = 0;
		maximo = 0;
		minimo = 0;
	}
	public int getCantidad() {
		return cantidad;
	}
	public int getMaximo() {
		return maximo;
	}
	public int getMinimo() {
		return minimo;
	}
	
	public int getSuma() {
		return suma;
	}
	
	public void introducirNumero(int numero) {
		cantidad++;
		suma += numero;
		if(maximo == 0 || numero > maximo) {
			maximo = numero;
		}else if(minimo == 0 || numero < minimo) {
			minimo = numero;
		}
	}
	
	public double getMedia() {
		
		return (double)(suma)/(double)(cantidad);
	}
	
}
