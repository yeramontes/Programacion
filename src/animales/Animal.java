package animales;

public abstract class Animal {
	private String nombre;
	private int patas;
	private Persona dueño;
	
	public Animal(String nombre, int patas, Persona dueño) {
		this.nombre = nombre;
		this.patas = patas;
		this.dueño = dueño;
	}
	
	public abstract String emitirSonido();
	
	public abstract String comer();
	
	public abstract void representacion();
	
}
