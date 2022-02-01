package herencias7;

public class CuentaAhorro extends CuentaBancaria {
	private int tipoInteres;
	public CuentaAhorro(String nombre, int importe, int tipoInteres) {
		super(nombre, importe);
		this.tipoInteres = tipoInteres;
	}
	
	public int getTipoInteres() {
		return this.tipoInteres;
	}
	
	public int obtenerIntereses() {
		return (tipoInteres * super.getImporte()) / 100;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo de Interes : " + tipoInteres;
	}
}
