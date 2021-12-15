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
	
	public double despuesDe(int años) {
		double cantidad = cantidadInicial;
		for(int i = 1; i <= años; i++) {
			cantidad += (tipoInteres * cantidad) / 100;
		}
		return cantidad;
	}
	
	public int añosHastaObjetivo(double importeObjetivo) {
		double cantidad = cantidadInicial;
		int años = 0;
		while(cantidad < importeObjetivo) {
			cantidad += (tipoInteres * cantidad) / 100;
			años++;
		}
		return años;
	}
	
	public String tablaDespuesDe(int años) {
		String resultado = String.format("\nCantidad inicial %.2f €", cantidadInicial);
		resultado += String.format("\nInterés anual %.2f %%", tipoInteres);
		resultado += "\nAño\tBalance";
		for(int i = 1; i <= años; i++) {
			resultado += String.format("\n%d\t%.2f €", i, despuesDe(i));
		}
		return resultado;
	}
}
