package animales;

public abstract class Animal {
	private String nombre;
	private int patas;
	private Persona due�o;
	
	public Animal(String nombre, int patas, Persona due�o) {
		this.nombre = nombre;
		this.patas = patas;
		this.due�o = due�o;
	}
	
	public abstract String emitirSonido();
	
	public abstract String comer();
	
	public abstract void representacion();
	
}
