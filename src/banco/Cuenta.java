package banco;

public class Cuenta {
	private String nombre;
	private int numCuenta;
	private int balance;
	
	public Cuenta(String nombre, int balance) {
		this.nombre = nombre;
		this.balance = balance;
		this.numCuenta = (int) (Math.random() * 100 + 1);
	}
	
	public Cuenta(String nombre, int numCuenta, int balance) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.balance = balance;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCuenta [nombre=");
		builder.append(nombre);
		builder.append(", numCuenta=");
		builder.append(numCuenta);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
	
	
}
