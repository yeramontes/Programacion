package ut5_tarea18;

public class Producto {
	private int id;
	private String nombre;
	private int stock;
	
	public Producto(String nombre, int stock) {
		this.id = (int)(Math.random() * 100 + 1);
		this.nombre = nombre;
		this.stock = stock;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getId() {
		return id;
	}



	public void incrementarCantidad() {
		stock++;
	}
	
	public void incrementarCantidad(int cantidad) {
		stock += cantidad;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [\nid=");
		builder.append(id);
		builder.append("\nnombre=");
		builder.append(nombre);
		builder.append("\nstock=");
		builder.append(stock);
		builder.append("\n]");
		return builder.toString();
	}
	
	
}
