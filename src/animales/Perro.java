package animales;

public class Perro extends Animal {
	
	private String lugarFavorito;
	
	public Perro(String nombre, int patas, Persona dueño, String lugar) {
		super(nombre, patas, dueño);
		this.lugarFavorito = lugar;
	}
	
	@Override
	public String emitirSonido() {
		return "Guau Guau";
	}
	
	public String comer() {
		return "Comer hueso";
	}

	@Override
	public void representacion() {
		
	}
}
