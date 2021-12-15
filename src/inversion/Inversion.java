package inversion;

public class Inversion {
	private double cantidadInicial;
	private double tipoInteres;
	
	public Inversion(double cantidadInicial, double tipoInteres) {
		this.cantidadInicial = cantidadInicial;
		this.tipoInteres = tipoInteres;
	}

	public double getCantidadInicial() {
		return cantidadInicial;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}
	
	public double despuesDe(int a�os) {
		double cantidad = cantidadInicial;
		for(int i = 1; i <= a�os; i++) {
			cantidad += (tipoInteres * cantidad) / 100;
		}
		return cantidad;
	}
	
	public int a�osHastaObjetivo(double importeObjetivo) {
		double cantidad = cantidadInicial;
		int a�os = 0;
		while(cantidad < importeObjetivo) {
			cantidad += (tipoInteres * cantidad) / 100;
			a�os++;
		}
		return a�os;
	}
	
	public String tablaDespuesDe(int a�os) {
		String resultado = String.format("\nCantidad inicial %.2f �", cantidadInicial);
		resultado += String.format("\nInter�s anual %.2f %%", tipoInteres);
		resultado += "\nA�o\tBalance";
		for(int i = 1; i <= a�os; i++) {
			resultado += String.format("\n%d\t%.2f �", i, despuesDe(i));
		}
		return resultado;
	}
}
