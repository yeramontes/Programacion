package herencias7;

public class CuentaCorriente extends CuentaBancaria {
	private int recargo;
	private int importeMinimo;
	public CuentaCorriente(String nombre, int importe, int importeMinimo, int recargo) {
		super(nombre, importe);
		this.importeMinimo = importeMinimo;
		this.recargo = recargo;
	}
	
	public int getRecargo() {
		return this.recargo;
	}
	
	public int getImporteMinimo() {
		return this.importeMinimo;
	}
	
	public int obtenerRecargo() {
		recargo = (super.getImporte() < importeMinimo) ? 1000 : 0;
		return recargo;
	}
}
