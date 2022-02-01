package herencias7;

public class CuentaBancaria {
	private int importe;
	private String nombre;
	
	public CuentaBancaria(String nombre, int importe) {
		this.nombre = nombre;
		this.importe = importe;
	}

	public int getImporte() {
		return importe;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void ingresar(int cantidad) {
		this.importe += cantidad;
	}
	
	public void reintegrar(int cantidad) {
		this.importe -= cantidad;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + "\nImporte: " + this.importe;
	}
	
}
