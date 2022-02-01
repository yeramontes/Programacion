package animales;

public abstract class Animal {
	protected String nombre;
	protected int patas;
	protected Persona dueño;
	
	public Animal(String nombre, int patas, Persona dueño) {
		this.nombre = nombre;
		this.patas = patas;
		this.dueño = dueño;
	}
	
	public abstract String emitirSonido();
	
	public abstract String comer();
	
	public abstract void representacion();
	
}
